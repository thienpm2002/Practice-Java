package multithreading.sumarr;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		int size = 10_000_000;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = 1;
		}

		int mid = size / 2;

		SumArrayByTwoThread t1 = new SumArrayByTwoThread(arr, 0, mid);
		SumArrayByTwoThread t2 = new SumArrayByTwoThread(arr, mid, size);

		long startTime = System.currentTimeMillis();

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		long endTime = System.currentTimeMillis();

		long total = t1.getSum() + t2.getSum();

		System.out.println("Sum: " + total);

		System.out.println("Thoi gian chay la: " + (endTime - startTime) + " ms");

	}
}
