package by.htp.fundamentals2.main;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		// 6. ���� ������������������ �������������� ����� �1 ,�2 ,..., ��. �������� ���
		// �� �����, ������� ������� Z, ���� ������.
		// ���������� ���������� �����
		
		int[] mas = new int[10];
		createMas(mas);
		System.out.println("��������� ������ :");
		printMas(mas);
		System.out.println();
		int z = 66;
		System.out.println("Z = " + z);
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
			}

		}
		System.out.println("����:");
		printMas(mas);

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
