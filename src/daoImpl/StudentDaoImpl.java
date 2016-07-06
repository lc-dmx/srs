package daoImpl;

import org.hibernate.Query;

import dao.StudentDao;
import model.Student;

public class StudentDaoImpl   implements StudentDao{

	public Student getByPersonId(int personId) {
		Query query = getSessionFactory().getCurrentSession()
				.createQuery("select s from Student s where id=:personId").setInteger("personId", personId);
		return (Student) query.uniqueResult();
	}
	

}
