/*
Responsibility: Menu loop and orchestration
Single reason to change: Menu options or wiring changes
*/

import java.util.Scanner;

public class GradeTrackerApp {
    private IDVerifier idVerifier;
    private StudentInputHandler inputHandler;
    private ReportPrinter printer;
    private StudentRepository repo;
    private GradeConstants C; // Fixed: Type is GradeConstants, name is C


    private String[] studentNames = new String[20];
    private double[] rawGrades = new double[20];
    private double[] numericGrades = new double[20];
    private String[] letterRanks = new String[20];
    private int studentCount;

    public void displayMenu() {
        String choice = "";
        printSeparatorLine(40);

        do {
            System.out.println("\nGRADE TRACKER MENU");
            printSeparatorLine(40);
            System.out.println("\n1. Enter Student Data");
            System.out.println("2. View Report");
            System.out.println("3. View Class Statistics");
            System.out.println("4. Verify ID Number");
            System.out.println("5. Exit");
            printSeparatorLine(40);
            System.out.print("\nEnter choice (1-5): "); // Updated prompt to 1-5

            choice = IO.readln().trim();

            switch (choice) {
                case "1":
                    inputStudentData();
                    break;
                case "2":
                    System.out.println("Displaying report...");
                    break;
                case "3":
                    computeClassStats(rawGrades);
                    break;
                case "4":
                    if (idVerifier != null) {
                        idVerifier.verifyID();
                    } else {
                        System.out.println("ID Verifier not initialized.");
                    }
                    break;
                case "5":
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("5"));
    }

    // Kept inside the class as requested by your structure diagram
    private void inputStudentData() {
        System.out.println("=== STUDENT DATA ENTRY ===");
        System.out.print("How many students (1-20): ");
        studentCount = Integer.parseInt(IO.readln().trim());

        for (int i = 0; i < studentCount; i++) {
            System.out.print("\nStudent " + (i + 1) + " name: ");
            studentNames[i] = IO.readln().trim();

            System.out.println("--- Entering grades for " + studentNames[i] + "---");

            double labAvg = inputLabPerformance();
            System.out.printf(" Laboratory Performance Average: %.2f \n", labAvg);

            System.out.print(" Class Participation (averaged score): ");
            double classPart = Double.parseDouble(IO.readln().trim());

            System.out.print(" Teacher's Evaluation (averaged score): ");
            double teachEval = Double.parseDouble(IO.readln().trim());

            System.out.print(" Practical Exam: ");
            double pracExam = Double.parseDouble(IO.readln().trim());

            System.out.print(" Project: ");
            double proj = Double.parseDouble(IO.readln().trim());

            rawGrades[i] = computeRawGrade(labAvg, classPart, teachEval, pracExam, proj, i);
            numericGrades[i] = assignNumericGrade(rawGrades[i]);
            letterRanks[i] = assignLetterRank(rawGrades[i]);

            System.out.printf(studentNames[i] + "'s final raw score: %.2f\n", rawGrades[i]);
        }
    }

    public static void main(String[] args) {
        GradeTrackerApp app = new GradeTrackerApp();

        app.displayMenu();
    }

    private void printSeparatorLine(int len) { /* ... */ }
    private double inputLabPerformance() { return 0.0; }
    private double computeRawGrade(double l, double c, double t, double p, double pr, int i) { return 0.0; }
    private double assignNumericGrade(double score) { return 0.0; }
    private String assignLetterRank(double score) { return "A"; }
    private void computeClassStats(double[] grades) { /* ... */ }
}