/*
Responsibility: Single student data model
Single reason to change: Student's stored fields change
*/

// [UNDERSTAND]
public class Student {
    private String name ;
    private double rawGrade, idNumber, numericGrade;
    private char letterRank;

    public String getIdNumber(){

        return "";
    }

    public String setNumericGrade(String numericGrade){
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

    public double getRawGrade(){

        return 0;
    }

    public double setRawGrade(double rawGrade){
        double finalGrade = (labAvg * 0.40) + (classPart * 0.05) + (teachEval * 0.05) + (pracExam * 0.20) + (proj * 0.30);
        rawGrade[i] = finalGrade;
        return finalGrade;
    }

    public void setIdNumber(String idNumber){

    }

    public String getNumericGrade(){

        return "";
    }

    public char setLetterRank(char letterRank){
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

    public String getName(){

        return "";
    }

    public char getLetterRank(){

        return 'c';
    }

    public void setName(String name){

    }

}
