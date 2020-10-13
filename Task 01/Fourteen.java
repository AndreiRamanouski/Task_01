package by.htp.less01.main;

import java.util.Scanner;

public class Fourteen {
	public static void main(String[] arguments) {
		Scanner x = new Scanner(System.in);
		int y = x.nextInt();
		int  fact = 1;
		
		for (int z = 1; z <= y; z++) {
			fact *=z;
			
		}
		System.out.println(fact);
	}

}
