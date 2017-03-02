package ds.arrays;

import java.util.Scanner;

/**
 * Created by sbsatter on 3/2/17.
 */
public class Array2D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 6;
		int numbers [][] = new int [n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				numbers[i][j] = scanner.nextInt();
			}
		}
		int max = Integer.MIN_VALUE;
		for(int a = 0; a < numbers.length - 2; a++) {
			for(int b = 0; b < numbers.length - 2; b++) {
				int sum = 0;
				for(int i = a; i <= a+2; i++) {
					for(int j = b; j <= b+2; j++) {
						sum += (i== (a+1) && (j != b+1)) ? 0: numbers[i][j];
					}
				}
				max = (sum>max)? sum:max;
			}
		}
		System.out.println(max);
	}
}
