package nhietdo;

public class NhietDo {

	static void celsiusToFahrenheit(double doC) {
		System.out.println(doC + " = " + (doC * (double) (9 / 5) + 32));
	}

	static void fahrenheitToCelsius(double doF) {
		System.out.println(doF + " = " + ((doF - 32) * (double) (5 / 9)));
	}

}
