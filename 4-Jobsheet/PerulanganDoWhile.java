class PerulanganDoWhile {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;

		do{
			j += i;
			i--;
		}while (i>8);
		System.out.println("Nilai j "+j);
		System.out.println("Nilai i "+i);
	}
}