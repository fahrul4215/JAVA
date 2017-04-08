class Mahasiswa{
	private String nim;
	private String nama;

	public Mahasiswa(){

	}

	public void setNim(String nim){
		this.nim = nim;
	}

	public String getNim(){
		return nim;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public static void main(String[] args) {
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNim("1631710057");
		mahasiswa.setNama("Muchammad Fahrul Yurisnan");
		System.out.println("NIM : "+mahasiswa.getNim());
		System.out.println("Nama : "+mahasiswa.getNama());
	}
}