package by.htp.less01.main;
import java.util.Scanner;
public class Thirteen {
public static void main(String[] arguments) {
		Scanner x = new Scanner(System.in);
		int y = x.nextInt();
		int  sum = 0;
		
		for (int z = 0 ; z <= y; z++) {
			sum +=z;
			
		}
		System.out.println(sum);
	}


}
