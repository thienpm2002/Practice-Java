package Array;

import java.util.Arrays;

public class TwoSumPairZero {
	static int solution(int[] arr) {
		Arrays.sort(arr);
		int i = 0, j = arr.length - 1;
		int sum = arr[i] + arr[j];
		int dif = Math.abs(sum);
		while (i < j) {
			if (arr[i] + arr[j] == 0)
				return 0;

			if (Math.abs(arr[i] + arr[j]) < Math.abs(dif)) {
				dif = Math.abs(arr[i] + arr[j]);
				sum = arr[i] + arr[j];
			} else if (Math.abs(arr[i] + arr[j]) == dif) {
				sum = Math.max(sum, arr[i] + arr[j]);
			}

			if (arr[i] + arr[j] > 0)
				j--;
			else
				i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 0, -8, -6, 3 };
		System.out.println(solution(arr));
	}
}
