package polban.jtk.absensimahasiswa.JadwalMataKuliahMicroservicesServer;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jadwal")
public class JadwalController {
	
protected Logger logger = Logger.getLogger(JadwalController.class.getName());
	
	@Autowired    
	JadwalRepository repository;
	

	@RequestMapping(method = RequestMethod.GET)
	public List<Jadwal> findAll()
	{
		//logger.info("kelas-microservice all() invoked");
		//List<Kelas> kelas = KelasRepository.getAllKelas();
		//logger.info("kelas-microservice all() found: " + kelas.size());
		//return kelas.toArray(new Kelas[kelas.size()]);
		List<Jadwal> jd  = repository.findAll();
		return jd;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Jadwal ById(@RequestParam("id_jadwal") long id)
	{
		//logger.info("kelas-microservice byId() invoked: " + id);
		//Kelas kelas = KelasRepository.getKelas(id);
		//logger.info("kelas-microservice byId() found: " + kelas);
		Long id_jadwal = id;
		Jadwal jd = repository.findOne(id_jadwal);
		return jd;
	}
	
	@RequestMapping(value ="/deletebyid/{id}", method = RequestMethod.DELETE)
	public String deleteById(@RequestParam("id_jadwal") long id)
	{
		repository.delete(id);
		
		return "Delete done";
	}
}
