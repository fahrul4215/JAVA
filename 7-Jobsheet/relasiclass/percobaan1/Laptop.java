package relasiclass.percobaan1;

public class Laptop {
	private String merk;
	private Processor proc;

	public Laptop(){

	}

	public Laptop(String me, Processor pr){
		merk = me;
		proc = pr;
	}

	public String getMerk(){
		return merk;
	}

	public void setMerk(String merk){
		this.merk = merk;
	}

	public Processor getProc(){
		return proc;
	}

	public void setProc(Processor proc){
		this.proc = proc;
	}

	public void tampilData(){
		System.out.println("Merk Laptop = "+merk);
		proc.tampilData();
	}
}