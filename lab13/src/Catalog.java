import java.util.ArrayList;

public class Catalog implements Subject{
    public ArrayList<Course> cursuri;
    public ArrayList<Observer> observers;
    private static Catalog catalog_instance = null;

    private Catalog(){
        observers = new ArrayList<>();
        cursuri = new ArrayList<>();
    }
    public static  Catalog getInstance() {
        if(catalog_instance == null) {
            catalog_instance = new Catalog();
        }
        return catalog_instance;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "cursuri=" + cursuri +
                '}';
    }

    public void addCourse(Course course) {
        cursuri.add(course);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Grade grade) {
        for (Observer o: observers) {
            if(grade.getStudent().getMother() == o) {
                o.update(new Notification(grade));
            }
            if(grade.getStudent().getFather() == o) {
                o.update(new Notification(grade));
            }
        }
    }
    public Course getCourse(String name) {
        for (Course curs: cursuri) {
            if(curs.nume.equals(name)) {
                return curs;
            }
        }
        return null;
    }
}
