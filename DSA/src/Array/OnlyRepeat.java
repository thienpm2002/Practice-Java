package Array;

public class OnlyRepeat {
	static int solution(int[] arr) {
		int n = arr.length;
		int sum = n * (n - 1) / 2;
		int sumArr = 0;
		for (int i = 0; i < n; i++) {
			sumArr += arr[i];
		}
		return sumArr - sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 1, 2, 3, 4 };
		System.out.println(solution(arr));
	}
}
