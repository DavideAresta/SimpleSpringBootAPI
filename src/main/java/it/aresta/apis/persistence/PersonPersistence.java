package it.aresta.apis.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.aresta.apis.dtos.PersonDTO;

@Repository
public interface PersonPersistence extends CrudRepository<PersonDTO, Long> {

}

