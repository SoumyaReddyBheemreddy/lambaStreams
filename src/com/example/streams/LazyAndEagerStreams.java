package com.example.streams;

import com.example.lambda.LambdaScope;

import java.util.List;
import java.util.stream.Stream;

public class LazyAndEagerStreams {
    List<Student> students = InternalAndExternalStrategy.createListOfStudents();
    private  void testLazy(){
        students.stream().filter(
                student -> {
                    System.out.println("Inside lazy operator");
                    return student.getEngDepartment().equals("Electronic")?true:false;
                }
        ).count();
    }
    private void testEager(){
        Stream<Student> studentStream =
                students.stream().filter(
                        student -> {
                            System.out.println("Fitering");
                            return student.getEngDepartment().equals("Electronic")?true:false;
                        }
                ).map(
                        s->{
                            System.out.println("Mapping");
                            return s;
                        }
                );
        System.out.println(""+studentStream.count());
    }
    public static void main(String[] args){
        new LazyAndEagerStreams().testLazy();
        new LazyAndEagerStreams().testEager();
    }
}
