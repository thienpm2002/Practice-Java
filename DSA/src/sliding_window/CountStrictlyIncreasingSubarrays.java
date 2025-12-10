package sliding_window;

public class CountStrictlyIncreasingSubarrays {
	static int solution1(int[] arr) {
		int len = 1;
		int count = 0;
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1]) {
				len++;
			} else {
				count += (len * (len - 1)) / 2;
				len = 1;
			}
		}

		count += (len * (len - 1)) / 2;

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 3, 2, 3, 5 };
		System.out.println(solution1(arr));
	}
}
