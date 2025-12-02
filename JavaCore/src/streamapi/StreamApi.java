package streamapi;

import java.util.List;

public class StreamApi {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(2, 1, 3, 8, 7, 6, 5, 4, 9);

		// Tong tat ca cac phan tu
		int sum = numbers.stream().reduce(0, Integer::sum);

		System.out.println(sum);

		// Loc so chan
		numbers.stream().filter(a -> a % 2 == 0).forEach(a -> System.out.print(a + " "));

		System.out.println();

		// Sap xep giam dan
		numbers.stream().sorted((a, b) -> b - a).forEach(a -> System.out.print(a + " "));

		System.out.println();

		// Tim so lon nhat
		int maxNumber = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(maxNumber);

		// Tim so nho nhat
		int minNumber = numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println(minNumber);

		// Bien doi moi so thanh binh phuong

		numbers.stream().map(a -> a * a).forEach(a -> System.out.print(a + " "));

	}
}
