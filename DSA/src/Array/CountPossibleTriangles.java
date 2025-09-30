package Array;

import java.util.Arrays;

public class CountPossibleTriangles {
	static int solution(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		int res = 0;
		for (int i = 2; i < n; i++) {
			int l = 0;
			int r = i - 1;
			while (l < r) {
				if (arr[r] + arr[l] > arr[i]) {
					res += r - l;
					r--;
				} else {
					l++;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 21, 22, 100, 101, 200, 300 };
		System.out.println(solution(arr));
	}
}
