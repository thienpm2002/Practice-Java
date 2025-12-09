package JavaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Bai5 {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Nguyen Van A", 20, 8.5),
				new Student(2, "Tran Thi B", 21, 7.8));

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv", true))) {
			for (int i = 0; i < students.size(); i++) {
				String line = students.get(i).getId() + "," + students.get(i).getName() + "," + students.get(i).getAge()
						+ "," + students.get(i).getScore();
				bw.write(line);
				bw.newLine();
			}
			System.out.println("Add Done!");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
