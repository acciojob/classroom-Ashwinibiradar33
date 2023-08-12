package com.driver;

import java.util.List;

public class StudentService {

    StudentRepository studentRepository = new StudentRepository();
    public void addStudents(Student student)
    {
        studentRepository.addStudentdb(student);

    }

    public void addTeacher(Teacher teacher)
    {
        studentRepository.addTeacherdb(teacher);
    }
    public void addTeacherStudentPair(String student, String teacher)
    {
        studentRepository.addpair(student, teacher);
    }

    public Student getStudentByname(String name)
    {
        return studentRepository.getSt(name);
    }
    public Teacher findt(String name)
    {
        return studentRepository.getT(name);
    }

    public List<String> getStudentsAssignedToTeacher(String name)
    {
        return studentRepository.getStudentsAssigned(name);
    }

    public List<String> getAllStudentsfromService()
    {
        return studentRepository.getStudents();
    }

    public void deleteTeacher(String name)
    {
        studentRepository.deleteTe(name);
    }

    public void deleteAll()
    {
        studentRepository.deleteAllteachers();
    }
}