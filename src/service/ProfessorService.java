package service;

import java.util.List;

import model.Professor;

public interface ProfessorService {
	
	int addProfessor(Professor professor);

	void deleteProfessor(int id);

	List<Professor> getAllProfessors();
}
