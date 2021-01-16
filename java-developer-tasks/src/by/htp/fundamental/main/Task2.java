package by.htp.fundamental.main;

public class Task2 {

	public static void main(String[] args) {
		// Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения)

		double a = 1;
		double b = 2;
		double c = 2;
		double d = -1;

		double result;
		if (c == 0 || d == 0) {
			System.out.println("Вычисление невозможно");
			return;
		}
		result = ((a / c) * (b / d)) - ((a * b - c) / (c * d));

		System.out.println("result = " + result);
	}

}
