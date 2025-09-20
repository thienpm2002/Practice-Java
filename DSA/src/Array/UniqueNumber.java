package Array;

import java.util.HashMap;

public class UniqueNumber {
	static int solution(int[] arr) {
		HashMap<Integer, Integer> count = new HashMap<>();
		for (int v : arr) {
			count.put(v, count.getOrDefault(v, 0) + 1);
		}
		for (int v : arr) {
			if (count.get(v) == 1)
				return v;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 4, 5, 3, 4 };
		System.out.println(solution(arr));
	}
}
