package SearchingAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;

public class AppearMoreKTime {

	static ArrayList<Integer> solution1(int[] arr, int k) {
		ArrayList<Integer> res = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		int n = arr.length / k;

		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}

		for (HashMap.Entry<Integer, Integer> e : hm.entrySet()) {
			if (e.getValue() > n)
				res.add(e.getKey());
		}

		return res;

	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 2, 1, 2, 3, 3 };
		int k = 4;
		ArrayList<Integer> res = solution1(arr, k);

		for (Integer x : res) {
			System.out.print(x + " ");
		}

	}
}
