package core5;

public class Main {
	public static void main(String[] args) {
		ParseLog logs = new ParseLog();

		System.out.println("------------------------------- Read log -----------------------------");
		logs.readLog();

		System.out.println("\n------------------------------- User have actions -----------------------------");
		logs.actionByUser();

		System.out.println("\n------------------------------- ERROR/INFO -----------------------------");
		logs.rateErrInfo();

		System.out.println("\n------------------------------- Max User ERROR -----------------------------");
		logs.userMaxErr();
	}
}
