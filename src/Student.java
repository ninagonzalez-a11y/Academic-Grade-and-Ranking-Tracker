/*
Responsibility: Single student data model
Single reason to change: Student's stored fields change
*/

/*
Responsibility: Single student data model
Single reason to change: Student's stored fields change
*/

public class Student {
    private String name;
    private double rawGrade;
    private char letterRank;
    private String idNumber;
    private String numericGrade;

    public Student(String name, double labAvg, double classPart, double teachEval, double pracExam, double proj) {}

    public Student(String name, double rawGrade, String numericGrade, char letterRank) {
        this.name = name;
        this.rawGrade = rawGrade;
        this.numericGrade = numericGrade;
        this.letterRank = letterRank;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRawGrade() {
        return this.rawGrade;
    }

    public void setRawGrade(double rawGrade) {
        this.rawGrade = rawGrade;
    }

    public String getNumericGrade() {
        return this.numericGrade;
    }

    public void setNumericGrade(String numericGrade) {
        this.numericGrade = numericGrade;
    }

    public char getLetterRank() {
        return this.letterRank;
    }

    public void setLetterRank(char letterRank) {
        this.letterRank = letterRank;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}