import java.util.Scanner;

public class StudentInputHandler {
    private GradeCalculator calculator;
    private C GradeConstants;
    private String[] studentNames = new String[20];
    private int studentCount;

    void inputName(int studentCount) {
        int i;
        for (i = 0; i < studentCount; i++) {
            IO.print("\nStudent " + (i + 1) + " name: ");
            studentNames[i] = IO.readln().trim();
        }
    }


    int inputStudentCount() {
        Scanner scanner = new Scanner(System.in);
        int i;
        IO.println("=== STUDENT DATA ENTRY ===");
        IO.print("How many students (1-20): ");
        studentCount = Integer.parseInt(IO.readln().trim());
        return studentCount;
    }


    double inputLabPerformance(int i) {
        IO.println("--- Entering grades for " + studentNames[i] + "---");

        IO.print(" Enter Laboratory Performance Average: ");
        double labAvg = Double.parseDouble(IO.readln().trim());

        return labAvg;
    }


    Student inputOneStudent(int i) {
        IO.print("\nStudent " + (i + 1) + " name: ");
        String name = IO.readln().trim();

        studentNames[i] = name;


        double labAvg = inputLabPerformance(i);
        System.out.printf(" Laboratory Performance Average: %.2f \n", labAvg);

        double classPart = inputComponentScore("Class Participation (averaged score)");
        double teachEval = inputComponentScore("Teacher's Evaluation (averaged score)");
        double pracExam  = inputComponentScore("Practical Exam");
        double proj      = inputComponentScore("Project");

        return new Student(name, labAvg, classPart, teachEval, pracExam, proj);
    }


    double inputComponentScore(String componentName) {
        IO.print(" " + componentName + ": ");
        return Double.parseDouble(IO.readln().trim());
    }

}



