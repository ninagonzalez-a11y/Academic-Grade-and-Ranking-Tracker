public class GradeCalculator {
    private GradeConstants C;

    public double computeAverage(double[] scores){
        int numberOfScores = scores.length;
        double sum = 0;

        for (double score : scores) {
            sum = sum + score;
        }

        return sum/numberOfScores;
    }

    public double computeRawGrade(double labPerformance,
                                  double classParticipation,
                                  double teacherEvaluation,
                                  double practicalExam,
                                  double project){
        return (labPerformance * C.LAB_WEIGHT) +
                (classParticipation * C.PARTICIPATION_WEIGHT) +
                (teacherEvaluation * C.TEACHER_WEIGHT) +
                (practicalExam * C.EXAM_WEIGHT) +
                (project * C.PROJECT_WEIGHT);
    }
    public String assignNumericGrade(double avg){
        // [TRACE] Input: 96 or greater than 96; Output: "4.0"
        if (avg >= 96) {
            return "4.0";
            // [TRACE] Input: inclusively between 92 and 95; Output: "3.5"
        } else if (avg <= 95 && avg >= 92) {
            return "3.5";
            // [TRACE] Input: inclusively between 88 and 91; Output: "3.0"
        } else if (avg <= 91 && avg >= 88) {
            return "3.0";
            // [TRACE] Input: inclusively between 83 and 87; Output: "2.5"
        } else if (avg <= 87 && avg >= 83) {
            return "2.5";
            // [TRACE] Input: inclusively between 78 and 82; Output: "2.0"
        } else if (avg <= 82 && avg >= 78) {
            return "2.0";
            // [TRACE] Input: inclusively between 74 and 77; Output: "1.5"
        } else if (avg <= 77 && avg >= 74) {
            return "1.5";
            // [TRACE] Input: inclusively between 70 and 73; Output: "1.0"
        } else if (avg <= 73 && avg >= 70) {
            return "1.0";
            // [TRACE] Input: below 70; Output: "0.0"
        } else {
            return "0.0";
        }
    }
    public char assignLetterRank(double avg){
        // [TRACE] Input: greater than or equal to 96; Output: "S"
        if (avg >= 96) {
            return 'S';
            // [TRACE] Input: inclusively between 92 and 95; Output: "A"
        } else if (avg <= 95 && avg >= 92) {
            return 'A';
            // [TRACE] Input: inclusively between 88 and 91; Output: "B"
        } else if (avg <= 91 && avg >= 88) {
            return 'B';
            // [TRACE] Input: inclusively between 83 and 87; Output: "C"
        } else if (avg <= 87 && avg >= 83) {
            return 'C';
            // [TRACE] Input: inclusively between 78 and 82; Output: "D"
        } else if (avg <= 82 && avg >= 78) {
            return 'D';
            // [TRACE] Input: inclusively between 74 and 77; Output: "E"
        } else if (avg <= 77 && avg >= 74) {
            return 'E';
            // [TRACE] Input: inclusively between 70 and 73; Output: "P"
        } else if (avg <= 73 && avg >= 70) {
            return 'P';
            // [TRACE] Input: less than 70; Output: "F"
        } else {
            return 'F';
        }
    }

    public String getRemarks(String grade){
        return switch (grade) {
            case "4.0" -> "Excellent"; //[TRACE] Input: "4.0"; Output: "Excellent"
            case "3.5" -> "Superior"; //[TRACE] Input: "3.5"; Output: "Superior"
            case "3.0" -> "Very Good"; //[TRACE] Input: "3.0"; Output: "Very Good"
            case "2.5" -> "Good"; //[TRACE] Input: "2.5"; Output: "Good"
            case "2.0" -> "Satisfactory"; //[TRACE] Input: "2.0"; Output: "Satisfactory"
            case "1.5" -> "Fair"; //[TRACE] Input: "1.5"; Output: "Fair"
            case "1.0" -> "Poor/Passed"; //[TRACE] Input: "1.0"; Output: "Poor/Passed"
            case "0.0" -> "Failed"; //[TRACE] Input: "0.0"; Output: "Failed"
            default -> "Invalid"; //[TRACE] Input: any number not in the grade range; Output: "Invalid"
        }; // placeholder
    }

    public String getRemarks(char rank){
// Convert to uppercase for case-insensitive matching
        return switch (rank) {
            case 'S' -> "Excellent";
            case 'A' -> "Superior";
            case 'B' -> "Very Good";
            case 'C' -> "Good";
            case 'D' -> "Satisfactory";
            case 'E' -> "Fair";
            case 'P' -> "Poor/Passed";
            case 'F' -> "Failed";
            default -> "Invalid";
        }; // placeholder
}
