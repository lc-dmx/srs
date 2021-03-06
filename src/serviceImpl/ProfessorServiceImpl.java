package serviceImpl;

import java.util.List;

import dao.ProfessorDao;
import model.Professor;
import service.ProfessorService;


public class ProfessorServiceImpl   implements ProfessorService {
	private ProfessorDao professorDao;
	public void setProfessorDao(ProfessorDao professorDao) {
		this.professorDao = professorDao;
	}

	@Override
	public int addProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return (Integer)professorDao.save(professor);
	}

	@Override
	public void deleteProfessor(int id) {
		// TODO Auto-generated method stub
		professorDao.delete(Professor.class, id);
	}

	@Override
	public List<Professor> getAllProfessors() {
		// TODO Auto-generated method stub
		return professorDao.findAll(Professor.class);
	}

}
