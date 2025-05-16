package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    StudentEvaluationManager studentEvaluationManager = new StudentEvaluationManager();

    Student student1 = new Student("Anna", "Kowalska", 3, 2);
    Student student2 = new Student("Krzysztof", "Smith", 3, 5);
    Student student3 = new Student("Krzysztof", "Smith", 3, 1);

    List <Grade> listOfGrades = List.of(
        new Grade(5, 3, "n/a", true),
    new Grade(4, 1, "n/a", true),
    new Grade(1, 1, "n/a", true),
    new Grade(5, 3, "n/a", true));

    student1.addGrade(listOfGrades.get(0));
    student1.addGrade(listOfGrades.get(1));
    student1.addGrade(listOfGrades.get(2));
    student1.addGrade(listOfGrades.get(3));

    System.out.println("Average for student: " + student1.calculateAverage());
    System.out.println("Weighted average for student: " + student1.calculateWeightedAverage());
    System.out.println("Student has enough grades?" + student1.hasSufficientGrades());

    List<Student> students = new ArrayList<>();
    students.add(student1);
    students.add(student2);
    students.add(student3);

    System.out.println(student1);

    studentEvaluationManager.evaluateStudentActivity(students);

  }
}