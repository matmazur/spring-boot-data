package matmazur.repository;

import matmazur.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends  PagingAndSortingRepository<Person,Long> {
}
