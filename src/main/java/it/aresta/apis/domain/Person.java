package it.aresta.apis.domain;

import it.aresta.apis.dtos.PersonDTO;

public class Person {

	private Long id;
	private String firstName;
	private String lastName;
	private Integer age;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Person(PersonDTO personDTO) {
		this.id = personDTO.getId();
		this.firstName = personDTO.getFirstName();
		this.lastName = personDTO.getLastName();
		this.age = personDTO.getAge();
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
