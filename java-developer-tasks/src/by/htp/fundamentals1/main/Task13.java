package by.htp.fundamentals1.main;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		//13. �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. �
		//��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int x;
		do {
			System.out.println("������� ����� ������������� �����!");
			while (!sc.hasNextInt()) {
				System.out.println("��� �� �����");
				sc.next();

			}
			x = sc.nextInt();
		} while (x < 0);

		for (int i = 1; i <= x; i++) {
			sum = sum + i;

		}
		System.out.println("����� ����� = " + sum);
	}

}
