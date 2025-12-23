package core4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentRepository implements Repository<Student, Long> {

	private List<Student> students = new ArrayList<>();

	public StudentRepository() {
		students.add(new Student(1, "Thien", 23, 9));
	}

	@Override
	public boolean add(Student t) {
		// TODO Auto-generated method stub
		if (t == null || !findById(t.getId()).isEmpty())
			return false;

		students.add(t);
		return true;

	}

	@Override
	public boolean remove(Long id) {
		// TODO Auto-generated method stub
		if (id <= 0) {
			throw new IllegalArgumentException("Id invalid!");
		}
		;

		Student s = findById(id).orElseThrow(() -> new RuntimeException("Student with " + id + " not found!"));

		students.remove(s);
		return true;
	}

	@Override
	public Optional<Student> findById(Long id) {
		// TODO Auto-generated method stub
		if (id <= 0) {
			throw new IllegalArgumentException("Id invalid!");
		}
		;

		return students.stream().filter(s -> s.getId() == id).findFirst();
	}

	@Override
	public List<Student> findByAll(Predicate<Student> condition) {
		// TODO Auto-generated method stub
		return students.stream().filter(condition).collect(Collectors.toList());
	}

}
