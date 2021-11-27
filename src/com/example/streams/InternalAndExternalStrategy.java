package com.example.streams;

import java.util.ArrayList;
import java.util.List;

public class InternalAndExternalStrategy {
    public static ArrayList<Student> createListOfStudents(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electronic", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        return students;
    }
    List<Student> students = InternalAndExternalStrategy.createListOfStudents();
    List<Student> top2department = new ArrayList<>();
    private void testExternalIteration1(){
        for(Student student: students){
            if(student.getEngDepartment().equals("Electronic")){
                top2department.add(student);
            }
        }
        System.out.println("Top 2 departments "+top2department);
    }
    private void testInternalIteration(){
        students.parallelStream()
                .filter((student -> student.getEngDepartment().equals("Electronic")?true:false))
                .map(Student::getName)
                .limit(2)
                .forEach(System.out::println);
    }
    public static void main(String[] args){
        new InternalAndExternalStrategy().testExternalIteration1();
        new InternalAndExternalStrategy().testInternalIteration();
    }
}
