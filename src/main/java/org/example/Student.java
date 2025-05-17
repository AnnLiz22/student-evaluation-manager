package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

  private String name;
  private String surname;
  private int yearOfStudies;
  private int numOfAbsences;
  List<Grade> grades = new ArrayList<>();

  public Student(String name) {
    this.name = name;
  }

  public Student(String name, String surname, int yearOfStudies, int numOfAbsences) {
    this.name = name;
    this.surname = surname;
    this.yearOfStudies = yearOfStudies;
    this.numOfAbsences = numOfAbsences;
  }

  public void addGrade(Grade grade) {
    grades.add(grade);
  }

  public double calculateAverage() {
   return grades.stream()
        .mapToDouble(Grade::getGrade)
        .average()
        .orElseThrow(() -> new RuntimeException("Not possible to get average."));
  }

  public double calculateWeightedAverage() {
    double totalWeightedGrades = 0;
    double totalWeight = 0;

    if(!hasSufficientGrades())
      return 0.0;

    for (Grade grade : grades) {
      double weight = grade.getWeight();
      totalWeightedGrades += grade.getGrade() * weight;
      totalWeight += weight;
    }
    if (totalWeight == 0) return 0;
    return totalWeightedGrades / totalWeight;
  }

    public boolean hasSufficientGrades() {

      if (grades.size() <= 3) {
        return false;
     //   throw new RuntimeException("Not sufficient number of grades for effectuate evaluation");
      }
      return true;
    }

    public boolean hasSufficientPresence(){
      return numOfAbsences <= 2;
    }

    public String getName () {
      return name;
    }

    public String getSurname () {
      return surname;
    }

    public int getYearOfStudies () {
      return yearOfStudies;
    }

    public int getNumOfAbsences () {
      return numOfAbsences;
    }

    @Override
    public String toString () {
      return "Student{" +
          "name='" + name + '\'' +
          ", surname='" + surname + '\'' +
          ", yearOfStudies=" + yearOfStudies +
          ", numOfAbsences=" + numOfAbsences +
          ", grades=" + grades +
          '}';
    }
  }
