package caculator;

public class Caculator {
	static void cong(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	static void tru(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	static void nhan(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}

	static void chia(int a, int b) {
		if (b == 0) {
			System.out.println("Phep chia khong hop le");
		}
		System.out.println(a + " / " + b + " = " + (double) (a / b));
	}

	static void cong(double a, double b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	static void tru(double a, double b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	static void nhan(double a, double b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}

	static void chia(double a, double b) {
		if (b == 0.0) {
			System.out.println("Phep chia khong hop le");
		}
		System.out.println(a + " / " + b + " = " + (a / b));
	}
}
