package by.htp.fundamentals1.main;

public class Task12 {

	public static void main(String[] args) {
		//12. Вывести на экран соответствий между символами и их численными обозначениями в
		//памяти компьютера (Таблицу ASCII).


		char ch;

		for (int i = 0; i < 256; i++) {
			ch = (char) (i);
			System.out.println("#" + i + " - " + ch);

		}

	}
}
