

public class Kalkulator {
    int operan1;
    int operan2;
    float hasil;

    public void tambah() {
    	hasil = operan1 + operan2;
    	System.out.println("Hasil = "+hasil);
    }
    public void kurang() {
    	hasil = operan1 - operan2;
    	System.out.println("Hasil = "+hasil);
    }
    public void kali() {
    	hasil = operan1 * operan2;
    	System.out.println("Hasil = "+hasil);
    }
    public void bagi() {
    	hasil = operan1 / operan2;
    	System.out.println("Hasil = "+hasil);
    }

}