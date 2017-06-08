package polban.jtk.absensimahasiswa.JadwalMataKuliahMicroservicesServer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.engine.spi.CascadeStyle;

@Entity
@Table(name= "headerjadwal")
public class HeaderJadwal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name= "id_kelas")
	private int  id_kelas;
	
	@Column(name= "kd_semester")
	private int kd_semester;
	
	@Column(name="versi_cetak")
	private String versi_cetak;
	
	@Column(name = "kurikulum")
	private String kurikulum;
	
	@Column(name = "kd_tahun_ajaran")
	private int kd_tahun_ajaran;
	
	@Column(name = "tanggal_perubahan")
	private Date tanggal_perubahan;
	
	@JoinColumn(name = "id_kelas", referencedColumnName = "id_kelas", nullable = false)
	@OneToMany(cascade = CascadeType.ALL)
	@NotFound(action = NotFoundAction.IGNORE)
	private List<Jadwal> jadwal;
	
	protected HeaderJadwal(){
		
	}

	public HeaderJadwal(int id_kelas,int kd_semester, String versi_cetak,String kurikulum, int kd_tahun_ajaran, Date tanggal_perubahan,List<Jadwal> jadwal){
		this.id_kelas = id_kelas;
		this.kd_semester = kd_semester;
		this.versi_cetak = versi_cetak;
		this.kurikulum = kurikulum;
		this.kd_tahun_ajaran = kd_tahun_ajaran;
		this.tanggal_perubahan = tanggal_perubahan;
		this.jadwal = jadwal;
	}
	
	public void setIdKelas(int id_kelas){
		this.id_kelas = id_kelas;
	}
	
	public int getIdKelas(){
		return this.id_kelas;
	}
	
	public void setKdSemester(int kd_semester){
		this.kd_semester = kd_semester;
	}
	
	public int getKdSemester(){
		return this.kd_semester;
	}
	public void setVersiCetak(String versi_cetak){
		this.versi_cetak = versi_cetak;
	}
	
	public String getVersiCetak(){
		return this.versi_cetak;
	}
	
	public void setKurikulum(String kurikulum){
		this.kurikulum = kurikulum;
	}
	
	public String getKurikulum(){
		return this.kurikulum;
	}
	public void setKdTahunAjaran(int kd_tahun_ajaran){
		this.kd_tahun_ajaran = kd_tahun_ajaran;
	}
	
	public int getKdTahunAjaran(){
		return this.kd_tahun_ajaran;
	}
	public void setTanggalPerubahan(Date tanggal_perubahan){
		this.tanggal_perubahan = tanggal_perubahan;
	}
	
	public Date getTanggalPerubahan(){
		return this.tanggal_perubahan;
	}
	
	
	public void setJadwal(List<Jadwal> jadwal){
		this.jadwal = jadwal;
	}
	
	public List<Jadwal> getJadwal(){
		return this.jadwal;
	}
	public String toString()
	{
		return id_kelas + "\t" + kd_semester + "\t" + versi_cetak + "\t" + kurikulum + "\t" + kd_tahun_ajaran + "\t" + tanggal_perubahan + "\t" + jadwal;
	}
	
}

