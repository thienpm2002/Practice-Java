package ExecutorService;

import java.util.concurrent.Callable;

public class Task implements Callable<Long> {
	private long start;
	private long end;

	public Task(long start, long end) {
		this.end = end;
		this.start = start;
	}

	@Override
	public Long call() throws Exception {
		// TODO Auto-generated method stub
		return (end - start + 1) * (end + start) / 2;
	}

}
