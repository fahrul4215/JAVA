class Balok {
	int p, l, t;

	public int luasPermukaan(){
		return 2*((p*l)+(p*t)+(l*t));
	}

	public int volume(){
		return p*l*t;
	}
}