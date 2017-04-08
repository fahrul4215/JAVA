class Kalkulator {

	public void menu(){
		System.out.println("menu : ");
		System.out.println("\t1. Tambah");
		System.out.println("\t2. Kurang");
		System.out.println("\t3. Kali");
		System.out.println("\t4. Bagi");
	}

	public int tambah(int bil1, int bil2){
		return bil1 + bil2;
	}
	public int kurang(int bil1, int bil2){
		return bil1 - bil2;
	}
	public int kali(int bil1, int bil2){
		return bil1 * bil2;
	}
	public double bagi(int bil1, int bil2){
		return bil1 / bil2;
	}

}