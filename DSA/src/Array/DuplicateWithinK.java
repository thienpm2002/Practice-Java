package Array;

import java.util.HashSet;

public class DuplicateWithinK {
	static boolean solution(int[] arr, int k) {
		int n = arr.length;
		if (n <= 1)
			return false;
		HashSet<Integer> set = new HashSet<>();
		// Dung cua so truot de du k phan tu truoc i

		for (int i = 0; i < n; i++) {
			// Kiem tra tu doan i -> i+k co gia tri trung lap khong
			if (set.contains(arr[i])) {
				return true;
			}

			set.add(arr[i]);
			// doan i-> k+i khong thoa man, xoa phan tu i -k de xet doan j=i+1 -> k+j
			if (i >= k)
				set.remove(arr[i - k]);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 5 };
		int k = 3;
		if (solution(arr, k)) {
			System.out.println("True");
		} else {
			System.out.println("Fasle");
		}

	}
}
