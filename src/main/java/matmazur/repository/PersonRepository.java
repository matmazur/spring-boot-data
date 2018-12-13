package matmazur.repository;

import matmazur.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    public Optional<Person> getFirstByName(String name);

    public List<Person> getBySurname(String surname);

    public List<Person> findByAge(Integer age);

    public List<Person> findAllByAgeOrName(Integer age,String  name);

    public List<Person> findByNameContainingOrderByAgeAsc(String pattern);
}
