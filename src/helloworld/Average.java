package helloworld;

import edu.princeton.cs.algs4.StdIn;

public class Average {

	public static void main(String[] args) {
		double sum = 0.0;
		int count = 0;
		System.out.println("Please input numbers. Input 0 to quit.");
		while (!StdIn.isEmpty()) {
			try {
				double num = StdIn.readDouble();				
				if (0 == num) break;
				sum += num;
				count++;
			} catch (Exception e) {
				System.out.println("You must input a double!");
			}
		}
		double average = sum / count;
		System.out.println("Average is: " + average);
	}

}
