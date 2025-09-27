package Array;

public class MajorityElement {
	static int solution(int[] arr) {
		int n = arr.length;
		int candidate = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (count == 0) {
				candidate = arr[i];
				count++;
			} else if (candidate == arr[i]) {
				count++;
			} else
				count--;
		}
		count = 0;
		for (int num : arr) {
			if (num == candidate)
				count++;
		}
		return (count > n / 2) ? candidate : -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 1, 3, 5, 1 };
		System.out.println(solution(arr));
	}
}
