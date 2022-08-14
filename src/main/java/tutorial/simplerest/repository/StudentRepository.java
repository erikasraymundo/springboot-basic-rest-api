package tutorial.simplerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorial.simplerest.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
