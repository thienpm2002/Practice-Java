package Array;

public class MaximumCircularSubarray {
	static int solution(int[] arr) {
		int n = arr.length;
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			int j = i;
			do {
				sum += arr[j];
				res = Math.max(sum, res);
				j++;
				if (j == n)
					j = n - j;
			} while (i != j);
		}
		return res;
	}

	/* C2. res = totalSum - minSumSubArr */
	public static void main(String[] args) {
		int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
		System.out.println(solution(arr));
	}
}
