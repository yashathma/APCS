import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class wordRunner {
    public static ArrayList<String> buildDictionary(String filename) {
        Scanner myScanner;

        ArrayList<String> words = new ArrayList<>();

        try {

            myScanner = new Scanner(new FileReader(filename));
            myScanner.useDelimiter("\n");

            while (myScanner.hasNext()) {
                String line = myScanner.next();
                words.add(line.trim());
            }


            myScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found " + filename);
        }


        return words;
    }
}
