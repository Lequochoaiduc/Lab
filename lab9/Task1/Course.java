package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Course {
	private String id;
	private String title;
	private String type;
	List<Student> students;
	private String lecturer;

	public Course(String id, String title, String type, String lecturer) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.students = new ArrayList<>();
		this.lecturer = lecturer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public Map<Integer, List<Student>> groupStudentByYear() {
		Map<Integer, List<Student>> result = new HashMap<>();
		for (Student student : students) {
			if (result.containsKey(student.getYear())) {
				result.get(student.getYear()).add(student);
			} else {
				List<Student> list = new ArrayList<>();
				list.add(student);
				result.put(student.getYear(), list);
			}
		}
		return result;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + this.title + " " + this.type + " " + this.students.size() + " " + this.lecturer;
	}

}
