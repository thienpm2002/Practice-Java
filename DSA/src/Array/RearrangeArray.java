package Array;

public class RearrangeArray {
	static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}

	static void solution(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 != 0 && arr[i] < arr[i - 1]) {
				swap(arr, i - 1, i);
			} else if (i % 2 == 0 && arr[i] > arr[i - 1]) {
				swap(arr, i - 1, i);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2 };
		solution(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
