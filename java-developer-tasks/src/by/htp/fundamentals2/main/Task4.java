package by.htp.fundamentals2.main;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		// 4. ���� ������������������ ����������� ����� �1 , �2 ,..., ��. ������� ������
		// �� ������ ����� ���� ������������������.
		// ���� ����� ����� ���, �� ������� ��������� �� ���� �����.

		int[] array = new int[10];
		int temp = 0;
		createMas(array);
		System.out.println("��������� ������ :");
		printMas(array);
		int[] arrayTemp = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				if (array[i] == 0) {
					continue;
				}
				arrayTemp[temp] = array[i];
				temp++;

			}
		}
		if (temp == 0) {
			System.out.println("� ������ ������� ��� ������ �����");
			return;
		}

		int[] arrayPos = new int[temp];
		System.arraycopy(arrayTemp, 0, arrayPos, 0, temp);
		System.out.println();
		System.out.println("������ �� ������ ����� :");

		printMas(arrayPos);

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
