public class Problema5 {
    public static void main(String[] args) {
        ClockTime plec, sosesc, sosesc2;
        Route plecare, destinatie;
        Schedule prog1, prog2;
        Train tur, retur;
        plec = new ClockTime(10, 45);
        sosesc = new ClockTime(12, 30);
        sosesc2 = new ClockTime(15, 15);
        prog1 = new Schedule(plec, sosesc);
        prog2 = new Schedule(sosesc, sosesc2);
        plecare = new Route("Bucuresti", "Craiova");
        destinatie = new Route("Craiova", "Bucuresti");
        tur = new Train(plecare, prog1, true);
        retur = new Train(destinatie, prog2, false);
        System.out.println(prog1.duration());
        System.out.println(plecare.isRetour(destinatie));
        System.out.println(tur.toString());
        System.out.println(retur.price());
    }
}

class ClockTime {
    int hour;
    int minute;

    public ClockTime(int ora, int min) {
        this.hour = ora;
        this.minute = min;
    }

    public ClockTime compareLater(ClockTime ex) {
        if (ex.hour > hour) {
            return ex;
        } else if (ex.hour == hour) {
            if (ex.minute > minute) {
                return ex;
            } else {
                return this;
            }
        } else {
            return this;
        }
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }
}

class Schedule {
    ClockTime departure;
    ClockTime arrival;

    public Schedule(ClockTime ajungere, ClockTime sosire) {
        this.departure = ajungere;
        this.arrival = sosire;
    }

    public int duration() {
        return (arrival.hour - departure.hour) * 60 + (arrival.minute - departure.minute);
    }

}

class Route {
    String origin;
    String destination;

    public Route(String origine, String destinatie) {
        this.origin = origine;
        this.destination = destinatie;
    }

    public boolean isRetour(Route ruta) {
        if (ruta.origin.equals(this.destination)) {
            if (ruta.destination.equals(this.origin)) {
                return true;
            }
        }
        return false;
    }
}

class Train {
    Route r;
    Schedule s;
    boolean local;

    public Train(Route ruta, Schedule timp, boolean loc) {
        this.r = ruta;
        this.s = timp;
        this.local = loc;
    }

    public int price() {
        if (local) {
            return s.duration();
        } else {
            return 2 * s.duration();
        }
    }

    @Override
    public String toString() {
        return local + " " + r.origin + " (" + s.departure + ") -> " + r.destination + " (" + s.arrival + ") ";
    }
}