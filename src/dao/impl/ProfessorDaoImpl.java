package dao.impl;

import org.hibernate.Query;

import dao.ProfessorDao;
import model.Professor;

public class ProfessorDaoImpl   implements ProfessorDao {

	public Professor getByPersonId(int personId) {
		Query query = getSessionFactory().getCurrentSession()
				.createQuery("select p from Professor p where id=:personId").setInteger("personId", personId);
		return (Professor) query.uniqueResult();
	}

}
