import static org.junit.Assert.*;
import static junit.framework.TestCase.assertEquals;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;


public class FileWordAnalyzerTest {
	String path = "D:/Users/Tata/workspace/JunitMocking/src/test.txt";
	
    FilePartReader fpReaderMock = new FilePartReader(path, 1, 3);

    FileWordAnalyzer fwanalyzer = new FileWordAnalyzer(fpReaderMock);

    @Test
    public void testIfWordsByABCMethodSortProperly() throws IOException
    {
        ArrayList<String> lines = new ArrayList();
        lines.add("alak");
        lines.add("alma");
        lines.add("banán");

        assertEquals(lines, fwanalyzer.wordsByABC());
    }
    
    @Test
    public void testIfSubstringIsInWords() throws IOException
    {
        ArrayList<String> lines = new ArrayList();
        lines.add("alak");
        lines.add("alma");
        assertEquals(lines, fwanalyzer.wordsContainingSubString("al"));
    }

}
