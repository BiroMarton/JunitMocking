import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FileWordAnalyzer {
	
	FilePartReader reader;
	
	public FileWordAnalyzer(FilePartReader reader){
		this.reader = reader;
	}
	
	public ArrayList wordsByABC() throws IOException{
        String linesFromFile = reader.readLines();

        linesFromFile = linesFromFile.replaceAll("[.|,]", "");

        ArrayList<String> orderedWords = new ArrayList<String>(Arrays.asList(linesFromFile.split("\\s")));

        Collections.sort(orderedWords, new Comparator<String>() {

            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        return orderedWords;
	}
	
	public ArrayList wordsContainingSubString(String subString) throws IOException{
        ArrayList<String> words = new ArrayList();

        String linesFromFile = reader.readLines();
        linesFromFile = linesFromFile.replaceAll("[.|,]", "");

        String[] lines = linesFromFile.split("\\s");

        for (String element : lines) {
            if(element.toLowerCase().contains(subString.toLowerCase())) {
                words.add(element);
            }
        }

        return words;
	}

}


