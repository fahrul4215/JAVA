package relasiclass.percobaan2;

public class Pelanggan {
	private String nama;
	private Mobil mobil;
	private Sopir sopir;
	private int jumHari;

	public Pelanggan(){

	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getnama(){
		return nama;
	}

	public void setMobil(Mobil mobil){
		this.mobil = mobil;
	}

	public Mobil getMobil(){
		return mobil;
	}

	public void setSopir(Sopir sopir){
		this.sopir = sopir;
	}

	public Sopir getSopir(){
		return sopir;
	}

	public void setJumHari(int jumHari){
		this.jumHari = jumHari;
	}

	public int getJumHari(){
		return jumHari;
	}

	public int hitungBiayaTotal(){
		return mobil.hitungBiayaSewaMobil(jumHari) + sopir.hitungBiayaSopir(jumHari);
	}
}