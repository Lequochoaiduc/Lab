package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Faculty {
	private String name;
	private String address;
	List<Course> courses;

	public Faculty(String name, String address) {
		this.name = name;
		this.address = address;
		this.courses = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Course getMaxPracticalCourse() {
		Course result = null;
		int max = 0;
		for (Course course : courses) {
			if (course.getType().equals("Partical") && course.getStudents().size() >= max) {
				max = course.getStudents().size();
				result = course;
			}
		}
		return result;
	}

	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> result = new HashMap<>();
		for (Course course : courses) {
			Set<Map.Entry<Integer, List<Student>>> set = course.groupStudentByYear().entrySet();
			for (Map.Entry<Integer, List<Student>> entry : set) {
				if (result.containsKey(entry.getKey())) {
					result.get(entry.getKey()).addAll(entry.getValue());
				} else {
					result.put(entry.getKey(), entry.getValue());
				}
			}
		}
		return result;
	}
	public void addCourse(Course course) {
		this.courses.add(course);
	}

	public Set<Course> filterCourses(String type) {
		Set<Course> result = new TreeSet<>(new Comparator<Course>() {

			@Override
			public int compare(Course o1, Course o2) {
				// TODO Auto-generated method stub
				return o1.getStudents().size() - o2.getStudents().size();
			}
		});
		for (Course course : courses) {
			if(course.getType().equals(type)) result.add(course);
		}
		return result;
	}
	public static void main(String[] args) {
		Student st1 = new Student("22130048", "Hoài Đức", 2022);
		Student st2 = new Student("22130023", "Nhựt Anh", 2023);
		Student st3 = new Student("22130037", "Hoàng Thiện", 2021);
		
		Course c1 = new Course("C1", "CTDL", "Thực Hành","D");
		Course c2 = new Course("C2", "KTCT", "Lý Thuyết","L");
		Course c3 = new Course("C3", "GTNM", "Lý Thuyết","N");
		
		c1.addStudent(st1);
		c1.addStudent(st2);
		c2.addStudent(st2);
		c3.addStudent(st3);
		c3.addStudent(st2);
		
		Faculty fa = new Faculty("FIT", "NLU");
		fa.addCourse(c1);
		fa.addCourse(c2);
		fa.addCourse(c3);
		
		System.out.println(fa.getMaxPracticalCourse());
		System.out.println(fa.groupStudentsByYear());
		System.out.println(fa.filterCourses("Lý Thuyết"));
	}
}
