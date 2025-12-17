package sliding_window;

public class SubarraysProductLessThanK {
	static int solution1(int[] arr, int k) {
		int n = arr.length;
		int res = 0;
		int mul;
		for (int i = 0; i < n; i++) {
			mul = arr[i];
			if (mul < k) {
				res++;
			}
			for (int j = i + 1; j < n; j++) {
				mul *= arr[j];
				if (mul < k) {
					res++;
				} else
					break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 9, 2, 8, 6, 4, 3 };
		int k = 100;

		System.out.println(solution1(arr, k));
	}
}
