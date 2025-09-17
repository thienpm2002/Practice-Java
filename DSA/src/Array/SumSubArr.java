package Array;

public class SumSubArr {
	static int solution(int[] arr, int start, int end) {
		int sum = 0;
		int n = arr.length;
		if (n == 0)
			return 0;
		if (n == 1)
			return arr[0];
		if (end == n)
			return sum;
		if (start > end)
			sum += solution(arr, 0, end + 1);
		else {
			for (int i = start; i < end; i++) {
				sum += arr[i];
			}
			sum += arr[end];
			sum += solution(arr, start + 1, end);
		}

		return sum;
//   C2. Cong thuc   		
//		  int n = arr.length;
//        int result = 0;
//
//        for (int i = 0; i < n; i++) {
//            result += (arr[i] * (i + 1) * (n - i));
//        }
//
//        return result;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(solution(arr, 0, 0));
	}
}
