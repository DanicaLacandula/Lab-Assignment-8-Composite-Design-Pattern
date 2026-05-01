package edu.neu;

public class Teacher implements EducationalUnit {

    private final String name;
    private final String subject;
    private final double salary;

    public Teacher(String name, String subject, double salary) {
        this.name    = name;
        this.subject = subject;
        this.salary  = salary;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public double getBudget() {
        return salary;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "👨‍🏫 Teacher  : " + name);
        System.out.println(indent + "   Subject  : " + subject);
        System.out.printf( indent + "   Salary   : PHP %.2f%n", salary);
    }


    public String getSubject() { return subject; }
    public double getSalary()  { return salary;  }
}