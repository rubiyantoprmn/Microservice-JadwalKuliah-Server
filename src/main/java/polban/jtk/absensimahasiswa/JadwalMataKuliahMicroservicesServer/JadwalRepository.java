package polban.jtk.absensimahasiswa.JadwalMataKuliahMicroservicesServer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JadwalRepository extends JpaRepository<Jadwal, Long>{
	static List<Jadwal> getAllJadwal() {
		// TODO Auto-generated method stub
		return null;
	}
	static Jadwal getJadwal(int id_jadwal) {
		// TODO Auto-generated method stub
		return null;
	}
}
