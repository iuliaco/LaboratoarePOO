public class Test {
    public static void main(String[] args) {
        Punct a, b;
        a = new Punct();
        b = new Punct();
        a.setX(1);
        a.setY(2);
        b.setX(-1);
        b.setY(3);
        System.out.println(a.distance(b));
    }
}

class Punct {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punct() {
        this.setX(0);
        this.setY(0);
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ")";
    }

    double distance(int x, int y) {
       return Math.sqrt((this.getX() - x) * (this.getX() - x) + (this.getY() - y) * (this.getY() - y));
    }

    double distance(Punct pct) {
       return Math.sqrt((this.getX() - pct.getX()) * (this.getX() - pct.getX()) + (this.getY() - pct.getY()) * (this.getY() - pct.getY()));
    }
}
