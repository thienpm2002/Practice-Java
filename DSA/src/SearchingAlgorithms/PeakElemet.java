package SearchingAlgorithms;

public class PeakElemet {
	public static int solution1(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n - 1; i++) {
			if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int solution2(int[] arr) {
		int n = arr.length;
		int low = 1, high = n - 2;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
				return mid;

			if (arr[mid + 1] > arr[mid]) {
				low = mid + 1;
			} else
				high = mid - 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 7, 8, 3 };
		System.out.println(solution2(arr));
	}
}
