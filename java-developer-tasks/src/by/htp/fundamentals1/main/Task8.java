package by.htp.fundamentals1.main;

public class Task8 {

	public static void main(String[] args) {
		//8. ������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������,
		//������� �� ������ ����� ���������.
		
		int a = 1;
		int b = 2;
		int x = 3;
		int y = 4;
		int z = 1;

		if (a > y && b > x) {
			System.out.println("������ ����������� ������� � ���������");
		} else if (a > x && b > y) {
			System.out.println("������ ����������� ������� � ���������");
		} else if (a > z && b > x) {
			System.out.println("������ ����������� ������� � ���������");
		} else if (a > x && b > z) {
			System.out.println("������ ����������� ������� � ���������");
		} else if (a > y && b > z) {
			System.out.println("������ ����������� ������� � ���������");
		} else if (a > z && b > y) {
			System.out.println("������ ����������� ������� � ���������");
		} else {
			System.out.println("������ ����������� �� ������� � ���������");
		}
	}

}
