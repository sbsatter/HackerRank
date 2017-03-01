package ds.arrays;

import java.util.Scanner;

/**
 * Created by sbsatter on 3/1/17.
 */
public class ArraysDs {
	public static void main (String ... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numbers [] = new int [n];
		for (int i=0; i<n; i++) {
			numbers[i] = sc.nextInt();
		}
		for (int i = n-1 ; i>=0; i--) {
			System.out.print(numbers[i]+" ");
		}
	}
}
