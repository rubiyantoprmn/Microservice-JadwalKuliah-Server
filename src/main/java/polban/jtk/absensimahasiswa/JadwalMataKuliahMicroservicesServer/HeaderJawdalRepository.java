package polban.jtk.absensimahasiswa.JadwalMataKuliahMicroservicesServer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeaderJawdalRepository extends JpaRepository<HeaderJadwal, Long>{
	static List<HeaderJadwal> getAllHeaderJadwal() {
		// TODO Auto-generated method stub
		return null;
	}
	static HeaderJadwal getHeaderJadwal(int id_kelas) {
		// TODO Auto-generated method stub
		return null;
	}
}
