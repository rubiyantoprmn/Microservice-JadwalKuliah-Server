package polban.jtk.absensimahasiswa.JadwalMataKuliahMicroservicesServer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MataKuliahRepository extends JpaRepository<MataKuliah, Long>{
	static List<MataKuliah> getMataKuliah() {
		// TODO Auto-generated method stub
		return null;
	}
	static MataKuliah getMataKuliah(int kd_mk) {
		// TODO Auto-generated method stub
		return null;
	}
}
