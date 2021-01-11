package by.htp.fundamentals1.main;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		//14. Требуется определить факториал числа, которое ввел пользователь.
		

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x;
		int fact = 1;
		do {
			System.out.println("Введите любое положительное число!");
			while (!sc.hasNextInt()) {
				System.out.println("Это не число");
				sc.next();

			}
			x = sc.nextInt();
		} while (x < 0);

		if (x == 0 || x == 1) {
			System.out.println("Факториал: " + x + "! = 1");
			return;

		}

		for (int i = 1; i <= x; i++) {
			fact = fact * i;

		}
		System.out.println("Факториал: " + x + "! = " + fact);

	}

}
