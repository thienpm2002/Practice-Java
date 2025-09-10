package demkytu;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		String str = s.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				int value = map.get(key);
				map.put(key, value + 1);
			}
		}
		for (HashMap.Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		s.close();
	}
}
