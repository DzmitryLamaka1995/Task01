package by.htp.fundamental.main;

public class Task1 {

	public static void main(String[] args) {
		// Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения)

		double a = -1;
		double b = 10;
		double c = 7.1;
		double resSqrt;
		double result;
		resSqrt = Math.sqrt(Math.pow(b, 2) + 4 * a * c);

		if (Double.isNaN(resSqrt) || a == 0) {
			System.out.println("Вычисление невозможно");
			return;
		}

		result = (b + resSqrt) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);

		System.out.println("result = " + result);
	}

}
