package by.htp.fundamentals1.main;

public class Task2 {

	public static void main(String[] args) {
		// ��������� �������� ��������� �� ������� (��� ���������� ���������
		// �������������� ��������)

		double a = 1;
		double b = 2;
		double c = 2;
		double d = -1;

		double result;
		if (c == 0 || d == 0) {
			System.out.println("���������� ����������");
			return;
		}
		result = ((a / c) * (b / d)) - ((a * b - c) / (c * d));

		System.out.println("result = " + result);
	}

}