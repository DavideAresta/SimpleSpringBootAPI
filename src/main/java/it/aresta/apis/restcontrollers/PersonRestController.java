package it.aresta.apis.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.aresta.apis.domain.Person;
import it.aresta.apis.services.PersonService;

@RestController
public class PersonRestController {
	
	@Autowired
	private PersonService personService;
	
	@CrossOrigin(origins = "http://localhost:4000")
	@RequestMapping("/persons")
	public List<Person> getAll() {
		return personService.getAll();		
	}
	
	@CrossOrigin(origins = "http://localhost:4000")
	@RequestMapping(path = "/persons", method = RequestMethod.POST)
	public Person save(@RequestBody Person person) {
		return personService.save(person);
	}
		
}
