public class Fisier extends Repository {
    public Fisier(String name) {
        super(name);
    }

    public void accept (Visitor f) {
        f.visit(this);
        // Visitor-ul "viziteaza" fisierul, adica acesta
        //efectueaza o operatie asupra fisierului
    }
}