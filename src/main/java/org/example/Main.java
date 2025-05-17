package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    StudentEvaluationManager studentEvaluationManager = new StudentEvaluationManager();
    List<Student> students = new ArrayList<>();

    Student student1 = new Student("Anna", "Kowalska", 3, 2);
    Student student2 = new Student("Krzysztof", "Smith", 3, 1);
    Student student3 = new Student("Kamil", "Adamski", 3, 5);

    students.add(student1);
    students.add(student2);
    students.add(student3);

    student1.addGrade(new Grade(4.0,1,"ok", true));
    student1.addGrade(new Grade(4.5,1,"ok", true));
    student1.addGrade(new Grade(5, 3, "n/a", true));
    student1.addGrade(new Grade(1, 1, "n/a", false));

    student2.addGrade(new Grade(3.5,2,"ok", true));
    student2.addGrade(new Grade(3,3,"ok", true));
    student2.addGrade(new Grade(4,3,"ok", true));
    student2.addGrade(new Grade(4, 1, "n/a", true));

    System.out.println("Average for student: " + student1.getSurname() +
       ": " + student1.calculateAverage());
    System.out.println("Weighted average for student: "
        + student1.getSurname() + ": " + student1.calculateWeightedAverage());
    System.out.println("Student has enough grades? " + student1.hasSufficientGrades());

    List<String> names = List.of("Mark", "Adam", "Patricia", "Alex");

    List<Student> studentsWithName = names.stream()
        .map(Student::new)
        .toList();

    students.addAll(studentsWithName);

    System.out.println("Students by weighted average: " +
        studentEvaluationManager.getStudentsByWeightedAverage(students));

    System.out.println(student1);

    studentEvaluationManager.evaluateStudentActivity(students);

  }
}