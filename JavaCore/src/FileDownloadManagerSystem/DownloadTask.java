package FileDownloadManagerSystem;

import java.util.concurrent.Callable;

public class DownloadTask implements Callable<String> {
	private String fileUrl;

	public DownloadTask(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Starting download from: " + fileUrl);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return "Download interrupted for " + fileUrl;
		}
		System.out.println("Download completed for: " + fileUrl);
		return "Download successful for " + fileUrl;
	}

}
