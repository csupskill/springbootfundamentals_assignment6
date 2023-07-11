package com.assignments.assignment6.repository;

import com.assignments.assignment6.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student, Integer> {
}
