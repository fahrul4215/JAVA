public class Lingkaran{
	public double phi = 3.14;
	public double r;

	public double hitungLuas(){
		return phi*r*r;
	}

	public double hitungKeliling(){
		return phi*r*2;
	}
	
	public static void main(String[] args) {
		Lingkaran bunder1 = new Lingkaran();

		bunder1.r = 10;

		System.out.println("Keliling : "+bunder1.hitungKeliling());
		System.out.println("Luas\t : "+bunder1.hitungLuas());
	}
}