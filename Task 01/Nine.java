package by.htp.less01.main;

public class Nine {
	public static void main(String[] arguments) {
		double x = 3;
		double res = 0;
		if (x<=3) {
			res = x*x - 3*x + 9;
		}
		else {
			res = 1/(Math.pow(x, 3) + 6);
		}
		System.out.println(res);
	}
}
