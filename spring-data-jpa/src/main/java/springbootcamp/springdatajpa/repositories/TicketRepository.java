package springbootcamp.springdatajpa.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import springbootcamp.springdatajpa.repositories.entities.Ticket;

@RepositoryRestResource(collectionResourceRel = "tickets", path = "tickets")
public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
