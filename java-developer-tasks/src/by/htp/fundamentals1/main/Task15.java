package by.htp.fundamentals1.main;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		//15. ����� ��� ���� ����� ������������� �����
		
		int a;
		int b;
		int temp;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �����!");
		while (!sc.hasNextInt()) {
			System.out.println("��� �� �����");
			sc.next();

		}
		a = sc.nextInt();

		System.out.println("������� ������ �����!");
		while (!sc.hasNextInt()) {
			System.out.println("��� �� �����");
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
				System.out.println("��� ��� ����� " + a + " � " + b + " ����� " + temp);
				return;
			} else {
				temp = temp - 1;
			}

		}
	}
}
