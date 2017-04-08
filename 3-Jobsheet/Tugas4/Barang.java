public class Barang{
	public String kode;
	public String namaBarang;
	public int hargaDasar;
	public float diskon;

	public int hitungHargaJual(){
		diskon /= 100;
		return hargaDasar - (int)(diskon*hargaDasar);
	}

	public void tampilData(){
		System.out.println("Kode Barang\t : "+kode);
		System.out.println("Nama Barang\t : "+namaBarang);
		System.out.println("Harga Dasar\t : "+hargaDasar);
		System.out.println("Diskon\t\t : "+(int)diskon);
		System.out.println("----------------------------------");
		System.out.println("Harga Jual\t : "+hitungHargaJual());
	}

	public static void main(String[] args) {
		Barang brg1 = new Barang();

		brg1.kode = "001";
		brg1.namaBarang = "Chiki";
		brg1.hargaDasar = 1000;
		brg1.diskon = 1;

		brg1.tampilData();
	}
}