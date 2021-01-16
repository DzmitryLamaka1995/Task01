package by.htp.fundamental.main;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		//13. Напишите программу, где пользователь вводит любое целое положительное число. А
		//программа суммирует все числа от 1 до введенного пользователем числа.
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int x;
		do {
			System.out.println("Введите любое положительное число!");
			while (!sc.hasNextInt()) {
				System.out.println("Это не число");
				sc.next();

			}
			x = sc.nextInt();
		} while (x < 0);

		for (int i = 1; i <= x; i++) {
			sum = sum + i;

		}
		System.out.println("Сумма равна = " + sum);
	}

}
