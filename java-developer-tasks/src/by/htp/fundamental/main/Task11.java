package by.htp.fundamental.main;

public class Task11 {

	public static void main(String[] args) {
		// 11. Вычислить значения функции на отрезке [а,b] c шагом h:
		int a = -3;
		int b = 4;
		double h = 0.25;
		for (double i = a; i < b; i = i + h) {
			if (i > 2) {
				System.out.println("f(" + i + ") =" + i);
			} else {
				System.out.println("f(" + i + ") =" + (-i));

			}
		}

	}

}
