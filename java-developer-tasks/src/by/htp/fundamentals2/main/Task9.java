package by.htp.fundamentals2.main;

public class Task9 {

	public static void main(String[] args) {
		// 9. ��� ������ �������������� �����, ����������� �������� N. ����������,
		// ������� � ��� �������������,
		// ������������� � ������� ���������.
		
		int[] mas = { 1, 2, 0, -43, 0, -23, 13, 25, 165 };
		System.out.println("��������� ������ :");
		printMas(mas);
		int countNeg = 0;
		int countPos = 0;
		int countNull = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				countNeg++;
			} else if (mas[i] == 0) {
				countNull++;
			} else {
				countPos++;
			}

		}
		System.out.println();
		System.out.println("���-�� ������������� ��������� � ������� = " + countPos);
		System.out.println("���-�� ������������� ��������� � ������� = " + countNeg);
		System.out.println("���-�� ������� ��������� � ������� = " + countNull);

	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");

		}

	}
}
