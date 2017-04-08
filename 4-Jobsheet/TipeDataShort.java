class TipeDataShort {
	public static void main(String[] args) {
		short s1 = 15; // benar
		// byte b1 = 10; // benar
		// s1 = b1; // benar
		// b1 = (byte)s1; // salah, harus diberi casting byte
		
		// int num1 = 10; // benar
		// s1 = num1; // salah, harus diberi casting byte
		// s1 = (short)num1; // benar
		// s1 = 35000; // salah, karena diluar batas range tipe data short

		// long num2 = 555L; // benar 
		// s1 = num2; // salah, harus di casting tipe data short dan L tidak tercetak
		// s1 = (short)num2; // benar, tp tidak L tercetak
		// s1 = 555L; // salah, compile-time error
		// s = (short)555L; // salah, s belum di deklarasikan

		System.out.println(s1);
	}
}