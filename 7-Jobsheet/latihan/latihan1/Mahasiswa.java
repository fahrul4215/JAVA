package latihan.latihan1;

public class Mahasiswa {
	private String nim;
	private String nama;
	private Matakuliah mk;

	public Mahasiswa(){

	}

	public void setNim(String nim){
		this.nim = nim;
	}

	public String getNim(){
		return nim;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setMk(Matakuliah mk){
		this.mk = mk;
	}

	public Matakuliah getMk(){
		return mk;
	}

	public void tampilData(){
		System.out.println("NIM\t: "+nim);
		System.out.println("Nama\t: "+nama);
		mk.tampilData();
	}
}