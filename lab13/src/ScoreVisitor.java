import java.util.ArrayList;
import java.util.HashMap;

public class ScoreVisitor implements Visitor {
    private HashMap<Teacher, ArrayList<Pair<Student, String, Double>>> examScores;
    private HashMap<Assistant, ArrayList<Pair<Student, String, Double>>> partialScores;
    public ScoreVisitor(HashMap<Teacher, ArrayList<Pair<Student, String, Double>>> examScores, HashMap<Assistant, ArrayList<Pair<Student, String, Double>>> partialScores){
        this.examScores=examScores;
        this.partialScores=partialScores;
    }
    public void visit(Assistant assistant) {
        ArrayList<Pair<Student, String, Double>> pair = partialScores.get(assistant);
        for (Pair<Student, String, Double> pereche: pair) {
            Course curs = Catalog.getInstance().getCourse(pereche.getValue1());
            int gasit = 0;
            for (Grade grade: curs.grades) {
                if(grade.getStudent() == pereche.getKey()) {
                    gasit = 1;
                    grade.setPartialScore(pereche.getValue2());
                }
            }
            if(gasit == 0) {
                Grade nota = new Grade(curs.nume, pereche.getKey());
                nota.setPartialScore(pereche.getValue2());
                curs.grades.add(nota);

            }
        }
    }
    public void visit(Teacher teacher) {
        // **TODO2**
        ArrayList<Pair<Student, String, Double>> pair = examScores.get(teacher);
        for (Pair<Student, String, Double> pereche: pair) {
            Course curs = Catalog.getInstance().getCourse(pereche.getValue1());
            int gasit = 0;
            for (Grade grade: curs.grades) {
                if(grade.getStudent() == pereche.getKey()) {
                    gasit = 1;
                    grade.setExamScore(pereche.getValue2());
                }
            }
            if(gasit == 0) {
                Grade nota = new Grade(curs.nume, pereche.getKey());
                nota.setExamScore(pereche.getValue2());
                curs.grades.add(nota);

            }
        }
    }
}