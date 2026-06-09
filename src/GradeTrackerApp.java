/*
Responsibility: Menu loop and orchestration
Single reason to change: Menu options or wiring changes
*/

import java.util.Scanner;

public class GradeTrackerApp {
    private IdVerifier idVerifier;
    private StudentInputHandler inputHandler;
    private ReportPrinter printer;
    private StudentRepository repo;
    private C GradeConstants;

    public void displayMenu(){
    // [DECLARE] Where the menu will be prompted to the users
        String choice = "";
        printSeparatorLine(40);
        do {
            IO.println("\nGRADE TRACKER MENU");
            printSeparatorLine(40);
            IO.println("\n1. Enter Student Data");
            IO.println("2. View Report");
            IO.println("3. View Class Statistics");
            IO.println("4. Verify ID Number");
            IO.println("5. Exit");
            printSeparatorLine(40);
            IO.print("\nEnter choice (1-4): ");
            // Reads user input and removes any excess text
            choice = IO.readln().trim();

    // [UNDERSTAND] I used a switch case instead of an if-else because the choices deal with numbers as Strings
            switch (choice) {
                case "1": {
                    inputStudentData();
                    break;
                }

                case "2": {
                    printReport();
                    break;
                }

                case "3": {
                    computeClassStats(rawGrades);
                    break;
                }

                case "4": {
                    GradeTrackerWithVerification.verifyID();
                    break;
                }

                case "5": {
                    IO.println("Exiting...");
                    System.exit(0);
                    break;
                }

            }
        } while (!choice.equals("4"));
    }

    private void inputStudentData(){
        Scanner scanner = new Scanner(System.in);
        int i;
        IO.println("=== STUDENT DATA ENTRY ===");
        IO.print("How many students (1-20): ");
        studentCount = Integer.parseInt(IO.readln().trim());
        // [TRACE] When studentCount is 0, the loop will not occur

        for (i = 0; i < studentCount; i++) {
            IO.print("\nStudent " + (i + 1) + " name: ");
            studentNames[i] = IO.readln().trim();

            IO.println("--- Entering grades for " + studentNames[i] + "---");
            double labAvg = inputLabPerformance();
            System.out.printf(" Laboratory Performance Average: %.2f \n", labAvg);


            IO.print(" Class Participation (averaged score): ");
            double classPart = Double.parseDouble(IO.readln().trim());

            IO.print(" Teacher's Evaluation (averaged score): ");
            double teachEval = Double.parseDouble(IO.readln().trim());

            IO.print(" Practical Exam: ");
            double pracExam = Double.parseDouble(IO.readln().trim());

            IO.print(" Project: ");
            double proj = Double.parseDouble(IO.readln().trim());

            double finalGrade = computeRawGrade(labAvg, classPart, teachEval, pracExam, proj, i);
            numericGrades[i] = assignNumericGrade(finalGrade);
            letterRanks[i] = assignLetterRank(finalGrade);
            System.out.printf(studentNames[i] + "'s final raw score: %.2f\n", finalGrade);
        }
    }

    public void main(){

    }
}
