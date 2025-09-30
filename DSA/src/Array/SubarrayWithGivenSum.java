package Array;

public class SubarrayWithGivenSum {
	static void solution(int[] arr, int target) {
		int n = arr.length;
		int left = 0;
		int right = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum >= target) {
				right = i;
				while (sum > target && left < right) {
					sum -= arr[left];
					left++;
				}

				if (sum == target) {
					System.out.println((left + 1) + " " + (right + 1));
					return;
				}
			}
		}
		System.out.println("-1");
	}

	public static void main(String[] args) {
		int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int target = 23;
		solution(arr, target);
	}
}
