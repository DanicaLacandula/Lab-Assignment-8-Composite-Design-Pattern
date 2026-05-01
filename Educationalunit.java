package edu.neu;

public interface EducationalUnit {

    String getName();
    int getStudentCount();
    double getBudget();

    void displayDetails(String indent);
}