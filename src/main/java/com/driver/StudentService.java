package com.driver;


import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
        ResponseEntity<String> addStudent(Student student);

        ResponseEntity<Student> getStudentByName(String name);

        ResponseEntity<List<String>> getAllStudents();

        ResponseEntity<String> deleteAllStudents();
    }


