package Array;

public class EquilibriumIndex {
	static int solution(int[] arr) {
		int n = arr.length;
		int[] preFix = new int[n];
		int[] sufFix = new int[n];
		preFix[0] = 0;
		sufFix[n - 1] = 0;

		for (int i = 1; i < n; i++) {
			preFix[i] = preFix[i - 1] + arr[i - 1];
		}
		for (int i = n - 2; i >= 0; i--) {
			sufFix[i] = sufFix[i + 1] + arr[i + 1];
		}

		for (int i = 0; i < n; i++) {
			if (sufFix[i] == preFix[i])
				return i;
		}

		return -1;
	}

	/*
	 * Toi uu cach nay la: pre + suf + arr[i] = sum (tuc la tien to + hau to + phan
	 * tu hien tai = tong cac phan tu trong mang)
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 3 };
		System.out.println(solution(arr));
	}
}
