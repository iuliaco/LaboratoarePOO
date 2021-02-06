import java.util.TreeSet;

public class BestPartialScore implements Strategy{
    public Student getBestStudent(TreeSet<Grade> grades) {
        Grade student = grades.first();
        for (Grade grade: grades) {
            if(grade.getPartialScore() > student.getPartialScore()) {
                student = grade;
            }
        }
        return student.getStudent();
    }
}
