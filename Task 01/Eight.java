package by.htp.less01.main;

public class Eight {
	public static void main(String[] arguments) {
		int A = 15;
		int B = 20;
		
		int x = 14;
		int y = 19;
		int z = 35;
		
		if (A > x & B > y) {System.out.println("OK");}
		else if (A > y & B > z) {System.out.println("OK");}
		else if (A > z & B > x) {System.out.println("OK");}
		else {System.out.println("neOK");}
	}
}
