package JavaIO;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Bai2 {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		Map<String, Integer> hm = new HashMap<>();

		try (FileReader fr = new FileReader("Bai2.txt")) {
			int c;
			while ((c = fr.read()) != -1) {
				char ch = (char) c;
				if (ch == ',' || ch == '.' || ch == ';') {
					continue;
				}
				if (ch == ' ' || ch == '\n' || ch == '\r') {
					if (sb.length() > 0) {
						String word = sb.toString().toLowerCase();
						hm.put(word, hm.getOrDefault(word, 0) + 1);
						sb.setLength(0);
					}
				} else {
					sb.append(ch);
				}
			}

			if (sb.length() > 0) {
				String word = sb.toString().toLowerCase();
				hm.put(word, hm.getOrDefault(word, 0) + 1);
			}

			for (String key : hm.keySet()) {
				System.out.println(key + ": " + hm.get(key));
			}

		} catch (IOException e) {
			System.out.println("An error occurred while reading the file: " + e.getMessage());
		}
	}
}
