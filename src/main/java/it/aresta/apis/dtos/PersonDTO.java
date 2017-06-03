package it.aresta.apis.dtos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import it.aresta.apis.domain.Person;

@Entity
public class PersonDTO {

	@Id
	@GeneratedValue
	private Long id;

	private String firstName;

	private String lastName;
	private Integer age;
	
	public PersonDTO() {
		
	}

	public PersonDTO(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
		this.age = person.getAge();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
