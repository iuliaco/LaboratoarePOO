//package lab08;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

class Catalog extends TreeSet<Catalog.Student> {
    public Catalog (Comparator comparator ) {
        super(comparator);
    }
    public Catalog ( ) {
        super();

    }

    public void removeStudent(String nume) {
        Student stud = getStudent(nume);
        if(stud == null) {
            return;
        }
        this.remove(stud);
    }

    public Student getStudent(String nume) {
        for(Catalog.Student stud: this) {
            if(stud.name.equals(nume)) {
                return stud;
            }
        }
        return null;
    }

    public Catalog byClass(int clazz) {
        Catalog clasa = new Catalog();
        for(Catalog.Student student: this) {
            if(student.clazz == clazz) {
                clasa.add(student);
            }
        }
        return clasa;
    }

    class Student implements Comparable<Student> {
        public String name;
        public double media;
        public int clazz;
        public Student(String nume, double media, int grupa) {
            this.name = nume;
            this.media = media;
            this.clazz = grupa;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", media=" + media +
                    ", clazz=" + clazz +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
//            Student student = (Student) o;
            int retval = Double.compare(this.media, o.media);
            if(retval == 0) {
                int ret2 = name.compareTo(o.name);
                return ret2;
            }
            return retval;
        }

    }
    public void addStudent(String nume, double media, int grupa) {
    Student student = new Student(nume, media, grupa);
    add(student);
    }
}

public class Task2 {

    public static void main(String args[]) {
        Catalog catalog = new Catalog();
        catalog.addStudent("Alexandru", 7, 324);
        catalog.addStudent("Ioana", 5, 321);
        catalog.addStudent("Maria", 10, 322);
        catalog.addStudent("Ionut", 6.2, 323);
        catalog.addStudent("Diana", 7, 322);

        Catalog catalog2 = new Catalog(new Comparator<Catalog.Student>() {
            @Override
            public int compare(Catalog.Student o1, Catalog.Student o2) {
                // TODO: Sort by average (descending) and by name (ascending).
                Catalog.Student student1 = (Catalog.Student) o1;
                Catalog.Student student2 = (Catalog.Student) o2;
                int retval = Double.compare(student1.media, student2.media);
                if(retval == 0) {
                    int ret2 = student1.compareTo(student2);
                    return ret2;
                }
                return retval;
            }
        });
        catalog2.addAll(catalog);

        System.out.println("Verificam...");
        System.out.println("Continutul colectiei: " + catalog);
        System.out.println("Continutul colectiei: " + catalog2);

        Catalog.Student last = null;
        for (Catalog.Student o : catalog) {
            if (last == null) {
                last = o;
                continue;
            }
            int r = last.media != o.media ? new Double(last.media).compareTo(o.media) : last.name.compareTo(o.name);
            if (r != last.compareTo(o)) {
                System.err.println("Catalog.Student.compareTo a fost implementata gresit.");
            }
        }

        if (catalog.size() != 5) {
            System.err.println("Catalog.size() a fost implementata gresit.");
        }

        catalog.removeStudent("Ionut");
        if (catalog.size() != 4) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }
        catalog.removeStudent("");
        if (catalog.size() != 4) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }

        if (catalog.byClass(322).size() != 2) {
            System.err.println("Catalog.byClass() a fost implementata gresit.");
        }

        catalog.removeStudent("Maria");
        if (catalog.byClass(322).size() != 1) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }

        if (catalog.getStudent("Maria") != null) {
            System.err.println("Catalog.getStudent() a fost implementata gresit.");
        }

        if ((catalog.getStudent("Alexandru") == null) || (catalog.getStudent("Alexandru").media != 7)) {
            System.err.println("Catalog.getStudent() a fost implementata gresit.");
        }
    }

}
