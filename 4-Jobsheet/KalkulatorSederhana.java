import java.util.Scanner;

class KalkulatorSederhana {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			Kalkulator kal1 = new Kalkulator();

			int menu, bil1, bil2;
			char ulang;
			
			try{
				do{
					kal1.menu();

					System.out.print("Pilihan anda : ");
					menu = input.nextInt();

					if (menu>0&&menu<5) {
						System.out.print("Masukkan angka 1 : ");
						bil1 = input.nextInt();
						System.out.print("Masukkan angka 2 : ");
						bil2 = input.nextInt();
						
						switch (menu) {
							case 1:
								System.out.println("angka 1 + angka 2 = "+kal1.tambah(bil1, bil2));
							break;
							case 2:
								System.out.println("angka 1 - angka 2 = "+kal1.kurang(bil1, bil2));
							break;
							case 3:
								System.out.println("angka 1 * angka 2 = "+kal1.kali(bil1, bil2));
							break;
							case 4:
								try{
									System.out.println("angka 1 / angka 2 = "+kal1.bagi(bil1, bil2));
								} catch (Exception e) {
									System.out.println("Tidak bisa dibagi dengan angka nol");
								}
							break;
							default:
								System.out.println("Pilihan tidak ada");
							break;
						}
					} else {
						System.out.println("Pilihan tidak ada");
					}

					System.out.print("Tekan Y atau YA jika ingin berhenti, dan T untuk melanjutkan : ");
					ulang = input.next().charAt(0);
				} while(ulang == 't' || ulang == 'T');
			} catch (Exception e) {
				System.out.println("Inputan Tidak valid");
			}
	}
}