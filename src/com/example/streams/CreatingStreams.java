package com.example.streams;

import com.example.lambda.LambdaScope;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
    private void testCollectionStreams(){

    }
    private void testEmptyStreams(){
        Stream<Student> studentsEmptyStream = Stream.empty();
        System.out.println("Empty stream: "+studentsEmptyStream.count());
    }
    private void testStreamsFromValues(){
        Stream<Student> students = Stream.of(
                new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8),
                new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2),
                new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3),
                new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80),
                new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70)
        );
        System.out.println(students.count());
        Student[] students1 = {
                new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8),
                new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2),
                new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3),
                new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80),

        };
        Stream<Student> studentStream2 = Stream.of(students1);
    }
    private void testFileStream(){
        try{
            Stream<String> fileLines = Files.lines(Paths.get("/home/soumbr/Documents/LambdaAndStreams/input.txt"));
            fileLines.forEach(System.out::println);
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
    public void testGenerateIterateStreams(){
        Stream<Double> randomStream = Stream.generate(Math::random);
        //randomStream.forEach(System.out::println);
        //iterate
        Stream<Integer> wholeNumbers = Stream.iterate(1,i->i+1);
        //wholeNumbers.forEach(System.out::println);
    }
    public static void main(String[] args){
        new CreatingStreams().testEmptyStreams();
        new CreatingStreams().testStreamsFromValues();
        new CreatingStreams().testGenerateIterateStreams();
    }
}
