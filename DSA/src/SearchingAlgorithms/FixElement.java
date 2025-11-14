package SearchingAlgorithms;

public class FixElement {
	public static int solution1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i)
				return i;
		}

		return -1;
	}

	public static int solution2(int[] arr) {
		int n = arr.length;
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (mid == arr[mid])
				return mid;

			if (mid > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { -10, -5, 3, 4, 7, 9 };
		System.out.println(solution2(arr));
	}
}
