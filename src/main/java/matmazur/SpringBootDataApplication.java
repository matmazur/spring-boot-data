package matmazur;

import matmazur.model.Person;
import matmazur.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootDataApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataApplication.class, args);

        Person p1 = Person.builder().withName("Jack").withSurname("Strong").withAge(36).build();
        Person p2 = Person.builder().withName("John").withSurname("Doe").withAge(44).build();
        Person p3 = Person.builder().withName("Amy").withSurname("Ashley").withAge(22).build();
        List<Person> list = Arrays.asList(p1, p2, p3);
        PersonRepository repo = context.getBean(PersonRepository.class);
        repo.saveAll(list);


        repo.findAll().forEach(System.out::println);

    }
}
