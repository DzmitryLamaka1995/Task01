package by.htp.fundamentals1.main;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		//15. Найти НОД двух целых положительных чисел
		
		int a;
		int b;
		int temp;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число!");
		while (!sc.hasNextInt()) {
			System.out.println("Это не число");
			sc.next();

		}
		a = sc.nextInt();

		System.out.println("Введите второе число!");
		while (!sc.hasNextInt()) {
			System.out.println("Это не число");
			sc.next();

		}
		b = sc.nextInt();
		if (a < b) {
			temp = a;
		} else {
			temp = b;
		}
		while (temp != 0) {

			if ((a % temp == 0) & (b % temp == 0)) {
				System.out.println("НОД для чисел " + a + " и " + b + " равен " + temp);
				return;
			} else {
				temp = temp - 1;
			}

		}
	}
}
