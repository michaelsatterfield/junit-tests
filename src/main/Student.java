import java.util.ArrayList;

public class Student {
    private Long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(Long _id, String _name){
    this.id = _id;
    this.name = _name;
    this.grades = new ArrayList<>();

    }
    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.size() ;
    }

}
