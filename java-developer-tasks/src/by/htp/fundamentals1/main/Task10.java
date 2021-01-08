package by.htp.fundamentals1.main;

public class Task10 {

	public static void main(String[] args) {
		//10. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне
		//от 2 до 100 включительно.

		int x = 2;
		while (x <= 100) {
			if (x % 2 == 0) {
				System.out.print(x + " ");
			}
			x = x + 1;

		}

	}

}
