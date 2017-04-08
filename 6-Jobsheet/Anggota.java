public class Anggota {
	private String nomorKTP;
	private String nama;
	private int limitPinjaman;
	private int jumlahPinjaman = 0;

	public Anggota(){

	}

	public Anggota(String nomorKTP, String nama, int limitPinjaman){
		this.nomorKTP = nomorKTP;
		this.nama = nama;
		this.limitPinjaman = limitPinjaman;
	}

	public void setNomorKTP(String nomorKTP){
		this.nomorKTP = nomorKTP;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public void setLimitPinjaman(int limitPinjaman){
		this.limitPinjaman = limitPinjaman;
	}

	public String getNomorKTP(){
		return nomorKTP;
	}

	public String getNama(){
		return nama;
	}

	public int getLimitPinjaman(){
		return limitPinjaman;
	}

	public int getJumlahPinjaman(){
		return jumlahPinjaman;
	}

	public void pinjam(int pinjam){
		if (pinjam <= limitPinjaman) {
			jumlahPinjaman += pinjam;	
		} else {
			System.out.println("Maaf, Jumlah pinjaman melebihi limit");
		}
	}

	public void angsur(int angsur){
		if (angsur>=(10*jumlahPinjaman/100)) {
			jumlahPinjaman -= angsur;	
		} else {
			System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
		}
	}
}