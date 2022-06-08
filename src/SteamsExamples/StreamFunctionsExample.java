package SteamsExamples;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamFunctionsExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		studentMap.put(1, new Student("Janu","Female","Java",90));
		studentMap.put(2, new Student("Renu",  "Female", "Java",80));
		studentMap.put(3, new Student("Meenu", "Female", "SAP",70));
		studentMap.put(4, new Student("Banu", "Female", ".net",80));
		studentMap.put(5, new Student("Seenu", "Male", ".net",80));

		
		Map<Integer, Course> courseMap = new HashMap<Integer, Course>();
		courseMap.put(1,new Course("Java",LocalDate.of(2001, 12, 12),LocalDate.of(2002, 06, 12)));
		courseMap.put(2,new Course(".net",LocalDate.of(2022, 07, 07),LocalDate.of(2023, 06, 12)));
		courseMap.put(3,new Course("SAP",LocalDate.of(2022, 07, 07),LocalDate.of(2023, 06, 12)));
		String courseName="Java";
		List<Student> student=filterByCourse(studentMap,courseName);
		
		System.out.println(student);
		
		double avg=findAverageScoreByCourse(studentMap,courseName);
		
		
		System.out.println(avg);
		
		
		
		courseMap.values().stream().filter(c->c.getStartDate().getMonth().equals(LocalDate.now().getMonth().plus(1))).
		forEach(System.out::println);
		courseMap.values().stream().
			filter(c->c.getStartDate().getDayOfWeek().equals(LocalDate.now().getDayOfWeek().plus(7))).forEach(System.out::println);
		LocalDate today=LocalDate.now();
		
		List<Course> courses=getAvailableCoursesFallsInPeriod(courseMap, today);
		System.out.println(courses);
	}
	
	private static List<Course> getAvailableCoursesFallsInPeriod(Map<Integer, Course> courseMap, LocalDate today) {
		// TODO Auto-generated method stub
		List<Course> courses=courseMap.values().stream().filter(c-> today.isAfter(c.getStartDate())&&today.isBefore(c.getEndDate())).toList();
				//filter(c->c.getEndDate().isBefore(today)).toList();
		//course -> plusWeeks.isAfter(course.getStartDate()) && plusWeeks.isBefore(course.getEndDate()))
				//filter(c->today.isBefore(c.getEndDate())).toList();
		return courses;
	}

	private static double findAverageScoreByCourse(Map<Integer, Student> studentMap, String courseName) {
		// TODO Auto-generated method stub
		double average=studentMap.values().stream().filter(s->s.getCourse().equals(courseName)).mapToInt(s->s.getScore()).
				average().getAsDouble();
		return average;
	}

	private static List<Student> filterByCourse(Map<Integer, Student> studentMap,String courseName) {
		// TODO Auto-generated method stub
		List<Student> student=studentMap.values().stream().filter(s->s.getCourse().equals(courseName))
				.collect(Collectors.toList());
				return student;
	}

}
