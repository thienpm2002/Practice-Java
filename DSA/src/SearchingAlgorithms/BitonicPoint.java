package SearchingAlgorithms;

public class BitonicPoint {
	private static final int MIN = Integer.MIN_VALUE;

	static int solution1(int[] arr) {
		int res = MIN;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > res)
				res = arr[i];
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 7, 8, 3 };
		System.out.println(solution1(arr));
	}
}
