package com.assignments.assignment6.controller;

import com.assignments.assignment6.entity.Student;
import com.assignments.assignment6.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentsRepository repo;

    @GetMapping(value = "/students/")
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @PostMapping(value = "/students/")
    public Student createStudent(@RequestBody Student student_p) {
        return repo.save(student_p);
    }

    @PutMapping(value = "/students/")
    public Student updateStudent(@RequestBody Student student_p) {
        return repo.save(student_p);
    }


}
