package streamapi;

import java.util.List;

public class StreamApi {
	public static void main(String[] args) {
		List<String> names = List.of("Chuong", "An", "Binh", "Em", "Duong");

		// Ten bat dau bang 'A'
		names.stream().filter(str -> str.contains("A")).forEach(System.out::println);

		// Viet hoa toan bo ten
		names.stream().map(String::toUpperCase).forEach(System.out::println);

		// Dem so ten co do dai lon hon 5

		long count = names.stream().filter(str -> str.length() > 5).count();

		System.out.println(count);

		// Sap xep theo bang chu cai
		names.stream().sorted().forEach(System.out::println);
	}
}
