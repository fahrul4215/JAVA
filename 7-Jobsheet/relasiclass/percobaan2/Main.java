package relasiclass.percobaan2;

public class Main {
	public static void main(String[] args) {
		Mobil m = new Mobil();
		m.setMerk("avanza");
		m.setBiayaPerHari(350000);
		Sopir s = new Sopir();
		s.setNama("John Doe");
		s.setBiayaPerHari(200000);
		Pelanggan p = new Pelanggan();
		p.setNama("Jane Doe");
		p.setMobil(m);
		p.setSopir(s);
		p.setJumHari(2);
		System.out.println("Biaya Total = "+p.hitungBiayaTotal());
	}
}