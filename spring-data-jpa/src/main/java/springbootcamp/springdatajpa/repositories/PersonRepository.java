package springbootcamp.springdatajpa.repositories;


import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import springbootcamp.springdatajpa.repositories.entities.Person;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends Repository<Person, Integer> {

    List<Person> findByLastname(String lastname);

    Integer save(Person person);

    List<Person> findByEmailAddressAndLastname(String emailAddress, String lastname);

    // Enables the distinct flag for the query
    List<Person> findDistinctByLastnameOrFirstname(String lastname, String firstname);

    // Enabling ignoring case for an individual property
    List<Person> findByLastnameIgnoreCase(String lastname);
    // Enabling ignoring case for all suitable properties
    List<Person> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname);

    // Enabling static ORDER BY for a query
    List<Person> findByLastnameOrderByFirstnameAsc(String lastname);
    List<Person> findByLastnameOrderByFirstnameDesc(String lastname);

    Person findTopByOrderByAgeDesc();

    List<Person> findFirst10ByLastnameOrderByAgeDesc(String lastname);
}
