package ds.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sbsatter on 3/5/17.
 */
public class DynamicArray {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int total = sc.nextInt();
		int lastAns = 0;
		List<List<Integer>> list = new ArrayList();
		for (int i = 0; i < N; i++) {
			list.add(new ArrayList());
		}
		for (int i = 0; i < total; i++) {
			int q = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int seq = (x ^ lastAns) % N;
			List<Integer> seqList = list.get(seq);
			
			switch (q) {
				case 1:
					seqList.add(y);
					list.set(seq, seqList);
					break;
				case 2:
					lastAns = seqList.get(y % seqList.size());
					System.out.println(lastAns);
					break;
			}
			
			
		}
	}
}
