package hu.atsoft.playground.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import hu.atsoft.playground.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
