package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PistinctPairsSum {
	static List<List<Integer>> solution(int[] arr, int target) {
		int n = arr.length;
		Map<Integer, Integer> hm = new HashMap<>();
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = target - arr[i];
			if (hm.containsKey(arr[i]) && hm.get(arr[i]) == 0) {
				List<Integer> items = new ArrayList<>();
				items.add(tmp);
				items.add(arr[i]);
				res.add(items);
				hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
				hm.put(tmp, hm.getOrDefault(tmp, 0) + 1);
			} else if (!hm.containsKey(arr[i])) {
				hm.put(tmp, 0);
				hm.put(arr[i], 0);
			}
		}
		return res;
	}

	static List<List<Integer>> solution2(int[] arr, int target) {
		int n = arr.length;
		Arrays.sort(arr);
		List<List<Integer>> res = new ArrayList<>();
		int left = 0, right = n - 1;
		while (left < right) {
			if (left > 0 && arr[left] == arr[left + 1]) {
				left++;
				continue;
			}
			if (right < n && arr[right] == arr[right - 1]) {
				right--;
				continue;
			}
			if (arr[left] + arr[right] == target) {
				List<Integer> items = new ArrayList<>();
				items.add(arr[left]);
				items.add(arr[right]);
				res.add(items);
				left++;
				right--;
			} else if (arr[left] + arr[right] > target) {
				right--;
			} else
				left++;
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, -1, 5, 1 };
		int target = 6;
		List<List<Integer>> res = solution2(arr, target);
		for (List<Integer> pair : res) {
			System.out.println(pair.get(0) + " " + pair.get(1));
		}
	}
}
