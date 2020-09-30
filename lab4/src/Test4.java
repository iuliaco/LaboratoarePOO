import java.util.Vector;

class Person {
    public String name;
    public String address;

    public Person(String nume, String addres) {
        this.name = nume;
        this.address = addres;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Student extends Person {
    public Vector<String> courses;
    public Vector<Double> grades;


    public Student(String nume, String addres) {

        super(nume, addres);
        this.courses = new Vector<String>();
        this.grades = new Vector<Double>();
    }

    public void addCourseGrade(String curs, double nota) {
        this.courses.add(curs);
        this.grades.add(nota);
    }

    public void printGrades() {
        for (int i = 0; i < this.grades.size(); i++) {
            System.out.println(this.grades.get(i) + " " + this.courses.get(i));
        }
    }

    public double getAverageGrade() {
        double avg;
        avg = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            avg = avg + (Double) this.grades.get(i);
        }
        avg /= this.grades.size();
        return avg;
    }

    public String toString() {
        return "Student{" +
                "courses=" + courses +
                ", grades=" + grades +
                ", grades=" + super.name +
                ", grades=" + super.address +
                '}';
    }
}

class Teacher extends Person {
    public Vector<String> courses;

    public boolean addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            return true;
        }
        return false;
    }

    public Teacher(String nume, String addres) {
        super(nume, addres);
    }


    public boolean removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            return true;
        }
        return false;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", courses=" + courses +
                '}';
    }
}

public class Test4 {
    public static void main(String args[]) {
        Person student, teacher, person;
        student = new Student("Popescu Ion", "Bucuresti");
        teacher = new Teacher("Ionescu Gigel", "Bucuresti");
        person = new Person("Maria", "Iasi");
        assert (person.getName().equals("Maria")) : "Metoda getName din clasa Person nu este implementata corect";
        assert (((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Algoritmica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Matematica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).removeCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        ((Student) student).addCourseGrade("Programare", 10);
        ((Student) student).addCourseGrade("Algoritmica", 9);
        ((Student) student).addCourseGrade("Matematica", 8);
        assert (Math.abs(((Student) student).getAverageGrade() - 9.00) <= 0.001) : "Metoda getAverageGrade din clasa " +
                "Student nu a fost implementat corect";
        ((Student) student).printGrades();
        //Ce metoda toString se va apela? Din ce clasa?
        System.out.println(student);
        System.out.println(person);
        System.out.println("Felicitari! Problema a fost rezolvata corect!");
    }
}