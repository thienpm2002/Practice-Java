package lambdaAndFunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		// Kiem tra so chan
		Predicate<Integer> even = a -> a % 2 == 0;
		System.out.println("5 co phai so chan khong: " + even.test(5));

		// Kiem tra chuoi co ky tu 'a'
		Predicate<String> checkStr = str -> str.contains("a");
		System.out.println("Viet co ky tu a hay khong: " + checkStr.test("Viet"));

		// Loc cac chuoi co do dai lon hon 5;
		String[] strs = { "Nguyen Van A", "An", "Lambda" };

		Predicate<String> checkLeangth = str -> str.length() > 5;

		Consumer<String[]> strResult = (arr) -> {
			for (String str : arr) {
				if (checkLeangth.test(str)) {
					System.out.println(str);
				}
			}
		};
		strResult.accept(strs);

		// Danh sach so nguyen -> binh phuong tat ca
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Function<Integer, Integer> function = (value) -> value * value;
		Consumer<int[]> arrResult = (Arr) -> {
			for (int x : Arr) {
				System.out.print(function.apply(x) + " ");
			}
		};
		arrResult.accept(arr);
	}
}
