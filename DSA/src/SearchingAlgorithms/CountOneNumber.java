package SearchingAlgorithms;

public class CountOneNumber {
	// Linear Search
	static int solution1(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 1)
				count++;
		}
		return count;
	}

	// Binary Search
	static int solution2(int[] arr) {
		int count = 0;
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == 0) {
				right = mid - 1;
			} else {
				count = mid + 1;
				left = count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 0, 0, 0 };
		System.out.println(solution2(arr));
	}
}
