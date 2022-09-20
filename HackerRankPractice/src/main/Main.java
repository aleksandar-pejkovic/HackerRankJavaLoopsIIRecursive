package main;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			for (int j = 1; j <= n; j++) {
				int result = calcQueryResult(1, 1, a, b, j);
				System.out.print(result + " ");
			}
			System.out.println();

		}
		in.close();
	}

	private static int calcQueryResult(int counter, int multiplier, int a, int b, int j) {

		if (counter == j) {
			return a + multiplier * b;
		}

		return multiplier * b + calcQueryResult(++counter, multiplier * 2, a, b, j);
	}

}
