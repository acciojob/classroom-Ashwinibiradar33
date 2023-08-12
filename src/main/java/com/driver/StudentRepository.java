package com.driver;

import java.util.List;

public interface StudentRepository {
    void addStudent(Student student);

    Student getStudentByName(String name);

    List<Student> getAllStudents();

    void deleteAllStudents();
}
