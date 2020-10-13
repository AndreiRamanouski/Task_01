package by.htp.less01.main;

public class Seven {
	public static void main(String[] arguments) {
		
		int a = -3;
		int b = -6;
		int c = 6;
		int negative = 0;
		if (a < 0) {negative ++;}
		if (b < 0) {negative ++;}
		if (c < 0) {negative ++;}
		
		System.out.println("Количество негативных чисел: " + negative);
	}
}
