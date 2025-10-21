package SearchingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class FindKSmallestElementInMatrix {
	static int solution(int[][] mat, int k) {
		int n = mat[0].length;
		ArrayList<Integer> res = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res.add(mat[i][j]);
			}
		}
		Collections.sort(res);
		return res.get(k - 1);
	}

	public static void main(String[] args) {
		int[][] mat = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 24, 29, 37, 48 }, { 32, 33, 39, 50 } };
		int k = 3;
		System.out.println(solution(mat, k));
	}
}
