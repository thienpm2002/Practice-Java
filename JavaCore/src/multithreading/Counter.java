package multithreading;

public class Counter {
	int count = 0;

	void increment() {
		count++; // Not atomic: multiple threads may interfere
	}
}
