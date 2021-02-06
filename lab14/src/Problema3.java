import java.io.*;
import java.util.stream.Stream;

public class Problema3 {


    public void afisare () {
        LineNumberReader obj;
        FileReader in = null;

        try {
            in = new FileReader("D:\\laboratoarePOO\\lab14\\src\\test01.in");
            obj = new LineNumberReader(in);
            String line =obj.readLine( ) ;
            while(line != null) {
                if(obj.getLineNumber() % 2 ==1) {
                    System.out.println("" +obj.getLineNumber() +line);
                }
                line =obj.readLine( ) ;
            }

        } catch( IOException e ) {
            e.printStackTrace () ;}
        finally {
            try{

                if( in !=null)  in.close() ;
            }
            catch( IOException e ) {
                e . printStackTrace () ;}
        }
    }

    public void print(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String key = "";

        try{
            String line = in.readLine();

            while ((line = in.readLine()) != null && !line.contains("exit"))
                key += line;
            File myObj = new File("output.txt");
            FileWriter myWriter = new FileWriter("output.txt");
            myWriter.write(key);
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void wordCounter() {
        FileReader in = null;
        try {
            in = new FileReader(new File("D:\\laboratoarePOO\\lab14\\src\\test02.in"));
            StreamTokenizer str = new StreamTokenizer(in);
            int currentToken = str.nextToken();
            int noWords = 0;
            while (currentToken != StreamTokenizer.TT_EOF) {
                if(currentToken == StreamTokenizer.TT_WORD)
                    noWords++;

                currentToken = str.nextToken();
            }
            System.out.println(noWords);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Problema3().afisare();
        new Problema3().print(args);
        new Problema3().wordCounter();
    }
}
