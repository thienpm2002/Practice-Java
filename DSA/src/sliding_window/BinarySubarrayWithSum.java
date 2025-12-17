package sliding_window;

public class BinarySubarrayWithSum {

	static int solution1(int[] arr, int k) {
		int n = arr.length;
		int res = 0;
		for (int i = 0; i < n - 1; i++) {
			int sum = arr[i];
			for (int j = i + 1; j < n; j++) {
				sum += arr[j];
				if (sum == k)
					res++;
				else if (sum > k)
					break;
			}
		}

		return res;
	}

	static int atmost(int[] arr, int k) {
		int n = arr.length;
		int res = 0, end = 0, sum = 0;
		for (int start = 0; start < n; start++) {
			while (end < n && (sum + arr[end]) <= k) {
				sum += arr[end];
				end++;
			}

			res += (end - start);

			sum -= arr[start];
		}

		return res;
	}

	static int solution2(int[] arr, int k) {
		return atmost(arr, k) - atmost(arr, k - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 1, 0, 1 };
		int k = 2;

		System.out.println(solution2(arr, k));
	}
}
