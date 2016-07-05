package dao;

import model.Student;

public interface StudentDao  {
	public Student getByPersonId(int personId);
}
