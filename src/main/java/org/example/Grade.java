package org.example;

public class Grade {

  private double grade;
  private int weight;
  //3 - is for test/exam, 2 - for oral presentation or elaborated activity,
  // 1 - for class activity or homework
  private String comment;
  private boolean passed;

  public Grade() {
  }

  public Grade(double grade, int weight, String comment, boolean passed) {
    this.grade = grade;
    this.weight = weight;
    this.comment = comment;
    this.passed = passed;
  }

  public double getGrade() {
    return grade;
  }

  public int getWeight() {
    return weight;
  }

  public String getComment() {
    return comment;
  }

  public boolean isPassed() {
    if(getGrade() < 3.0) return false;
    return passed;
  }

  @Override
  public String toString() {
    return "Grade{" +
        "grade=" + grade +
        ", weight=" + weight +
        ", comment='" + comment + '\'' +
        ", passed=" + isPassed() +
        '}';
  }
}