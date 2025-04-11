package br.com.futurodev.estudantes.controllers;

import br.com.futurodev.estudantes.models.Students;
import br.com.futurodev.estudantes.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Students>> students(){
        List<Students> students = this.studentService.listStudents();
        return students.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(students);
    }

    @PostMapping
    public ResponseEntity<Students> createStudent(@RequestBody Students student) throws Exception{
        this.studentService.createStudent(student);
        return ResponseEntity.ok(student);
    }
}
