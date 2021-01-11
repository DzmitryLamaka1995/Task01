package by.htp.fundamentals1.main;

public class Task6 {

	public static void main(String[] args) {
		//6. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и
		//если да, то будет ли он прямоугольным.
		
		int a = 90;
		int b = 0;

		if (a == 0 || b == 0) {
			System.out.println("Такого треугольника не существует");

		} else if ((a + b) > 180) {
			System.out.println("Такого треугольника не существует");

		} else {
			System.out.println("Такой треугольник существует");
			if (a == 90 || b == 90 || 180 - (a + b) == 90) {
				System.out.println("Треугольник является прямоугольным");
			} else {
				System.out.println("Треугольник не является прямоугольным");

			}
		}
	}
}
