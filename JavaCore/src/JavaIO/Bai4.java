package JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bai4 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
			String line;
			br.readLine(); // bỏ dòng header

			while ((line = br.readLine()) != null) {

				String[] words = line.split(",");

				int id = Integer.parseInt(words[0]);
				String name = words[1];
				int age = Integer.parseInt(words[2]);
				double score = Double.parseDouble(words[3]);

				students.add(new Student(id, name, age, score));
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		students.forEach(System.out::println);
	}
}
