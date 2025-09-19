package Array;

public class MaxSumSubArr {
	static int solution(int[] arr) {
		int n = arr.length;
		int res = arr[0]; // Lưu trữ kết quả (tổng lớn nhất tìm được cho đến nay)
		int maxEnding = arr[0]; // Tổng lớn nhất của mảng con kết thúc tại vị trí hiện tại

		for (int i = 1; i < n; i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);
			res = Math.max(maxEnding, res);
		}

		return res;

	}

	public static void main(String[] args) {
		int[] arr = { -2, -4 };
		System.out.println(solution(arr));
	}
}
