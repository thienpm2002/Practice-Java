package Array;

public class StockBuyAndSell {
	static int solution(int[] arr) {

		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1])
				sum += arr[i] - arr[i - 1];
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 100, 40, 180, 260, 310, 535, 695 };
		System.out.println(solution(arr));
	}
}
