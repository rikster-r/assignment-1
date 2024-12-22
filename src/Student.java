import java.util.ArrayList;

public class Student extends Person {
    private static int counter = 0;
    private int studentID;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int age, boolean gender, ArrayList<Integer> grades) {
        super(name, surname, age, gender);
        this.studentID = counter++;
        this.grades = grades;
    }

    public int getStudentID() {
        return studentID;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public float calculateGPA() {
        int totalPoints = 0;
        for (Integer grade : grades) {
            totalPoints += grade;
        }

        return totalPoints / (float) grades.size();
    }

    public String toString() {
        return super.toString() + ". I am a student with ID " + studentID;
    }
}
