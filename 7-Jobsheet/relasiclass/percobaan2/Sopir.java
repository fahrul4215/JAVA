package relasiclass.percobaan2;

public class Sopir {
	private String nama;
	private int biayaPerHari;

	public Sopir(){

	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setBiayaPerHari(int biayaPerHari){
		this.biayaPerHari = biayaPerHari;
	}

	public int getBiayaPerHari(){
		return biayaPerHari;
	}

	public int hitungBiayaSopir(int jumHari){
		return biayaPerHari * jumHari;
	}
}