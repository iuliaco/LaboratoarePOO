import java.util.TreeSet;

public class BestTotalScore implements  Strategy{
    public Student getBestStudent(TreeSet<Grade> grades) {
        Grade student = grades.first();
        for (Grade grade: grades) {
            if(grade.getTotal() > student.getTotal()) {
                student = grade;
            }
        }
        return student.getStudent();
    }
}
