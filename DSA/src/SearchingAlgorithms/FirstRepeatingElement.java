package SearchingAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {
	static int solution1(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j])
					return arr[i];
			}
		}
		return -1;
	}

	// Use HashSet
	static int solution2(int[] arr) {
		int n = arr.length;
		Set<Integer> hs = new HashSet<>();
		int index = Integer.MAX_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (hs.contains(arr[i])) {
				index = Math.min(index, i);
			}
			hs.add(arr[i]);
		}

		return index == Integer.MAX_VALUE ? -1 : arr[index];
	}

	public static void main(String[] args) {
		int[] arr = { 6, 10, 5, 4, 9, 120, 4, 6, 10 };
		System.out.println(solution2(arr));
	}
}
