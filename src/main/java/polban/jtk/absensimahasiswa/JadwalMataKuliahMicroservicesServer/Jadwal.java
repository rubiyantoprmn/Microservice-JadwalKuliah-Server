package polban.jtk.absensimahasiswa.JadwalMataKuliahMicroservicesServer;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name= "jadwal")
public class Jadwal implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name= "id_jadwal")
	private int  id_jadwal;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_kelas")
	@JsonIgnoreProperties("jadwal")
	private HeaderJadwal header_jadwal;
	
	
	@Column(name="hari")
	private String hari;
	
	@Column(name="jamke")
	private int jamke;
	
	@JoinColumn(name = "kd_mk", referencedColumnName = "kd_mk", nullable = false)
	@ManyToOne(optional = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private MataKuliah kd_mk;
	
	@Column(name="nip")
	private String nip;
	
	@Column(name="ruangan")
	private String ruangan;
	
	protected Jadwal(){
		
	}
	
	public Jadwal(int id_jadwal,HeaderJadwal id_kelas, String hari, int jamke, MataKuliah kd_mk, String nip, String ruangan){
		this.id_jadwal = id_jadwal;
		this.header_jadwal = id_kelas;
		this.hari = hari;
		this.jamke = jamke;
		this.kd_mk = kd_mk;
		this.nip = nip;
		this.ruangan = ruangan;
		
	}
	
	public void setIdJadwal(int id_jadwal){
		this.id_jadwal = id_jadwal;
	}
	
	public int getIdJadwal(){
		return this.id_jadwal;
	}
	
	public void setHeaderJadwal(HeaderJadwal id_kelas){
		this.header_jadwal = id_kelas;
	}
	
	public HeaderJadwal getHeaderJadwal(){
		return this.header_jadwal;
	}
	
	public void setHari(String hari){
		this.hari = hari;
	}
	
	public String getHari(){
		return this.hari;
	}
	
	public void setJamke(int jamke){
		this.jamke = jamke;
	}
	
	public int getJamke(){
		return this.jamke;
	}
	
	public void setKdMk(MataKuliah kd_mk){
		this.kd_mk = kd_mk;
	}
	
	public MataKuliah getKdMk(){
		return this.kd_mk;
	}
	
	public void setNip(String nip){
		this.nip = nip;
	}
	
	public String getNip(){
		return this.nip;
	}
	
	public void setRuangan(String ruangan){
		this.ruangan = ruangan;
	}
	
	public String getRuangan(){
		return this.ruangan;
	}
	
	public String toString()
	{
		return id_jadwal + "\t" + header_jadwal + "\t" + hari + "\t" + jamke + "\t" + kd_mk + "\t" + nip + "\t" + ruangan;
	}
	
	
}
