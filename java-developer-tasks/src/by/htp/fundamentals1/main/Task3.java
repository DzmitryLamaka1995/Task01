package by.htp.fundamentals1.main;

public class Task3 {

	public static void main(String[] args) {
		//3. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные
		//единицы измерения информации.
		
		double inByte = 2;
		double inKb = inByte / 1024;
		double inMb = inByte / (Math.pow(1024, 2));
		double inGb = inByte / (Math.pow(1024, 3));
		System.out.println(inByte + " Byte = " + inKb + " Kbyte");
		System.out.println(inByte + " Byte = " + inMb + " Mbyte");
		System.out.println(inByte + " Byte = " + inGb + " Gbyte");

	}

}
