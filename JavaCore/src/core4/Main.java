package core4;

public class Main {
	public static void main(String[] args) {
		StudentRepository repo = new StudentRepository();

		Student s1 = new Student(1, "Thien", 23, 9);

		if (repo.add(s1)) {
			System.out.println("Add successfully!");
		} else {
			System.out.println("Add faild!");
		}

		try {
			if (repo.remove(1L)) {
				System.out.println("Delete successfully!");
			} else {
				System.out.println("Delete faild!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

//		Long id = 1L;
//		try {
//			Student s = repo.findById(id).orElseThrow(() -> new RuntimeException("Student with " + id + " not found!"));
//			System.out.println(s.toString());
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			List<Student> students = repo.findAll(s -> "Thien".equals(s.getName()));
//			if (students.size() == 0) {
//				System.out.println("Not found!");
//			} else {
//				students.forEach(System.out::println);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}

	}
}
