
package serviceImpl;

import java.util.List;

import dao.PersonDao;
import model.Person;
import service.PersonService;

public class PersonServiceImpl implements PersonService {
	
	private PersonDao personDao;
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public int addPerson(Person person) {
		// TODO Auto-generated method stub
		return (Integer)personDao.save(person);
	}

	@Override
	public void deletePerson(int personId) {
		// TODO Auto-generated method stub
		personDao.delete(Person.class, personId);
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personDao.findAll(Person.class);
	}

}
