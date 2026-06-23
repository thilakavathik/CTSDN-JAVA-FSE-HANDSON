package MVCPatternExample;

public class StudentView {
    public void printStudentDetails(String studentName, int studentRollNo, String studentGPA) {
        System.out.println("Student:");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
        System.out.println("GPA: " + studentGPA);
    }
}
