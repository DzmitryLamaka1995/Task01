package by.htp.fundamentals1.main;

public class Task7 {

	public static void main(String[] args) {
		// 7. Подсчитать количество отрицательных среди чисел а, b, с.

		double a = -1;
		double b = 0;
		double c = 2;

		int count = 0;

		if (a < 0) {
			count = count + 1;
		}

		if (b < 0) {
			count = count + 1;
		}

		if (c < 0) {
			count = count + 1;
		}
		System.out.println("Количество отрицательных чисел = " + count);

	}

}
