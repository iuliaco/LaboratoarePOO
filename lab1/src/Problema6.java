public class Problema6 {
    int i;

    public static boolean prim(int nr) {
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
        }
    public static void print ( double nr){
            System.out.println(nr);
        }
    public static void printstr (String str){
            System.out.println(str);
    }

    public static void main(String[] args) {
        Problema6 obiect = new Problema6();
        for (int i = 1; i < 21; i++) {
            if (obiect.prim(i)) {
                System.out.print(i);
                System.out.println(" este prim");
            } else {
                System.out.print(i);
                System.out.println(" nu este prim");
            }
        }
    }

}
