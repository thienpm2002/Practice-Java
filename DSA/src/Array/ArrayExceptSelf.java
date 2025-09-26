package Array;

public class ArrayExceptSelf {
	static void solution1(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int product = 1;
			for (int j = 0; j < n; j++) {
				if (j == i)
					continue;
				product *= arr[j];
			}
			System.out.print(product + " ");
		}
	}

	static void solution2(int[] arr) {
		int n = arr.length;
		int totalArr = 1;
		int index = -1, count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				count++;
				index = i;
			} else {
				totalArr *= arr[i];
			}
		}
		if (count > 1) {
			for (int i = 0; i < n; i++) {
				System.out.print("0 ");
			}
		} else if (index >= 0) {
			for (int i = 0; i < n; i++) {
				if (i == index) {
					System.out.print(totalArr + " ");
				} else {
					System.out.print("0 ");
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				int res = totalArr / arr[i];
				System.out.print(res + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 0, 5, 6, 0 };
		solution2(arr);
	}
}
