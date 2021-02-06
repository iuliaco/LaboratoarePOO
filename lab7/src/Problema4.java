import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class Problema4 {
    public static void main(String[] args) {
        TreeMap dict = new TreeMap<String, LinkedList>();

        String path = "D:\\laboratoarePOO\\lab7\\src\\Arhiva\\test01.txt";
        int i = 1;
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arr = data.split("[\t ,.{} \\\" ; () : ]");
                for( String ss: arr ) {
                    if(!dict.containsKey(ss)){
                        LinkedList ls = new LinkedList<Integer>();
                        ls.add(i);
                        dict.put(ss, ls);
                    } else {
                        LinkedList ls =(LinkedList) dict.get(ss);
                        ls.add(i);
                        dict.put(ss, ls);
                    }
                }
                i++;
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
        System.out.println(dict.entrySet());
    }
}
