import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class The_Comparator implements Comparator<String> {
    public int compare(String str1, String str2)
    {
        return str2.compareTo(str1);
    }
}

public class Problema1 {
    public TreeSet printWords (String filename) {
        TreeSet<String> ts1 = new TreeSet<String>();
        try {
          File myObj = new File(filename);
          Scanner myReader = new Scanner(myObj);
          while(myReader.hasNextLine()) {
              String data = myReader.nextLine();
              String[] arr = data.split("[\t ,.{} \\\" ; () : ]");
              for( String ss: arr ) {
                 ts1.add(ss);
              }
          }
          myReader.close();

      } catch (FileNotFoundException e) {
          System.err.println(e);
      }
        return ts1;

    }
    public TreeSet printWordsComparator (TreeSet ts1) {
        TreeSet<String> ts2 = new TreeSet<String>(new The_Comparator());
        Iterator it = ts1.iterator();
        while(it.hasNext()) {
            ts2.add((String)it.next());
        }
        return ts2;

    }

    public static void main(String[] args) {
        Problema1 pb1 = new Problema1();
        String path = "D:\\laboratoarePOO\\lab7\\src\\Arhiva\\test01.txt";
        TreeSet tree = pb1.printWords(path);
        System.out.println(tree);
        TreeSet tree2 = pb1.printWordsComparator(tree);
        System.out.println(tree2);
    }
}
