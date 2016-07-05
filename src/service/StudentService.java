package service;

import java.util.List;

import model.Section;
import model.Student;


public interface StudentService {

	int addStudent(Student student);

	List<Student> getAllStudents();

	void deleteStudent(int id);
}
