class KondisiIfElseIf {
	public static void main(String[] args) {
		int nilai = 99;
		char grade;

		if (nilai == 100) {
			grade = 'A';
		} else if (nilai >= 80) {
			grade = 'B';
		} else if (nilai >= 70) {
			grade = 'C';
		} else if (nilai >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade = "+grade);
	}
}