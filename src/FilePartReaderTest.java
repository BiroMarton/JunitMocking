

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FilePartReaderTest {
	
	String path = "D:/Users/Tata/workspace/JunitMocking/src/test.txt";

	@Test
    public void testIfContentEqualsFromLineToLine() throws IOException
    {
        FilePartReader fpReader = new FilePartReader(path, 1, 3);
        String lines =  "banán,\n" + 
        				"alak,\n" +
        				"alma,\n" ;
        assertEquals(lines, fpReader.readLines());
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentExceptionInFilePartReaderConstructor()
    {
        FilePartReader fpReader = new FilePartReader(path, 4, 1);
    }

    @Test(expected = FileNotFoundException.class)
    public void testIfFileNotFound () throws IOException
    {
        String fPath = "/JunitMocking/this/is/a/fake/path.txt";
        FilePartReader fpReader = new FilePartReader(fPath, 1, 4);
        fpReader.readLines();
    }

}
