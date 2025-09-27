package Array;

public class SmallestMissingNumber {
	static int solution(int[] arr, int m) {
		int idex = 0;
		while (idex < m) {
			if (idex > arr.length - 1)
				return arr[--idex] + 1;
			if (arr[idex] == idex) {
				idex++;
			} else
				break;
		}
		return idex;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 10 };
		int m = 11;
		System.out.println(solution(arr, m));
	}
}
