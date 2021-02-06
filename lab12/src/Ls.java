public class Ls implements Visitor {
    public void visit (Director f) {
        System.out.println(f.getName());
        for (Repository repo: f.getChildren()) {
            System.out.println("\t" + repo.getName());
            // afisam numele unui repo (fisier / folder)
        }
    }
    public void visit (Fisier f) {
        System.out.println("Not a folder");
                  /* comanda Ls (in acest exemplu) este specifica doar folderelor,
                  in acest caz este evidentiat un dezavantaj al  Visitor-ului,
                  faptul ca noi trebuie sa implementam metode de care nu avem nevoie
                  in acest caz - se incalca Interface Segregation Principle  */
    }
}