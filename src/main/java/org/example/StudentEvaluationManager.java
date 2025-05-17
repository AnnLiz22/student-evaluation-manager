package org.example;

import java.util.List;

public class StudentEvaluationManager {

public void evaluateStudentActivity(List<Student>students){

  for(Student student : students){
    if(student.hasSufficientPresence() && student.calculateWeightedAverage() >= 3.0){
      System.out.println("Student " + student.getName() + " " + student.getSurname()
          + ", " + student.getYearOfStudies() + " : evaluation successful. Student weighted average is: "
          + student.calculateWeightedAverage());
    } else if(!student.hasSufficientPresence()){
      System.out.println("Student " + student.getName() + " " + student.getSurname()
        + " "  + student.getYearOfStudies() + " has to many absences!");
    } else if (student.calculateWeightedAverage() <= 2.9) {
      System.out.println("Student "+ student.getName() + student.getSurname()
          + student.getYearOfStudies() + " : grade average is too low or student does not have enough grades. " + student.hasSufficientGrades());
    }
  }

}
}