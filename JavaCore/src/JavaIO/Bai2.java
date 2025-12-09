package JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Bai2 {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("Bai2.txt"))) {
			Map<String, Integer> hm = new HashMap<>();
			String line;

			while ((line = br.readLine()) != null) {
				line = line.replaceAll("[,.;]", " ");

				String[] words = line.split("\\s+");

				for (String w : words) {
					if (!w.isEmpty()) {
						w = w.toLowerCase();
						hm.put(w, hm.getOrDefault(w, 0) + 1);
					}
				}
			}

			hm.forEach((k, v) -> System.out.println(k + ": " + v));

		} catch (IOException e) {
			System.out.println("An error occurred while reading the file: " + e.getMessage());
		}
	}
}
