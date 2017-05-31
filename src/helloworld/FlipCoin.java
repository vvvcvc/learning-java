package helloworld;
import edu.princeton.cs.algs4.StdRandom;

public class FlipCoin {

	public static boolean flip() {
		if (StdRandom.random() < 0.5) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		for (int i=0; i < 10; i++) {
			if (flip()) {
				System.out.println("up");
			}
			else {
				System.out.println("down");
			}	
		}
	}

}
