package Array;

public class SplitArrayEqualSum {
	static void solution(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		if (sum % 3 != 0) {
			System.out.println("-1 -1");
			return;
		}
		int sumEqual = sum / 3;
		// Tong o ben trai
		int i = 0;
		int sumL = arr[i];
		for (int k = i; k < n - 2; k++) {
			if (sumL != sumEqual)
				sumL += arr[++i];
			else
				break;
		}
		// Tong o giua
		int j = i + 1;
		int sumM = arr[j];
		for (int k = j; k < n; k++) {
			if (sumM != sumEqual)
				sumM += arr[++j];
			else
				break;
		}

		System.out.println(i + " " + j);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 0, 4 };
		solution(arr);
	}
}
