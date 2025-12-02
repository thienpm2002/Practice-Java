package streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
	private List<Product> products = List.of(new Product(1, "iPhone 15", 1200.0, "Electronics", 10),
			new Product(2, "Samsung TV 55\"", 800.0, "Electronics", 5),
			new Product(3, "Laptop Dell XPS", 1500.0, "Electronics", 7),
			new Product(4, "Nike Air Max", 150.0, "Fashion", 20),
			new Product(5, "Adidas Ultraboost", 180.0, "Fashion", 15),
			new Product(6, "Office Chair", 300.0, "Furniture", 12),
			new Product(7, "Dining Table", 900.0, "Furniture", 3), new Product(8, "Coffee Mug", 12.5, "Home", 50),
			new Product(9, "Blender Philips", 65.0, "Home", 18), new Product(10, "Vacuum Cleaner", 220.0, "Home", 6));

	Optional<Product> findById(int id) {
		return products.stream().filter(p -> p.getId() == id).findFirst();
	}

	public List<Product> getProducts() {
		return products;
	}

	public static void main(String[] args) {
		StreamApi streamApi = new StreamApi();
		List<Product> products = streamApi.getProducts();
		// Tim kiem san pham theo id
		Product result = streamApi.findById(1).orElseThrow(() -> new RuntimeException("Product not found"));
		System.out.println(result.toString());
		System.out.println();

		// Loc san pham gia < 500
		products.stream().filter(p -> p.getPrice() < 500).forEach(System.out::println);
		System.out.println();

		// Tinh tong so luong hang trong kho
		int total = products.stream().map(Product::getQuantity).reduce(0, Integer::sum);
		System.out.println("Tong so luong hang trong kho la: " + total);
		System.out.println();

		// Group theo Cateogry
		Map<String, List<Product>> groupByCategory = products.stream()
				.collect(Collectors.groupingBy(Product::getCategory));
		groupByCategory.forEach((category, list) -> {
			System.out.println("Department: " + category);
			list.forEach(System.out::println);
			System.out.println();
		});

		// Tim san pham dat nhat
		Product maxProduct = products.stream().max(Comparator.comparingDouble(Product::getPrice)).orElse(null);
		System.out.println(maxProduct);
		System.out.println();

		// Convert List<Product> → Map<id, name>
		Map<Integer, String> map = products.stream().collect(Collectors.toMap(Product::getId, Product::getName));
		map.forEach((id, name) -> {
			System.out.println("id " + id + ": " + name);
		});
		System.out.println();

		// Sap xep theo gia gam dan
		products.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).forEach(System.out::println);
		System.out.println();

		// Giam gia 10% voi san pham co quantity < 5
		List<Product> newProducts = products.stream().map(p -> {
			if (p.getQuantity() < 5) {
				return new Product(p.getId(), p.getName(), p.getPrice() * 0.9, p.getCategory(), p.getQuantity());
			}
			return p;
		}).toList();

		newProducts.forEach(System.out::println);
		System.out.println();

		// Top 3 san pham co gia cao nhat
		List<Product> top3 = products.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).limit(3)
				.toList();
		top3.forEach(System.out::println);
	}
}
