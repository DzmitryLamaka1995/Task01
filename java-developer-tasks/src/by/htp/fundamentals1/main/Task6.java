package by.htp.fundamentals1.main;

public class Task6 {

	public static void main(String[] args) {
		//6. ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, �
		//���� ��, �� ����� �� �� �������������.
		
		int a = 90;
		int b = 0;

		if (a == 0 || b == 0) {
			System.out.println("������ ������������ �� ����������");

		} else if ((a + b) > 180) {
			System.out.println("������ ������������ �� ����������");

		} else {
			System.out.println("����� ����������� ����������");
			if (a == 90 || b == 90 || 180 - (a + b) == 90) {
				System.out.println("����������� �������� �������������");
			} else {
				System.out.println("����������� �� �������� �������������");

			}
		}
	}
}
