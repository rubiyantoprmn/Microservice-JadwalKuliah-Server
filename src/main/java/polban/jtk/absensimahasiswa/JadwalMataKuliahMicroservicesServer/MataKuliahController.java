package polban.jtk.absensimahasiswa.JadwalMataKuliahMicroservicesServer;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matakuliah")
public class MataKuliahController {
	
protected Logger logger = Logger.getLogger(MataKuliahController.class.getName());
	
	@Autowired    
	MataKuliahRepository repository;
	
	

	@RequestMapping(method = RequestMethod.GET)
	public List<MataKuliah> findAll()
	{
		//logger.info("kelas-microservice all() invoked");
		//List<Kelas> kelas = KelasRepository.getAllKelas();
		//logger.info("kelas-microservice all() found: " + kelas.size());
		//return kelas.toArray(new Kelas[kelas.size()]);
		List<MataKuliah> mk  = repository.findAll();
		return mk;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public MataKuliah ById(@RequestParam("kd_mk") long id)
	{
		//logger.info("kelas-microservice byId() invoked: " + id);
		//Kelas kelas = KelasRepository.getKelas(id);
		//logger.info("kelas-microservice byId() found: " + kelas);
		Long kd_mk = id;
		MataKuliah mk = repository.findOne(kd_mk);
		return mk;
	}
	
	@RequestMapping(value ="/deletebyid/{id}", method = RequestMethod.DELETE)
	public String deleteById(@RequestParam("kd_mk") long id)
	{
		repository.delete(id);
		
		return "Delete done";
	}

}
