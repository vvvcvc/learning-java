package helloworld;
import edu.princeton.cs.algs4.StdRandom;

public class Gambling {
	public static boolean gamble() {
		int sum = 10;
		while (true) {
			if (StdRandom.random() > 0.2) {
				sum--;
			}
			else {
				sum += 4;
			}
			if (sum >= 15) {
				return true;
			}
			if (sum <= 0) {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		int win = 0, lose = 0;
		for (int i = 0; i < 100; i++) {
			if (gamble()) {
				win++;
			}
			else {
				lose++;
			}
		}
		System.out.println("win: " + win);
		System.out.println("lose: " + lose);
	}
}
