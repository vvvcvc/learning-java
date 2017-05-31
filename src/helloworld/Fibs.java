package helloworld;

public class Fibs {
	public static int fibs(int i) {
		if (i < 2) {
			return 1;
		}
		return fibs(i-2)+fibs(i-1);
		
	}

	public static void main(String[] args) {
		for (int i=0; i <20; i++) {
			System.out.println(fibs(i));
		}

	}

}
