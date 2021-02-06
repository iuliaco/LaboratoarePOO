import java.util.ArrayList;
import java.util.TreeSet;

public class Course {
    public String nume;
    public Teacher titular;
    ArrayList<Assistant> asistenti;
    ArrayList<Student> students;
    TreeSet<Grade> grades;
    public Strategy strategy;
    public Course(CourseBuilder curse) {
        this.nume = curse.nume;
        this.titular = curse.titular;
        this.asistenti = curse.asistenti;
        this.students = curse.students;
        this.grades = curse.grades;
        this.strategy = curse.strategy;
    }
    @Override
    public String toString() {
        return "Course{" +
                "nume='" + nume + '\'' +
                ", titular=" + titular +
                ", asistenti=" + asistenti +
                ", students=" + students +
                ", grades=" + grades +
                '}';
    }
    static class CourseBuilder{
        private String nume;
        private Teacher titular;
        private ArrayList<Assistant> asistenti;
        private ArrayList<Student> students;
        private TreeSet<Grade> grades;
        private Strategy strategy;
        public CourseBuilder(String name) {
            nume = name;
            asistenti = new ArrayList<>();
            students = new ArrayList<>();
            grades = new TreeSet<>();
        }
        public CourseBuilder teacher(Teacher teacher) {
            this.titular = teacher;
            return this;
        }
        public CourseBuilder assistant(Assistant assistant) {
            this.asistenti.add(assistant);
            return this;
        }
        public CourseBuilder grade(Grade grade) {
            this.grades.add(grade);
            return this;
        }
        public CourseBuilder strategy(Strategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public Course build() {
            return new Course(this);
        }


    }

    public Student getBestStudent() {
        return strategy.getBestStudent(grades);
    }
    public void addGrade(Grade g) {
        this.grades.add(g);
    }
}
