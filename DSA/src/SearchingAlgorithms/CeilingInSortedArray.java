package SearchingAlgorithms;

public class CeilingInSortedArray {

	static int solution1(int[] arr, int x) {
		int res = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > x) {
				res = i;
				break;
			}
		}

		return res;
	}

	static int solution2(int[] arr, int x) {
		int res = -1;
		int left = 0, right = arr.length - 1;
		while (left <= right) {

			int mid = left + (right - left) / 2;
			if (arr[mid] < x) {
				left = mid + 1;
			} else {
				res = mid;
				right = mid - 1;
			}

		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 10, 10, 12, 19 };
		int x = 5;
		System.out.println(solution2(arr, x));
	}
}
