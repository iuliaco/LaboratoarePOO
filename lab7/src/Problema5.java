import java.io.File;
import java.util.HashMap;
import java.util.TreeMap;

public class Problema5 {
    public static void main(String[] args) {
        File folder = new File("D:\\");
        File[] listOfFiles = folder.listFiles();
        TreeMap dict1 = new TreeMap<String, Integer>();
        HashMap dict2 = new HashMap<String, Integer>();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                dict1.put(file.getName(), file.length());
                dict2.put(file.getName(), file.length());
            }
        }
        System.out.println(dict1.entrySet());
        System.out.println(dict2.entrySet());
    }
}
