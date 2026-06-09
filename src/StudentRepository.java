/*
Responsibility: Student collection (add/get)
Single reason to change: Storage strategy changes
*/

public class StudentRepository {
    private GradeConstants c;
    private Student[] students;
    private int count;

    public StudentRepository(int capacity) {
        this.students = new Student[capacity];
        this.count = 0;
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Repository is full! Cannot add more students.");
        }
    }

    public int getStudentCount() {
        return this.count;
    }

    public Student getStudent(int index) {
        if (index >= 0 && index < count) {
            return students[index];
        }
        return null;
    }

    // --- Dynamic adapters to support legacy ReportPrinter code ---
    public double[] getRawGrades() {
        double[] grades = new double[count];
        for (int i = 0; i < count; i++) {
            grades[i] = students[i].getRawGrade();
        }
        return grades;
    }

    public String[] getStudentNames() {
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            names[i] = students[i].getName();
        }
        return names;
    }

    public String[] getNumericGrades() {
        String[] grades = new String[count];
        for (int i = 0; i < count; i++) {
            grades[i] = students[i].getNumericGrade();
        }
        return grades;
    }

    public char[] getLetterRanks() {
        char[] ranks = new char[count];
        for (int i = 0; i < count; i++) {
            ranks[i] = students[i].getLetterRank();
        }
        return ranks;
    }

    public void setC(GradeConstants c) { this.c = c; }
    public GradeConstants getC() { return this.c; }
    public Student[] getStudents() { return this.students; }
    public int getCount() { return this.count; }
}