package Array;

public class SelectionSort {
	static void display(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// Tim kiem phan tu be nhat trong cac phan tu con lai trong mang roi doi vi tri
	// voi phan tu hien tai
	static void solution(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i + 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		System.out.println("TRuoc khi sort");
		display(arr);
		System.out.println();
		System.out.println("Sau khi sort");
		solution(arr);
		display(arr);
	}
}
