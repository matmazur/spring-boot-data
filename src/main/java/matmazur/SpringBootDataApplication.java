package matmazur;

import matmazur.model.Person;
import matmazur.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootDataApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataApplication.class, args);

        Person p1 = Person.builder().withName("Jack").withSurname("Strong").withAge(36).build();
        Person p2 = Person.builder().withName("John").withSurname("Doe").withAge(44).build();
        Person p3 = Person.builder().withName("Amy").withSurname("Ashley").withAge(22).build();
        Person p4 = Person.builder().withName("Jack").withSurname("Strong").withAge(36).build();
        Person p5 = Person.builder().withName("John").withSurname("Doe").withAge(44).build();
        Person p6 = Person.builder().withName("Amy").withSurname("Ashley").withAge(22).build();
        List<Person> list = Arrays.asList(p1, p2, p3, p4, p5, p6);
        PersonRepository repo = context.getBean(PersonRepository.class);
        repo.saveAll(list);


        repo.findAll().forEach(System.out::println);
        System.out.println(repo.count());
        System.out.println(repo.existsById(4L));


        Page<Person> people = repo.findAll(PageRequest.of(0, 2, Sort.Direction.ASC, "name"));
        people.getContent().forEach(System.out::println);


    }
}
