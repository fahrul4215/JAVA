public class Transaksi {
	public int idTransaksi;
	public int lamaSewa;

	public void struk(int id, String nama, String judul, int harga, int lama, int total) {
		System.out.println("ID Transaksi\t : "+id);
		System.out.println("Nama Member\t : "+nama);
		System.out.println("Judul Game\t : "+judul);
		System.out.println("Harga\t\t : Rp "+harga);
		System.out.println("Lama Sewa\t : "+lama+" hari");
		System.out.println("-----------------------------");
		System.out.println("Total Bayar\t : "+total);
	}

	public int pembayaran(int harga) {
		return lamaSewa * harga;
	}

	public static void main(String[] args) {
		Member mbr1 = new Member();
		Game game1 = new Game();
		Transaksi trn1 = new Transaksi();

		game1.idGame = 1;
		game1.judulGame = "Super Mario";
		game1.harga = 1000;

		mbr1.idMember = 1;
		mbr1.namaMember = "Aris";
		mbr1.alamat = "Jln. jalan";

		trn1.idTransaksi = 1;
		trn1.lamaSewa = 5;

		trn1.struk(trn1.idTransaksi, mbr1.namaMember, game1.judulGame, game1.harga, trn1.lamaSewa, trn1.pembayaran(game1.harga));
	}
}