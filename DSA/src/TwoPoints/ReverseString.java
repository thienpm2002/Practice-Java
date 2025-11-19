package TwoPoints;

public class ReverseString {
	static String solution(String str) {
		int n = str.length();
		int l = 0, r = n - 1;
		char[] Str = str.toCharArray();
		while (l <= r) {
			if (Str[l] == ' ') {
				l++;
				continue;
			} else if (Str[r] == ' ') {
				r--;
				continue;
			} else {
				char tmp = Str[l];
				Str[l] = Str[r];
				Str[r] = tmp;
				l++;
				r--;
			}

		}

		return String.valueOf(Str);
	}

	public static void main(String[] args) {
		String input = "abc de";
		System.out.println(solution(input));
	}
}
