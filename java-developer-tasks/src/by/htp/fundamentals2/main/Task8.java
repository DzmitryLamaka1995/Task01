package by.htp.fundamentals2.main;

import java.util.Random;

public class Task8 {

	public static void main(String[] args) {
		// 8. ���� ����� ����� �1 ,�2 ,..., �n . ������� �� ������ ������ �� �����, ���
		// ������� �i > i.

		int[] mas = new int[10];
		createMas(mas);
		System.out.println("��������� ������ :");
		printMas(mas);
		System.out.println();
		System.out.println("����: ");
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(mas[i] + " ");
			}

		}

	}

	public static void createMas(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");

		}
	}

}
