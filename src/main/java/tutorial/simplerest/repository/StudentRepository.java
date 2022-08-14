package tutorial.simplerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorial.simplerest.model.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByEmail(String email);

}
