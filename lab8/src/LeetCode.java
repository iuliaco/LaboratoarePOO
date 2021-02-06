import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;

class Traveler {
    private int id;
    private int timeStart;
    private int timeEnd;
    private String stationStart;
    private String stationEnd;

    public Traveler(int id, int time, String stationName) {
        this.id = id;
        this.timeStart = time;
        this.stationStart = stationName;
        this.stationEnd = null;
        this.timeEnd = 0;
    }

    public int getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(int timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getStationEnd() {
        return stationEnd;
    }

    public void setStationEnd(String stationEnd) {
        this.stationEnd = stationEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(int timeStart) {
        this.timeStart = timeStart;
    }

    public String getStationStart() {
        return stationStart;
    }

    public void setStationStart(String stationStart) {
        this.stationStart = stationStart;
    }

    public boolean already_Introduced(int id) {

        return getId() == id &&
                getTimeEnd() == 0 &&
                getStationEnd() == null;
    }

    public boolean already_Finished(int id) {

        return getId() == id &&
                getTimeEnd() == 0 &&
                getStationEnd() != null;
    }

    public boolean isTravel(String startStation, String endStation) {
        if(getStationEnd() == null) {
            return false;
        }
        return getStationStart().equals(startStation) &&
                getStationEnd().equals(endStation);
    }
    public int returnTime() {
        return getTimeEnd() - getTimeStart();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), timeStart, getTimeEnd(), stationStart, getStationEnd());
    }
}

class UndergroundSystem {

    ArrayList<Traveler> list;
    public UndergroundSystem() {
    list = new ArrayList<Traveler>();

    }

    public void checkIn(int id, String stationName, int t) {
        ListIterator<Traveler> iter = list.listIterator(list.size());
        while (iter.hasPrevious()) {
            Traveler prev = iter.previous();
            if(prev.already_Finished(id)) {
                list.add(new Traveler(id, t, stationName));
                return;
            } else if(prev.already_Introduced(id)) {
                return;
            }
        }
        list.add(new Traveler(id, t, stationName));
    }

    public void checkOut(int id, String stationName, int t) {
        ListIterator<Traveler> iter = list.listIterator(list.size());
        while (iter.hasPrevious()) {
            Traveler prev = iter.previous();
            if(prev.already_Introduced(id)) {
                prev.setStationEnd(stationName);
                prev.setTimeEnd(t);
                return;
            }
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        double totaltime = 0;
        int contor = 0;
        for(Traveler t: list) {
            if (t.isTravel(startStation, endStation)) {
                totaltime += (double) t.returnTime();
                contor++;
            }
        }
        totaltime = totaltime/contor;
        System.out.println(totaltime);
        return totaltime;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */

public class LeetCode {
    public static void main(String[] args) {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        undergroundSystem.getAverageTime("Paradise", "Cambridge");       // return 14.00000. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
        undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 11.00000. There were two travels from "Leyton" to "Waterloo", a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20. So the average time is ( (15-3) + (20-10) ) / 2 = 11.00000
        undergroundSystem.checkIn(10, "Leyton", 24);
        undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 11.00000
        undergroundSystem.checkOut(10, "Waterloo", 38);
        undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 12.00000
        //
        }
}
