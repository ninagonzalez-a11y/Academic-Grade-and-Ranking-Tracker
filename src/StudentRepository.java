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

    public Student getStudent(int index) {
        if (index >= 0 && index < count) {
            return students[index];
        }
        return null; // Index out of bounds or unpopulated
    }

    public void setC(GradeConstants c) {
        this.c = c;
    }

    public GradeConstants getC() {
        return this.c;
    }

    public void setStudents(Student[] students) {
        this.students = students;
        // Automatically sync count to the array size if an external array is provided
        this.count = (students != null) ? students.length : 0;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }
}