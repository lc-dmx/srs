package service;

import java.util.List;

import model.Person;

public interface PersonService {

	int addPerson(Person person);

	void deletePerson(int id);

	List<Person> getAllPersons();

}
