package com.driver;
import java.util.*;
public class StudentRepository {

    HashMap<String, Student> studentdb = new HashMap<>();
    HashMap<String, Teacher> teacherdb = new HashMap<>();
    HashMap<String, List<String>>  studentteacherPair = new HashMap<>();

    public void addStudentdb(Student student)
    {
        String name=student.getName();

        studentdb.put(name, student);
    }

    public void addTeacherdb(Teacher teacher)
    {
        String name=teacher.getName();

        teacherdb.put(name, teacher);
    }

    public void addpair(String student, String teacher)
    {
        List<String> s =studentteacherPair.getOrDefault(teacher, new ArrayList<>());
        s.add(student);

    }

    public Student getSt(String  s)
    {

        return studentdb.get(s);
    }

    public Teacher getT(String s)
    {
        return teacherdb.get(s);
    }

    public List<String> getStudentsAssigned(String teacher)
    {
        return studentteacherPair.get(teacher);
    }

    public List<String> getStudents()
    {
        List<String> st = new ArrayList<>();

        for(String name : studentdb.keySet())
            st.add(name);
        return st;
    }

    public void deleteTe(String name)
    {
        if(teacherdb.containsKey(name))
            teacherdb.remove(name);


    }

    public void deleteAllteachers()
    {
        teacherdb.clear();

    }
}