package br.com.futurodev.estudantes.controllers;

import br.com.futurodev.estudantes.models.Database;
import br.com.futurodev.estudantes.models.Students;
import br.com.futurodev.estudantes.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

        if(students.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Students> createStudent(@RequestBody Students student) throws Exception{
        this.studentService.createStudent(student);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Students> ListOneStudent(@PathVariable Integer registration){
        Students student = Database.listOne(registration);
        if(student == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(student, HttpStatus.OK);

    }
}
