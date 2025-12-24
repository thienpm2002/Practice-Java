package core5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParseLog {
	private List<Request> logs = new ArrayList<>();

	public ParseLog() {
		try (BufferedReader br = new BufferedReader(new FileReader("request.log"))) {
			String line;

			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+", 4);

				logs.add(new Request(words[0], words[1], words[2].split("=")[1], words[3].split("=")[1]));

			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void readLog() {
		logs.forEach(System.out::println);
	}

	public void actionByUser() {
		Map<String, Long> result = new HashMap<>();

		result = logs.stream().collect(Collectors.groupingBy(Request::getUser, Collectors.counting()));

		result.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});
	}

	public void rateErrInfo() {
		Map<String, List<Request>> map = new HashMap<>();

		map = logs.stream().collect(Collectors.groupingBy(Request::getStatus));

		Map<String, Integer> result = new HashMap<>();

		map.forEach((k, v) -> {
			int count = v.size();
			result.put(k, count);
		});

		int err = result.get("ERROR");
		int info = result.get("INFO");

		if (info == 0) {
			System.out.println("No INFO log");
		} else {
			System.out.println((double) err / info);
		}
	}

	public void userMaxErr() {
		Map<String, Map<String, List<Request>>> map = new HashMap<>();

		map = logs.stream().collect(Collectors.groupingBy(Request::getUser, Collectors.groupingBy(Request::getStatus)));

		int maxErr = Integer.MIN_VALUE;
		StringBuilder user = new StringBuilder();

		for (Map.Entry<String, Map<String, List<Request>>> e : map.entrySet()) {

			if (e.getValue().get("ERROR") != null) {
				int count = e.getValue().get("ERROR").size();
				if (count > maxErr) {
					maxErr = count;
					user = new StringBuilder(e.getKey());
				}
			}
		}

		if (maxErr == Integer.MIN_VALUE) {
			System.out.println("No ERROR log");
		} else {
			System.out.println(user + ": " + maxErr);
		}

	}
}
