import java.util.Scanner;

public class KoperasiTest {
	public static void main(String[] args) {
		Anggota donny = new Anggota("111333444","Donny",5000000);
		Scanner input = new Scanner(System.in);

		int pinjam, angsur;

		System.out.println("Nama Angoota : "+donny.getNama());
		System.out.println("Limit Pinjaman : "+donny.getLimitPinjaman());

		System.out.print("\nMeminjam uang : ");
		pinjam = input.nextInt();
		donny.pinjam(pinjam);
		System.out.println("Jumlah pinjaman saat ini : "+donny.getJumlahPinjaman());

		System.out.print("\nMeminjam uang : ");
		pinjam = input.nextInt();
		donny.pinjam(pinjam);
		System.out.println("Jumlah pinjaman saat ini : "+donny.getJumlahPinjaman());

		System.out.print("\nMembayar angsuran : ");
		angsur = input.nextInt();
		donny.angsur(angsur);
		System.out.println("Jumlah pinjaman saat ini : "+donny.getJumlahPinjaman());

		System.out.print("\nMembayar angsuran : ");
		angsur = input.nextInt();
		donny.angsur(angsur);
		System.out.println("Jumlah pinjaman saat ini : "+donny.getJumlahPinjaman());
	}
}