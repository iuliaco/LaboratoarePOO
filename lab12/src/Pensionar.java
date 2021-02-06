public class Pensionar {
    private int aniVechime;
    private float salariu;
    private Strategy strategy;

    public Pensionar(int aniVechime, float salariu) {
        this.aniVechime = aniVechime;
        this.salariu = salariu;
        if(aniVechime>= 20 && aniVechime < 30)
            this.strategy = new TwentyStrategy();
        else if(aniVechime>= 30 && aniVechime < 40)
            this.strategy = new ThirtyStrategy();
        if(aniVechime>= 40)
            this.strategy = new FortyStrategy();
    }

    public int getAniVechime() {
        return aniVechime;
    }

    public void setAniVechime(int aniVechime) {
        this.aniVechime = aniVechime;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.calcul(aniVechime, salariu);
    }

    @Override
    public String toString() {
        return "Pensionar{" +
                "aniVechime=" + aniVechime +
                ", salariu=" + salariu +
                ", pensie=" + strategy.calcul(aniVechime, salariu) +
                '}';
    }

    public static void main(String[] args) {
        Pensionar b20, b30, b40;
        b20 = new Pensionar(23, 2000);
        b30 = new Pensionar(36, 2000);
        b40 = new Pensionar(45, 2000);
        System.out.println(b20);
        System.out.println(b30);
        System.out.println(b40);
    }
}
