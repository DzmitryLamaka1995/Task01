package by.htp.fundamentals2.main;

import java.util.Random;

public class Task5 {

	public static void main(String[] args) {
		// 5. ���� ������������������ ����� �1 ,�2 ,..., ��. ������� ���������� �����
		// �������� ���, ���������� ��� ��� �����.

		int[] mas = new int[10];
		createMas(mas);
		System.out.println("��������� ������ :");
		printMas(mas);
		int min = mas[0];
		int max = mas[0];
		for (int i = 1; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
			} else if (max < mas[i]) {
				max = mas[i];
			}

		}
		System.out.println();
		System.out.println("���������� ����� �������� ��� : �� " + min + " �� " + max);
	}

	public static void createMas(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");

		}
	}

}
