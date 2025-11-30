package multithreading.sumarr;

public class SumArrayByTwoThread extends Thread {
	private int[] arr;
	private int sum = 0;
	private int start;
	private int end;

	public SumArrayByTwoThread(int[] arr, int start, int end) {
		super();
		this.arr = arr;
		this.start = start;
		this.end = end;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public void run() {
		for (int i = start; i < end; i++) {
			sum += arr[i];
		}
	}

}
