package tutorial.simplerest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tutorial.simplerest.model.Student;
import tutorial.simplerest.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("list")
    public List<Student> all() {
        return studentService.getStudents();
    }

    @PostMapping("add")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @PutMapping("update/{studentID}")
    public void updateStudent(
            @PathVariable("studentID") Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        studentService.updateStudent(id, name, email);
    }

    @DeleteMapping("delete/{studentID}")
    public void deleteStudent(@PathVariable("studentID") Long id) {
        studentService.deleteStudent(id);
    }

}
