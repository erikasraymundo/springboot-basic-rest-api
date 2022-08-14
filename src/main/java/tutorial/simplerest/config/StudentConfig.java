package tutorial.simplerest.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tutorial.simplerest.model.Student;
import tutorial.simplerest.repository.StudentRepository;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean //to run
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student erika = new Student(
                    "Erika Song",
                    "erikasong1925@gmail.com",
                    LocalDate.of(2000, 3, 25)
            );
            Student julie = new Student(
                    "Juliezette Fabros",
                    "juliefab@gmail.com",
                    LocalDate.of(1998, 9, 12)
            );

            repository.saveAll(List.of(erika, julie));
        };
    }

}
