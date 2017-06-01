package helloworld;

public class Prime {
	
	public static void main(String[] args) {
		int N = 1000;
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = i;
		}
		for (int p = 2; p < (int)(Math.sqrt(N)); p++) {
			for (int i = 2; i * p < N; i++) {
				a[i*p] = 0;
			}
		}
		for (int i = 2; i < N; i++) {
			if (a[i] != 0) {
				System.out.print(a[i]+" ");
			}
		}
		

	}

}
