package by.htp.arraysofarrays.main;

public class Task8 {

	public static void main(String[] args) {
		int[][] mas = new int[8][8];
		int n = mas.length;
		for (int i = mas.length - 1; i >= 0; i--) {
			for (int j = 0; j < mas[i].length - i; j++) {
				mas[i][j] = n+j;

			}
			n--;

		}
		System.out.println("Наш массив: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");

			}
			System.out.println();

		}

	}

}
