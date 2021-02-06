import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        //testare exercitiu 2
        User studentA = UserFactory.createUser("Student", "A", "Popescu");
        User studentB = UserFactory.createUser("Student", "B", "Ionescu");
        User studentC = UserFactory.createUser("Student", "C", "Ionescu");

        User mother = UserFactory.createUser("Parent", "MAC", "Ionescu");
        User father = UserFactory.createUser("Parent", "MAC", "Ionescu");

        User teacher = UserFactory.createUser("Teacher", "Teacher", "Georgescu");
        User assistant = UserFactory.createUser("Assistant", "Assistant", "Popescu");

        //testare exercitiu 3+5
        Course course = new Course.CourseBuilder("POO").teacher((Teacher) teacher)
                .assistant((Assistant) assistant).grade(new Grade("POO", (Student) studentA, 4d,5d))
                .grade(new Grade("POO", (Student) studentB,3d,3d)).strategy(new BestExamScore()).build();

        System.out.println("Curs: "+ course);
        System.out.println("Best Student:" + course.getBestStudent());

        //testare exercitiu 1+3+5
        Catalog catalog = Catalog.getInstance();
        catalog.addCourse(course);

        //testare exercitiu 4
        ((Student) studentB).setMother((Parent) mother);
        ((Student) studentB).setFather((Parent) father);
        ((Student) studentC).setMother((Parent) mother);

        catalog.addObserver((Parent) mother);
        catalog.addObserver((Parent) father);
        catalog.notifyObservers(new Grade("POO", (Student)studentB,2.5d,3d));
        System.out.println(mother);
        System.out.println(father);

        //testare exercitiu 6
        HashMap<Teacher, ArrayList<Pair<Student, String, Double>>> examScores=new HashMap<>();
        ArrayList<Pair<Student, String, Double>> ar1=new ArrayList<>();
        ar1.add(new Pair(studentA,"POO",3.6d));
        examScores.put((Teacher)teacher,ar1);

        HashMap<Assistant, ArrayList<Pair<Student, String, Double>>> partialScores= new HashMap<>();
        ArrayList<Pair<Student, String, Double>> ar2=new ArrayList<>();
        ar2.add(new Pair(studentC,"POO",4.6d));
        partialScores.put((Assistant)assistant,ar2);

        Visitor v=new ScoreVisitor(examScores,partialScores);

        v.visit((Teacher)teacher);
        System.out.println("Actualizare teacher:" + catalog);

        v.visit((Assistant)assistant);
        System.out.println("Actualizare assistant:" + catalog);

    }
}