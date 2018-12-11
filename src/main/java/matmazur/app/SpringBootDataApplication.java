package matmazur.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =  SpringApplication.run(SpringBootDataApplication.class, args);



    }
}
