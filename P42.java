package pro_5;

import java.util.*;

public class P42 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter N value : ");
		int n = in.nextInt();
		System.out.println("Enter k value : ");
		int k = in.nextInt();
		System.out.println("Enter the " + n + " elements : ");
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		int m = n % k;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= n - k; i += k) {
			int min = ar[i];
			for (int j = i; j < i + k; j++) {
				if (min > ar[j]) {
					min = ar[j];
				}
			}
			al.add(min);
		}
		int min = ar[ar.length - 1];
		for (int j = n - 1; j >= n - m; j--) {
			if (min > ar[j]) {
				min = ar[j];
			}
		}
		al.add(min);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("output : " + al.get(0));
	}
}
