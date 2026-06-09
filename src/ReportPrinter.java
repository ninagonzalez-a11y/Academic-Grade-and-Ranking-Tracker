public class ReportPrinter {
    private C GradeConstants;
    private calculator GradeCalculator;

    void printClassStats(StudentRepository) {
        if (studentCount == 0) {
            double[] avg;
            IO.println("studentCount = 0 - No data to process");
            IO.println("Cannot compute class statistics. Please enter student data first (Option 1). ");
        } else {
            double highest = avg[0];
            double lowest = avg[0];
            double total = 0;

            String highestStudent = studentNames[0];
            String lowestStudent = studentNames[0];

            for (int i = 0; i < studentCount; i++) {

                total += avg[i];

                if (avg[i] > highest) {
                    highest = avg[i];
                    highestStudent = studentNames[i];
                }
                if (avg[i] < lowest) {
                    lowest = avg[i];
                    lowestStudent = studentNames[i];
                }
            }

            double classMean = total / studentCount;

            printSeparatorLine(50);
            IO.println("\nCLASS STATISTICS");
            printSeparatorLine(50);
            System.out.printf("\nTotal Students: %d\n", studentCount);
            printSeparatorLine(50);

            System.out.printf("\nHighest Raw Grade: %s (%.2f) - Rank: %s-tier", highestStudent, highest, assignLetterRank(highest));
            System.out.printf("\nLowest Raw Grade: %s (%.2f) - Rank: %s-tier", lowestStudent, lowest, assignLetterRank(lowest));
            System.out.printf("\nclass Mean: %.2f - Rank %s-tier\n", classMean, assignLetterRank(classMean));
            printSeparatorLine(50);

        }


    }

    void printReport(StudentRepository) {
        // [DECLARE] Where the report of each student is displayed as a summary
        printSeparatorLine(75);
        IO.println("\nSTUDENT GRADE REPORT");
        printSeparatorLine(75);

        System.out.printf("%-5s %-20s %-12s %-8s %-6s %-15s\n",
                "\nNo.", "Name", "Raw Grade", "Grade", "Rank", "Remarks");


        for (int i = 0; i < studentCount; i++) {

            String remarks = getRemarks(numericGrades[i]);

            System.out.printf("%-5d %-20s %-12.2f %-8s %-6s %-15s\n",
                    (i + 1),
                    studentNames[i],
                    rawGrades[i],
                    numericGrades[i],
                    letterRanks[i],
                    remarks
            );
        }
        printSeparatorLine(75);
    }

    // [DECLARE] For the menu-driven interface divider
    public void printSeparatorLine(int k) {
        for (int i = 0; i < k; i++) {
            IO.print("=");
        }

    }
}
