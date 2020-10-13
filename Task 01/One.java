package by.htp.less01.main;

public class One {
	public static void main(String[] arguments) {
		double a = 6;
		double b = 5;
		double c = 5;
		double res  = (b + (Math.sqrt(b*b + 4*a*c))) / (2*a) - (Math.pow(a, 3)*c) + 1/(b*b);
		
		System.out.println(res);
	}
}
