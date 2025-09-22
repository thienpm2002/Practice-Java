package Array;

public class QuickSort {
	static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	static int partition(int[] arr, int low, int hight) {
		int i = low - 1;
		int privot = arr[hight];

		for (int j = low; j <= hight - 1; j++) {
			if (arr[j] < privot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, hight);
		return i + 1;
	}

	static void quickSort(int[] arr, int low, int hight) {
		if (low < hight) {
			int pi = partition(arr, low, hight);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, hight);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
