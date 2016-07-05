package dao;

import model.Professor;

public interface ProfessorDao  {
	public Professor getByPersonId(int personId);
}
