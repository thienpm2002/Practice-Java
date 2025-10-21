package SearchingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsInThreeSorted {
	static List<Integer> soultion(int[] arr1, int[] arr2, int[] arr3) {
		List<Integer> res = new ArrayList<>();
		List<Integer> arr4 = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr4.add(arr1[i]);
					break;
				}
			}
		}
		if (arr4.isEmpty()) {
			res.add(-1);
			return res;
		}
		;

		for (int i = 0; i < arr4.size(); i++) {
			for (int j = 0; j < arr3.length; j++) {
				if (arr4.get(i) == arr3[j]) {
					res.add(arr3[j]);
					break;
				}
			}
		}

		return res;

	}

	static List<Integer> soultion2(int[] arr1, int[] arr2, int[] arr3) {
		List<Integer> res = new ArrayList<>();
		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				res.add(arr1[i]);
				i++;
				j++;
				k++;

				while (i < arr1.length && arr1[i] == arr1[i - 1]) {
					i++;
				}
				while (j < arr2.length && arr2[j] == arr2[j - 1]) {
					j++;
				}
				while (k < arr3.length && arr3[k] == arr3[k - 1]) {
					k++;
				}
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr3[k]) {
				j++;
			} else
				k++;

		}

		return res;

	}

	public static void main(String[] args) {
		int arr1[] = { 1, 5, 10, 20, 30 }, arr2[] = { 5, 13, 15, 20 }, arr3[] = { 5, 20 };
		List<Integer> res = soultion2(arr1, arr2, arr3);
		if (res.isEmpty())
			System.out.println(-1);
		else {
			for (int k : res) {
				System.out.print(k + " ");
			}
		}
	}
}
