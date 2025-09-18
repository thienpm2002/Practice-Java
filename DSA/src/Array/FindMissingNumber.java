package Array;

public class FindMissingNumber {
	static int solution(int[] arr) {
		long n = arr.length;
		long sum = (n + 1) * (n + 2) / 2;
		long sumArr = 0;
		for (int i = 0; i < n; i++) {
			sumArr += arr[i];
		}
		return (int) (sum - sumArr);
	}

	public static void main(String[] args) {
		int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
		System.out.println(solution(arr));
	}
}
