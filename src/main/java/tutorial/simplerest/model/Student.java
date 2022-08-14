package tutorial.simplerest.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    Long id;
    String name;
    String email;
    LocalDate date_of_birth;
    @Transient
    int age;

    public Student() {
    }

    public Student(String name, String email, LocalDate date_of_birth) {
        this.name = name;
        this.email = email;
        this.date_of_birth = date_of_birth;
    }

    public Student(Long id, String name, String email, LocalDate date_of_birth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.date_of_birth = date_of_birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate dateOfBirth) {
        this.date_of_birth = dateOfBirth;
    }

    public int getAge() {
        return Period.between(this.date_of_birth, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }
}
