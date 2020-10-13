package by.htp.less01.main;

public class Fifteen {
	
	public static void main(String[] args) {
		int x = 5;
		int y = 34;
		int res = 1;
		
		for (int z = 1 ; z <= x ; z++) {
			if (x%z == 0 && y%z == 0) {
				res = z;
			}
			
		}
		System.out.println(res);
	}

}
