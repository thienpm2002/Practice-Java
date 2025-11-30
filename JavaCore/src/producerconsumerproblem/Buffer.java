package producerconsumerproblem;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
	private final int CAPACITY = 3;
	private Queue<Integer> queue = new LinkedList<>();

	public synchronized void producer(int value) throws InterruptedException {
		while (queue.size() == CAPACITY) {
			System.out.println("Buffer is full -> Producer must to wait");
			wait(); // Nhả lock và vào trạng thái chờ đến khi Consume lấy sản phẩm
		}
		queue.add(value);
		System.out.println("Productor add product " + value);
		notify(); // Báo cho Consume là đã có sản phẩm
	}

	public synchronized int consume() throws InterruptedException {
		while (queue.isEmpty()) {
			System.out.println("Buffer is empty -> Consume must wait");
			wait(); // Nhả lock chờ đến khi Productor thêm sanr phẩm
		}
		int value = queue.poll();
		System.out.println("Consume buy product " + value);
		notify(); // Báo cho Productor là đã lấy sản phẩm -> Buffer còn chỗ trống -> Thêm sản
					// phẩm.
		return value;
	}
}
