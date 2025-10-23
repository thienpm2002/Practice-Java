package SearchingAlgorithms;

public class PartitioPoint {

	static int solution1(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n - 1; i++) {
			boolean checkNumberLeft = true;

			for (int j = 0; j < i; j++) {
				if (arr[j] >= arr[i])
					checkNumberLeft = false;
			}

			if (checkNumberLeft) {
				boolean checkNumberRight = true;
				for (int j = i + 1; j < n; j++) {
					if (arr[j] <= arr[i])
						checkNumberRight = false;
				}
				if (checkNumberRight)
					return arr[i];
			}
		}

		return -1;
	}

	static int solution2(int[] arr) {
		int n = arr.length;
		int[] preFix = new int[n];
		int[] sufFix = new int[n];
		preFix[0] = Integer.MIN_VALUE;
		sufFix[n - 1] = Integer.MAX_VALUE;

		for (int i = 1; i < n; i++) {
			preFix[i] = Math.max(preFix[i - 1], arr[i - 1]);
		}

		for (int i = n - 2; i >= 0; i--) {
			sufFix[i] = Math.min(sufFix[i + 1], arr[i + 1]);
		}

		for (int i = 1; i < n - 1; i++) {
			if (arr[i] > preFix[i] && arr[i] < sufFix[i]) {
				return arr[i];
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 4, 3, 6, 8, 10, 7, 9 };
		System.out.println(solution2(arr));
	}
}
