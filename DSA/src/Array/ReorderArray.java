package Array;

public class ReorderArray {
	static void solution(int[] arr, int[] index) {
		int n = arr.length;
		int[] tmp = new int[n];
		for (int i = 0; i < n; i++) {
			tmp[i] = arr[index[i]];
		}
		for (int i = 0; i < n; i++) {
			arr[i] = tmp[i];
		}
	}

	static void solution2(int[] arr, int[] index) {
		int n = arr.length;
		int i = 0;
		while (i < n) {
			if (index[i] == i)
				i++;
			else {
				int temp1 = arr[i];
				arr[i] = arr[index[i]];
				arr[index[i]] = temp1;

				int temp2 = index[i];
				index[i] = index[temp2];
				index[temp2] = temp2;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 11, 12 };
		int[] index = { 1, 0, 2 };
		solution2(arr, index);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
