package EasyProblems;

public class DivisibleByFour {
	static boolean solution(String n) {
		if (n.length() == 0)
			return false;
		if (n.length() == 1)
			return (Integer.parseInt(n) % 4 == 0);
		return (Integer.parseInt(n.substring(n.length() - 2)) % 4 == 0);
	}

	public static void main(String[] args) {
		String n = "363588395960667043875488";
		System.out.println(solution(n) ? "True" : "False");
	}
}
