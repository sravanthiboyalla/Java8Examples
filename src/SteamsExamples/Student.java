package SteamsExamples;


public class Student {
	private String name;
	private String gender;
	private String course;
	private int score;
	public Student(String name, String gender, String course, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.course = course;
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student()
	{
		
	}
	public Student(String name, String gender, String course) {
		super();
		this.name = name;
		this.gender = gender;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", course=" + course + ", score=" + score + "]";
	}
	
	
}
