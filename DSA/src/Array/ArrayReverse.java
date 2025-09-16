package Array;

public class ArrayReverse {

	static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}

	static void solution(int[] arr, int start, int end) {
		if (start == end || start > end)
			return;
		swap(arr, start, end);
		solution(arr, ++start, --end);
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 1 };
		int n = arr.length;
		solution(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
