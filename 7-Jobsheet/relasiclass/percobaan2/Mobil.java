package relasiclass.percobaan2;

public class Mobil {
	private String merk;
	private int biayaPerhari;

	public Mobil(){

	}

	public void setMerk(String merk){
		this.merk = merk;
	}

	public String getMerk(){
		return merk;
	}

	public void setBiayaPerHari(int biayaPerhari){
		this.biayaPerhari = biayaPerhari;
	}

	public int getBiayaPerHari(){
		return biayaPerhari;
	}

	public int hitungBiayaSewaMobil(int jumHari){
		return biayaPerhari * jumHari;
	}
}