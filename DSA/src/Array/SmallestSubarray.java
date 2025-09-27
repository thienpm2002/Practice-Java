package Array;

public class SmallestSubarray {
	static int solution(int[] arr, int x) {
		int res = Integer.MAX_VALUE;
		int n = arr.length;
		int start = 0;
		int sum = 0;
		for (int end = 0; end < n; end++) {
			sum += arr[end];
			while (sum > x) {
				res = Math.min(res, end - start + 1);
				sum -= arr[start];
				start++;
				/*
				 * Ví dụ: arr = [1, 4, 45, 6, 0, 19], x = 51
				 * 
				 * Bắt đầu: end = 0 → sum = 1
				 * 
				 * end = 1 → sum = 1+4 = 5
				 * 
				 * end = 2 → sum = 1+4+45 = 50
				 * 
				 * end = 3 → sum = 56 (> 51)
				 * 
				 * Lúc này cửa sổ = [1,4,45,6], độ dài = 4. Nhưng có thể nhỏ hơn, thử bỏ bớt
				 * phần tử bên trái:
				 * 
				 * sum = 56 - 1 = 55 → vẫn > 51, cửa sổ = [4,45,6], độ dài = 3 (ngắn hơn, tốt
				 * hơn).
				 * 
				 * sum = 55 - 4 = 51 → không còn > 51, dừng.
				 * 
				 * Do đó, ta trừ arr[start] và tăng start để co cửa sổ lại, tìm subarray ngắn
				 * nhất.
				 */
			}
		}

		return (res == Integer.MAX_VALUE) ? 0 : res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, 0, 19 };
		int x = 51;
		System.out.println(solution(arr, x));
	}
}
