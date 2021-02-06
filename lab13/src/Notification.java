public class Notification {
    private Grade grade;
    public Notification(Grade grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "Copilul dumneavoastra a primit: " +
                "grade=" + grade ;
    }
}
