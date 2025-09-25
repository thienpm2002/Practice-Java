package Array;

public class Rearrange {
	static void solution(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				int tmp = arr[i];
				arr[i] = arr[tmp];
				arr[tmp] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		solution(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
