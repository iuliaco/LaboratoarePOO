import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<String> notifications;

    public User(String name) {
        notifications = new ArrayList<>();
        this.name = name;
    }

    public void update(String notification) {
        notifications.add(notification);
    }

    public ArrayList<String> getNotifications() {
        return notifications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", notifications=" + notifications +
                '}';
    }
}
