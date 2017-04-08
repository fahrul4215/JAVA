class BalokHitung {
	public static void main(String[] args) {
		Balok balok1 = new Balok();

		balok1.p = 10;
		balok1.l = 5;
		balok1.t = 10;

		System.out.println("Panjang Balok 1\t\t= "+balok1.p);
		System.out.println("Lebar Balok 1\t\t= "+balok1.l);
		System.out.println("Tinggi Balok 1\t\t= "+balok1.t);
		System.out.println("================================");
		System.out.println("Luas Permukaan Balok 1 \t= "+balok1.luasPermukaan());
		System.out.println("Volume Balok 1 \t\t= "+balok1.volume());
	}
}