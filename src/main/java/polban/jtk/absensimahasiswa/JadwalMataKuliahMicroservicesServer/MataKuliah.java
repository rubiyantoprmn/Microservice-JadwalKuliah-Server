package polban.jtk.absensimahasiswa.JadwalMataKuliahMicroservicesServer;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "matakuliah")
public class MataKuliah implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name= "kd_mk")
	private String kd_mk;
	
	@Column(name= "nama_mk")
	private String nama_mk;
	
	protected MataKuliah(){
		
	}
	
	public MataKuliah(String kd_mk, String nama_mk){
		this.kd_mk = kd_mk;
		this.nama_mk = nama_mk;		
	}
	
	public void setKdMk(String kd_mk){
		this.kd_mk = kd_mk;
	}
	
	public String getKdMK(){
		return this.kd_mk;
	}

	public void setNamaMk(String nama_mk){
		this.nama_mk = nama_mk;
	}
	
	public String getNamaMK(){
		return this.nama_mk;
	}
	
	public String toString()
	{
		return kd_mk + "\t" + nama_mk ;
	}
}
