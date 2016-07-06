package daoImpl;

import org.hibernate.Query;

import dao.PersonDao;
import model.Person;

public class PersonDaoImpl   implements PersonDao {

	public Person getByPersonId(String personId) {
		Query query = getSessionFactory().getCurrentSession().createQuery("select p from Person p where id=:personId")
				.setString("personId", personId);
		return (Person) query.uniqueResult();
	}

}
