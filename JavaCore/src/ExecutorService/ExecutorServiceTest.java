package ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long N = 1_000_000_000L;
		long CHUNK = 10_000_000L;
		int THREADS = 20;
		ExecutorService executor = Executors.newFixedThreadPool(THREADS);

		List<Future<Long>> futures = new ArrayList<>();
		for (long start = 1; start <= N; start += CHUNK) {
			long end = Math.min(start + CHUNK - 1, N);
			futures.add(executor.submit(new Task(start, end)));
		}

		long result = 0;
		for (Future<Long> f : futures) {
			result += f.get();
		}
		System.out.println(result);
		executor.shutdown();
	}
}
