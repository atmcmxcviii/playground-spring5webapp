package hu.atsoft.playground.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import hu.atsoft.playground.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
