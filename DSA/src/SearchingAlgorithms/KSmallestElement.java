package SearchingAlgorithms;

public class KSmallestElement {
	static int solution1(int[] arr, int k) {
		int n = arr.length;
		int left = 0, right = n - 1;

		while (left <= right) {
			int mid = (right - left) / 2;
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid - 1] < arr[mid] && arr[mid + 1] > arr[mid] && arr[left] > k) {

			}

		}

		return -1;
	}

	public static void main(String[] args) {

	}
}
