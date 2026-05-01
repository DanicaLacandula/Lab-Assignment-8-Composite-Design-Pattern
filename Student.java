package edu.neu;

public class Student implements EducationalUnit {

    private final String name;
    private final String studentId;
    private final double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name       = name;
        this.studentId  = studentId;
        this.tuitionFee = tuitionFee;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStudentCount() {
        return 1;
    }


    @Override
    public double getBudget() {
        return -tuitionFee;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "🎓 Student   : " + name);
        System.out.println(indent + "   ID        : " + studentId);
        System.out.printf( indent + "   Tuition   : PHP %.2f%n", tuitionFee);
    }


    public String getStudentId() { return studentId;  }
    public double getTuitionFee(){ return tuitionFee; }
}