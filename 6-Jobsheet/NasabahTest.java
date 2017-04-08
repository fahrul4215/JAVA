import java.util.Scanner;

class NasabahTest {
	public static void main(String[] args) {
		Nasabah aris = new Nasabah("11556677","Nikiloe Tesla",900000);
		Scanner input = new Scanner(System.in);

		int setor, tarik;

		// aris.setNomorRekening("998877333739");
		// aris.setNama("Aris");
		// aris.setor(1000000);

		// System.out.println("Saldo "+aris.getNama()+" saat ini : Rp "+aris.getSaldo());
		// aris.tarik(50000);
		// System.out.println("Saldo "+aris.getNama()+" saat ini : Rp "+aris.getSaldo());

		System.out.println("Nomor Rekening : "+aris.getNomorRekening());
		System.out.println("Nama : "+aris.getNama());
		System.out.println("Saldo : "+aris.getSaldo());

		System.out.print("Masukkan jumlah uang yang ingin disetor : ");
		aris.setor(setor = input.nextInt());
		System.out.println("Saldo saat ini : "+aris.getSaldo());
		System.out.print("Masukkan jumlah uang yang ingin ditarik : ");
		aris.tarik(tarik = input.nextInt());
		System.out.println("Saldo saat ini : "+aris.getSaldo());
	}
}