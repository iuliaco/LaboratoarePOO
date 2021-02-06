import java.util.ArrayList;
import java.util.Iterator;

public class Channel {
    private ArrayList<User> observers;
    private String channelName;

    public Channel(String channelName) {
        observers = new ArrayList<>();
        this.channelName = channelName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public ArrayList<User> getObservers() {
        return observers;
    }

    void subscribe(User user) {
        observers.add(user);
    }
    void unsubscribe(User user) {
        if(observers.contains(user)) {
            observers.remove(user);
        }
    }
    void notify(String notification) {
        for (Iterator<User> it = observers.iterator(); it.hasNext();) {
            User o = it.next();
            o.update(notification);
        }
    }

    @Override
    public String toString() {
        return "Channel{" +
                "observers=" + observers +
                ", channelName='" + channelName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user1 = new User("Iulia");
        User user2 = new User("Sabina");
        User user3 = new User("Andreea P");
        User user4 = new User("Stefana");
        User user5 = new User("Andreea A");
        User user6 = new User("Andreea C");
        Channel channel1 = new Channel("POO");
        Channel channel2 = new Channel("IOCLA");
        Channel channel3 = new Channel("IOCLA");
        channel1.subscribe(user1);
        channel1.subscribe(user3);
        channel2.subscribe(user2);
        channel2.subscribe(user3);
        channel3.subscribe(user4);
        channel3.subscribe(user5);
        channel3.subscribe(user6);
        channel3.subscribe(user3);
        channel1.subscribe(user4);
        channel2.subscribe(user5);
        channel1.notify("Canal 1 notificare1");
        channel2.notify("Canal 2 notificare1");
        channel3.notify("Canal 3 notificare1");
        System.out.println(user6);
        System.out.println(user2);
        System.out.println(user1);
        System.out.println(user5);
        System.out.println(user3);
        channel3.unsubscribe(user3);
        channel2.notify("Canal 2 notificare2");
        channel3.notify("Canal 3 notificare2");
        System.out.println(user6);
        System.out.println(user3);

    }
}
