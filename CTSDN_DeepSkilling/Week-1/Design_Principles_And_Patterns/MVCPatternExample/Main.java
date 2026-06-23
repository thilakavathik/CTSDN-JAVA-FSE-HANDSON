package MVCPatternExample;

public class Main {
    public static void main(String[] args) {
        Student model = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        model.setName("John Doe");
        model.setRollNo(12345);
        model.setGPA("3.5");

        controller.updateStudentView();
    }
}