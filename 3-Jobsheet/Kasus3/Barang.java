public class Barang{
	public String namaBrg;
	public String jenisBrg;
	public int stok;

	public void tampilBarang(){
		System.out.println("Nama Barang\t: "+namaBrg);
		System.out.println("Jenis Barang\t: "+namaBrg);
		System.out.println("Stok\t: "+namaBrg);
	}

	public int tambahStok(int brgMasuk){
		int stokBaru = brgMasuk + stok;
		return stokBaru;
	}
}