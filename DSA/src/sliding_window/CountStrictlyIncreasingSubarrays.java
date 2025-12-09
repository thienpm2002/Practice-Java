package sliding_window;

public class CountStrictlyIncreasingSubarrays {
	static int solution1(int[] arr) {
		int i = 0, j = 1, elemtMax = arr[i];
		int n = arr.length;
		int count = 0;
		while (j < n) {
			if (elemtMax < arr[j]) {
				elemtMax = arr[j];
				j++;
			} else if (elemtMax >= arr[j]) {
				count += j - i;
				i = j;
				j++;
				elemtMax = arr[i];
			}
		}
		return count + j - i;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 3, 2, 3, 5 };
		System.out.println(solution1(arr));
	}
}
