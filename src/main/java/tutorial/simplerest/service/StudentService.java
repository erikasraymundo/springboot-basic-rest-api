package tutorial.simplerest.service;

import org.springframework.stereotype.Service;
import tutorial.simplerest.model.Student;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                    1L,
                    "Erika",
                    "erikasong1925@gmail.com",
                    LocalDate.of(2000, 3, 25),
                    22));
    }

}
