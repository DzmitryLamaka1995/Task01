package by.htp.fundamentals1.main;

public class Task5 {

	public static void main(String[] args) {
		//5. Составить программу: определения наименьшего из двух чисел а и b.
		
		double a = 5;
		double b = 4;
		if (a == b) {
			System.out.println("Числа равны");
		} else if (a < b) {
			System.out.println("Наименьшее число = " + a);
		} else {
			System.out.println("Наименьшее число = " + b);
		}
	}

}
