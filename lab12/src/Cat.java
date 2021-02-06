public class Cat implements Visitor {
        public void visit (Director f) {
            // avertisment ca avem folder, nu fisier
            System.out.println("Nu poti folosi cat pe un director");
        }
        public void visit (Fisier f) {
            // citire fisier, folosind numele fisierului
            System.out.println(f.getName());

        }
    }

