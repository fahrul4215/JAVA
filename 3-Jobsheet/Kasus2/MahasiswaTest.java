public class MahasiswaTest {
	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa();
		Mahasiswa mhs2 = new Mahasiswa();
		Mahasiswa mhs3 = new Mahasiswa();

		mhs1.nim = 101;
		mhs1.nama = "Harkitnas Dofin Dera";
		mhs1.alamat = "Jl. Harkitnas No 1A";
		mhs1.kelas = "MI 1F";
		mhs1.tampilBiodata();

		mhs2.nim = 102;
		mhs2.nama = "Muchammad Fahrul Yurisnan";
		mhs2.alamat = "Jl. Jaksa Agung Suprapto No 1B";
		mhs2.kelas = "MI 1F";
		mhs2.tampilBiodata();

		mhs3.nim = 103;
		mhs3.nama = "Sholikin Holmes";
		mhs3.alamat = "Jl. Jatiroto No 007";
		mhs3.kelas = "MI 1F";
		mhs3.tampilBiodata();
	}
}