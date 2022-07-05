package basic;

public class ForWithLableledBreak {
	public static void main(String[] args) {

		int[][] table = { { 1, 11 }, { 3, 4 }, { 5, 6 } };
		search: for (int[] row : table) {
			for (int n : row) {
				if (n % 2 == 0) {
					System.out.println(n);
					break search;
				}
			}
		}
	}
}