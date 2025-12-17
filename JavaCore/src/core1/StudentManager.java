package core1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StudentManager {
//	private List<Student> students = new ArrayList<>();
	private Map<Long, Student> studentMap = new HashMap<>();

	public StudentManager() {
		super();
		try (BufferedReader br = new BufferedReader(new FileReader("Core1.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split(",");

				long studentCode = Long.valueOf(words[0]);
				String name = words[1];
				double score = Double.valueOf(words[2]);

//				students.add(new Student(studentCode, name, score));
				studentMap.put(studentCode, new Student(studentCode, name, score));
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// View List
	public void viewStudents() {
//		students.forEach(System.out::println);
		studentMap.forEach((key, value) -> System.out.println(value.toString()));
	}

	// Add student
	public boolean addStudent(String name, double score) {
		String checkName = name.trim();
		if (checkName.length() == 0) {
			System.out.println("Name invalid!");
			return false;
		}

		if (score > 10.0 || score < 0.0) {
			System.out.println("Score invalid!");
			return false;
		}

		long newCode = studentMap.size() + 1;

//		students.add(new Student(newCode, checkName, score));
		studentMap.put(newCode, new Student(newCode, checkName, score));
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Core1.txt", true))) {
			bw.newLine();
			bw.write(newCode + "," + checkName + "," + score);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("Add Student successfully!");
		return true;
	}

	// Search student
	public Optional<Student> searchStudent(long studentCode) {
//		return students.stream().filter(s -> s.getStudentCode() == studentCode).findFirst();
		if (studentMap.get(studentCode) != null)
			return Optional.of(studentMap.get(studentCode));
		else
			return Optional.empty();
	}

	// Update student
	public boolean updateStudent(long code, String name, double score) {
		Student s = searchStudent(code)
				.orElseThrow(() -> new RuntimeException("Student with studentCode " + code + " not found!"));

		if (name.trim().length() != 0)
			s.setName(name);
		s.setScore(score);

		// Update to file
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Core1.txt"))) {
			List<Student> list = new ArrayList<>(studentMap.values());
			for (Student st : list) {
				bw.write(st.getStudentCode() + "," + st.getName() + "," + st.getScore());
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("Update Student successfully!");
		return true;
	}

	// Delete student
	public boolean deleteStudent(long code) {
		Student s = searchStudent(code)
				.orElseThrow(() -> new RuntimeException("Student with studentCode " + code + " not found!"));

		studentMap.remove(s.getStudentCode());

		// Update to file
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Core1.txt"))) {
			List<Student> list = new ArrayList<>(studentMap.values());
			for (Student st : list) {
				bw.write(st.getStudentCode() + "," + st.getName() + "," + st.getScore());
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Delete Student successfully!");
		return true;
	}

	// Sort student by socre
	public void sortByScore() {
		List<Student> list = new ArrayList<>(studentMap.values());
		list.sort((a, b) -> Double.compare(b.getScore(), a.getScore()));
		list.forEach(System.out::println);
	}

	// Sort student by socre
	public void filterByScore(double score) {
		List<Student> list = new ArrayList<>(studentMap.values());
		list.stream().filter(s -> s.getScore() > score).forEach(System.out::println);
	}

}
