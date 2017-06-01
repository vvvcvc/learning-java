package helloworld;

public class Harmonic {
	
//	public static double harmonic (int n) {
//		double sum = 0.0;
//		for (int i=1; i <= n; i++) {
//			sum += 1.0 / i;
//		}
//		return sum;
//	}
	
	public static void main(String[] args) {
		double sum = 0.0;
		int P = 20;
		long i = 0;
		while (sum < P) {
			i++;
			sum += 1.0 / i;
		}
		System.out.println(i + ": " + sum);
	}
}

