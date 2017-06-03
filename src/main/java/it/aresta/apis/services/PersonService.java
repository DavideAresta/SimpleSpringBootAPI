package it.aresta.apis.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aresta.apis.domain.Person;
import it.aresta.apis.dtos.PersonDTO;
import it.aresta.apis.persistence.PersonPersistence;

@Service
public class PersonService {

	@Autowired
	private PersonPersistence personPersistence;
	
	public List<Person> getAll() {
		final List<Person> persons = new ArrayList<Person>();
		personPersistence.findAll().forEach((p)-> {
			persons.add(new Person(p));
		});
		return persons;
	}
	
	public Person save(Person person) {
		return new Person(personPersistence.save(new PersonDTO(person)));
	}
}
