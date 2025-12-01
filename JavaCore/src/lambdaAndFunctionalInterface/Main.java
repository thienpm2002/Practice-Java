package lambdaAndFunctionalInterface;

public class Main {
	public static void main(String[] args) {

		StringMapper mapper = (str) -> {
			return str.replaceAll(" ", "").toUpperCase();
		};

		System.out.println("Le Dinh Thien qua mapper: " + mapper.uppercaseAndNotSpace("Le Dinh Thien"));

	}
}
