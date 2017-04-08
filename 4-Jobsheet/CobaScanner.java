import java.util.Scanner;

public class CobaScanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Masukkan Angka : ");
		int angka = input.nextInt();

		System.out.println("===================");
		System.out.println("Anda memasukkan angka : "+angka);
	}
}