public class Test5 {
    public static void main(String[] args) {


        Director root = new Director("radacina");
        Director dirA = new Director("director A");
        Director dirB = new Director("director B");
        Fisier fisierA = new Fisier("fisier A");
        Fisier fisierB = new Fisier("fisier B");
        Fisier fisierC = new Fisier("fisier C");
        root.addChildren(dirA);
        dirA.addChildren(dirB);
        root.addChildren(dirA);
        root.addChildren(fisierA);
        root.addChildren(fisierB);
        root.addChildren(fisierC);


    }
}
