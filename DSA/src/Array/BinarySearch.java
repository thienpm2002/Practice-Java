package Array;

public class BinarySearch {
	/*
	 * Cach lam binh thuong static int solution(int[] arr, int target) { int n =
	 * arr.length; int l = 0; int r = n - 1; while (l <= r) { int mid = l + (r - l)
	 * / 2; if (arr[mid] == target) return mid; if (arr[mid] > target) { r = mid -
	 * 1; } else { l = mid + 1; } } return -1; }
	 */
	// Cac lam bang de quy
	static int solution(int[] arr, int target, int l, int r) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == target)
				return mid;
			if (arr[mid] > target)
				return solution(arr, target, 0, mid - 1);

			return solution(arr, target, mid + 1, r);
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 12, 16, 22, 38, 56, 72, 91 };
		int target = 23;
		int n = arr.length;
		System.out.println(solution(arr, target, 0, n - 1));
	}
}
