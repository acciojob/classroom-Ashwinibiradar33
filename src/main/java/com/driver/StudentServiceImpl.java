package com.driver;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
    public class StudentServiceImpl implements StudentService {
        private Map<String, Student> studentMap = new HashMap<>();

        @Override
        public ResponseEntity<String> addStudent(Student student) {
            studentMap.put(student.getName(), student);
            return ResponseEntity.ok("Student added successfully");
        }

        @Override
        public ResponseEntity<Student> getStudentByName(String name) {
            Student student = studentMap.get(name);
            if (student != null) {
                return ResponseEntity.ok(student);
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @Override
        public ResponseEntity<List<String>> getAllStudents() {
            List<String> studentNames = new ArrayList<>(studentMap.keySet());
            return ResponseEntity.ok(studentNames);
        }

        @Override
        public ResponseEntity<String> deleteAllStudents() {
            studentMap.clear();
            return ResponseEntity.ok("All students deleted");
        }
    }

