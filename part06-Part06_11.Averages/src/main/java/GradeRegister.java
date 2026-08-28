
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradesConvert;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradesConvert = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.gradesConvert.add(points);
    }

    public double averageOfPoints() {
        if (gradesConvert.isEmpty()) {
            return -1;
        }
        int somma = 0;
        for (int integer : this.gradesConvert) {
            somma += integer;
        }
        return (double) somma / this.gradesConvert.size();
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        int somma = 0;
        for (int integer : grades) {
            somma += integer;
        }
        return (double) somma / (this.grades.size());
    }
}
