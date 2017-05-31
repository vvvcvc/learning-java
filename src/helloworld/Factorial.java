package helloworld;

public class Factorial {
	
	public static long fac(int i) {
		if (i == 0) {
			return 1;
		}
		return i*fac(i-1);
	}

	public static void main(String[] args) {
		for (int i=0; i < 20; i++) {
			System.out.println(fac(i));
		}

	}

}
