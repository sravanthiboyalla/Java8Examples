package SteamsExamples;

import java.time.LocalDate;

public class Course {

	private String CourseName;
	private LocalDate startDate;
	private LocalDate endDate;
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Course()
	{
		
	}
	public Course(String courseName, LocalDate startDate, LocalDate endDate) {
		super();
		CourseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Course [CourseName=" + CourseName + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
}
