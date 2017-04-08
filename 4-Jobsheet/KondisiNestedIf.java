class KondisiNestedIf {
	public static void main(String[] args) {
		String gender = "Mr";
		int usia = 15;

		if (gender=="Mr") {
			if (usia>20) {
				System.out.println("Diterima");
			}else {
				System.out.println("Ditolak");
			}
		}else {
			System.out.println("Khusus Laki-Laki");
		}
	}
}