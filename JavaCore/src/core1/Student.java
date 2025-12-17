package core1;

public class Student {
	private long studentCode;
	private String name;
	private double score;

	public Student(long studentCode, String name, double score) {
		super();
		this.studentCode = studentCode;
		this.name = name;
		this.score = score;
	}

	public long getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(long studentCode) {
		this.studentCode = studentCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + ", score=" + score + "]";
	}

}
