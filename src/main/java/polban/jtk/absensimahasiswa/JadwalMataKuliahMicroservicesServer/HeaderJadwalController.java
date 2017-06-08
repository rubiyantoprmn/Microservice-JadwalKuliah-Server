package polban.jtk.absensimahasiswa.JadwalMataKuliahMicroservicesServer;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/headerjadwal")
public class HeaderJadwalController {
	
protected Logger logger = Logger.getLogger(HeaderJadwalController.class.getName());
	
	@Autowired    
	HeaderJadwalRepository repository;
	
	

	@RequestMapping(method = RequestMethod.GET)
	public List<HeaderJadwal> findAll()
	{
		//logger.info("kelas-microservice all() invoked");
		//List<Kelas> kelas = KelasRepository.getAllKelas();
		//logger.info("kelas-microservice all() found: " + kelas.size());
		//return kelas.toArray(new Kelas[kelas.size()]);
		List<HeaderJadwal> hd  = repository.findAll();
		return hd;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public HeaderJadwal ById(@RequestParam("id_kelas") long id)
	{
		//logger.info("kelas-microservice byId() invoked: " + id);
		//Kelas kelas = KelasRepository.getKelas(id);
		//logger.info("kelas-microservice byId() found: " + kelas);
		Long nama_kelas = id;
		HeaderJadwal hd = repository.findOne(nama_kelas);
		return hd;
	}
	
	@RequestMapping(value ="/deletebyid/{id}", method = RequestMethod.DELETE)
	public String deleteById(@RequestParam("id_kelas") long id)
	{
		repository.delete(id);
		
		return "Delete done";
	}

}
