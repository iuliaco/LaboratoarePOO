import static java.lang.Math.sin;

public class Problema1 {
    public static void main(String[] args) {
        Patrulater patru;
        Paralelogram para;
        Romb rom;
        Dreptunghi drept;
        Patrat patr;
        patru = new Patrulater(1,2,3,4);
        para = new Paralelogram(5,6);
        rom = new Romb(90,30,55,55,66);
        drept = new Dreptunghi(40, 50);
        patr = new Patrat(60);
        System.out.println(patr.perimetru());
        System.out.println(para.perimetru());
        System.out.println(rom.perimetru());
        System.out.println(patru.perimetru());
        System.out.println(drept.perimetru());

    }
}


class Patrulater {
    public int latura1, latura2, latura3, latura4;
    public double unghi1, unghi2, unghi3, unghi4;

    public Patrulater() {
        this(0, 0, 0, 0);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }

    public Patrulater(double unghi1, double unghi2, double unghi3, double unghi4) {
        this(0, 0, 0, 0, unghi1, unghi2, unghi3, unghi4);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4) {
        this(latura1, latura2, latura3, latura4);
        this.unghi1 = unghi1;
        this.unghi2 = unghi2;
        this.unghi3 = unghi3;
        this.unghi4 = unghi4;
    }

    public int perimetru() {
        int result;
        result = latura1 + latura2 + latura3 + latura4;
        return result;
    }
}

class Paralelogram extends Patrulater {
    public Paralelogram(int lat1, int lat2) {
        super(lat1, lat2, lat1, lat2);
    }

    public Paralelogram(int lat1, int lat2, double unghi1, double unghi2) {
        super(lat1, lat2, lat1, lat2, unghi1, unghi2, unghi1, unghi2);
    }

    public Paralelogram() {
        this(0, 0, 0, 0);
    }

    public Paralelogram(double unghi1, double unghi2) {
        this(0, 0, unghi1, unghi2);
    }

    public double aria() {
        return super.latura1 * super.latura2 * sin(super.unghi1);
    }
}



class Romb extends Paralelogram {
    public int diag1;
    public int diag2;

    public Romb(int lat) {
        super(lat, lat);
        this.diag1 = 0;
        this.diag2 = 0;
    }
    public Romb(int lat, double unghi1, double unghi2) {
        super(lat, lat, unghi1, unghi2);
        this.diag1 = 0;
        this.diag2 = 0;
    }
    public Romb(double unghi1, double unghi2) {
        super(0, 0, unghi1, unghi2);
        this.diag1 = 0;
        this.diag2 = 0;
    }
    public Romb(int lat, int diag1, int diag2) {
        super(lat, lat);
        this.diag1 = diag1;
        this.diag2 = diag2;
    }
    public Romb(int lat, double unghi1, double unghi2, int diag1, int diag2) {
        super(lat, lat, unghi1, unghi2);
        this.diag1 = diag1;
        this.diag2 = diag2;
    }
    public Romb(double unghi1, double unghi2, int diag1, int diag2) {
        super(0, 0, unghi1, unghi2);
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    public double aria() {
        return (this.diag1 * this.diag2) / 2;
    }
}

class Dreptunghi extends Paralelogram{
    public Dreptunghi(int lat1, int lat2) {
        super(lat1, lat2, Math.PI/2, Math.PI/2);
    }
    public Dreptunghi(){
        super(0, 0,Math.PI/2, Math.PI/2 );
    }
    public double aria() {
        return (this.latura1 * this.latura2) / 2;
    }
}

class Patrat extends Dreptunghi{
    public Patrat() {
        super();
    }
    public Patrat(int latura){
        super(latura, latura);
    }

    public double aria() {
        return latura1*latura1;
    }
}
