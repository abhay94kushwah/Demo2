package stud;

import stud.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

    public Student(String math, String john, String smith, String miami, int i) {

    }

    public static void main(String[] args){


        List<Student> students = new ArrayList<>();
            students.add(new Student("Math", "John", "Smith", "Miami", 19));
            students.add( new Student("Programming", "Mike", "Miles", "New York", 21));
            students.add(new Student("Math", "Michael", "Peterson", "New York", 20));
            students.add(new Student("Math", "James", "Robertson", "Miami", 20));
            students.add(new Student("Programming", "Kyle", "Miller", "Miami", 20));

           // students.stream().map(student -> student.getClass()).collect(Collectors.groupingBy(students::getClass));

    }
}

