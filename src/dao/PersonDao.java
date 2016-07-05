package dao;

import model.Person;

public interface PersonDao  {
	public Person getByPersonId(String personId);
}
