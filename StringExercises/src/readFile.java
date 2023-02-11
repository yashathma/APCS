import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        ArrayList<word> wordsandsyllables = new ArrayList<>();
        wordsandsyllables = readfile("data/syllables (1).txt");
        printarrlist(wordsandsyllables);


    }

    private static void printarrlist(ArrayList<word> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).word+" "+arrayList.get(i).syllables);
        }
    }

    private static ArrayList<word> readfile(String s) {

        ArrayList<word> wordsandsyllables = new ArrayList<word>();
        Scanner scanner;
        String output = "";
        try {
            scanner = new Scanner(new FileReader("data/syllables (1).txt"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int syllables = 1;
                for (int i = 0; i < line.length(); i++) {
                    if (line.substring(i,i+1).equals("*")){
                        syllables++;
                    }
                }
                String word=line.substring(0,line.indexOf("="));
                word w = new word(word, syllables);
                wordsandsyllables.add(w);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + "data/syllables (1).txt");
        }
        return wordsandsyllables;

    }

}
