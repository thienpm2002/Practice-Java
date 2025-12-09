package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Bai6 {
	public static void main(String[] args) throws Exception {
		List<Student> students = List.of(new Student(1, "Nguyen Van A", 20, 8.5), new Student(2, "Tran Thi B", 21, 7.8),
				new Student(2, "Bui Trung D", 21, 7.8), new Student(2, "Ngo Ba K", 21, 8.0),
				new Student(5, "Le Dinh T", 23, 7.0));

		// Serialize
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"));
		oos.writeObject(students);
		oos.close();

		// Deserialize
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"));
		@SuppressWarnings("unchecked")
		List<Student> list = (List<Student>) ois.readObject();
		ois.close();

		list.forEach(System.out::println);
	}

}
