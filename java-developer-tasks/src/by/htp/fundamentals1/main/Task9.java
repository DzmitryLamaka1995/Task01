package by.htp.fundamentals1.main;

public class Task9 {

	public static void main(String[] args) {
		//9. Вычислить значение функции:
		
		double x = 1;
		double fx;
		if (x <= 3) {
			fx = Math.pow(x, 2) - (3 * x) + 9;
		} else {
			fx = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println("F(x) = " + fx);
	}

}
