package SearchingAlgorithms;

public class ClosestKElements {
	static int[] solution1(int[] arr, int k, int target) {
		int n = arr.length;
		int i = 0;

		while (i < n && arr[i] < target) {
			i++;
		}

		int left = i - 1, right = i;

		while (i < n && arr[right] == target)
			right++;
		int[] res = new int[k];
		int count = 0;

		while (left >= 0 && right <= n - 1 && count < k) {
			int leftDiff = Math.abs(arr[left] - target);
			int rightDiff = Math.abs(arr[right] - target);

			if (leftDiff < rightDiff) {
				res[count++] = arr[left];
				left--;
			} else {
				res[count++] = arr[right];
				right++;
			}
		}

		while (left >= 0 && count < k) {
			res[count++] = arr[left];
			left--;
		}

		while (right <= n - 1 && count < k) {
			res[count++] = arr[right];
			right++;
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56 };
		int[] res = solution1(arr, 4, 35);

		for (int x : res) {
			System.out.print(x + " ");
		}
	}
}
