package FileDownloadManagerSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DownloadManager {

	private static final int NUM_THREADS = 4;
	private ExecutorService executorService;

	public DownloadManager() {
		executorService = Executors.newFixedThreadPool(NUM_THREADS);
	}

	public void startDownload(String[] fileUrls) {
		List<Callable<String>> tasks = new ArrayList<>();

		for (String url : fileUrls) {
			tasks.add(new DownloadTask(url));
		}

		try {
			List<Future<String>> results = executorService.invokeAll(tasks);

			for (Future<String> result : results) {
				try {
					System.out.println(result.get());
				} catch (ExecutionException | InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}

		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}

	}

	public static void main(String[] args) {
		String[] fileUrls = { "http://example.com/file1.zip", "http://example.com/file2.zip",
				"http://example.com/file3.zip", "http://example.com/file4.zip" };
		DownloadManager downloadManager = new DownloadManager();
		downloadManager.startDownload(fileUrls);
	}
}
