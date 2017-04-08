package relasiclass.percobaan1;

public class Processor {
	private String merk;
	private double cache;

	public Processor(){

	}

	public Processor(String me, double ca){
		merk = me;
		cache = ca;
	}

	public String getMerk(){
		return merk;
	}

	public void setMerk(String merk){
		this.merk = merk;
	}

	public double getCache(){
		return cache;
	}

	public void setCache(double cache){
		this.cache = cache;
	}

	public void tampilData(){
		System.out.println("Merk Processor = "+merk);
		System.out.println("Cache Memory = "+cache);
	}
}