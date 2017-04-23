import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilePartReader {
	private String path;
	private int fromLine;
	private int toLine;
	

	public FilePartReader (String path, int fromLine, int toLine){
		this.path = path;
		this.fromLine = fromLine;
		this.toLine = toLine;
		
		if(fromLine < 1 || toLine < fromLine){
			throw new IllegalArgumentException("Wrong argument given to fromLine or toLine.");
		}
		
	}

	private String read() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(path));
		String text = "";
		String current;
		while((current = br.readLine()) != null){
			text += current + "\n";
			
		}
		return text;
	}
	
	
	public String readLines() throws IOException{
		String content = this.read();
		String result = "";
		String[] lines = content.split("\n");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < lines.length; i++){
			if(i >= fromLine -1 && i < toLine ){
				sb.append(lines[i] + "\n");
			}
		}
		result = sb.toString();
		return result;
	}

}
