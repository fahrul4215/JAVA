package latihan.latihan1;

public class Matakuliah {
	private String nama;
	private int sks;
	private double quiz;
	private double uts;
	private double uas;

	public Matakuliah(){

	}

	public void setNama(String nama){
		this.setNama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setSks(int sks){
		this.sks = sks;
	}

	public int getSks(){
		return sks;
	}

	public void setQuiz(double quiz){
		this.quiz = quiz;
	}

	public double getQuiz(){
		return quiz;
	}

	public void setUts(double uts){
		this.uts = uts;
	}

	public double getUts(){
		return uts;
	}

	public void setUas(double uas){
		this.uas = uas;
	}

	public double getUas(){
		return uas;
	}

	public double hitungNilaiAkhir(){
		return (0.25*quiz)+(0.35*uts)+(0.40*uas);
	}

	public String konversiNilaiAkhir(){
		if (hitungNilaiAkhir() > 80) {
			return "A";
		} else if (hitungNilaiAkhir() <= 80) {
			return "B+";
		} else if (hitungNilaiAkhir() <= 75) {
			return "B";
		} else if (hitungNilaiAkhir() <= 65) {
			return "C";
		} else if (hitungNilaiAkhir() <= 60) {
			return "D";
		} else if (hitungNilaiAkhir() <= 50) {
			return "E";
		}
	}

	public void tampilData(){
		System.out.println("Nama Matakuliah\t: "+nama);
		System.out.println("SKS\t: "+sks);
		System.out.println("Nilai Quiz\t: "+quiz);
		System.out.println("Nilai UTS\t: "+uts);
		System.out.println("Nilai UAS\t: "+uas);
	}
}