package relasiclass.percobaan1;

public class Main {
	public static void main(String[] args) {
		Processor p = new Processor("Intel Core2Duo", 3);
		// Laptop l = new Laptop("Dell Vostro", p);
		Laptop l = new Laptop("Dell Vostro", new Processor("Intel Core2Duo", 3));
		l.tampilData();

		Processor p1 = new Processor();
		p1.setMerk("Intel Core i3");
		p1.setCache(4);
		Laptop l1 = new Laptop();
		l1.setMerk("HP Probook");
		l1.setProc(p1);

		System.out.println("Merk Laptop = "+l1.getMerk());
		System.out.println("Merk Processor = "+l1.getProc().getMerk());
		System.out.println("Cache Memory = "+l1.getProc().getCache());

		// System.out.println("\n");

		// p1.tampilData();
		// l1.tampilData();
	}
}