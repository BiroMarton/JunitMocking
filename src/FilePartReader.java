
public class FilePartReader {
	private String path;
	private int fromLine;
	private int toLine;
	

	public FilePartReader (String path, int fromLine, int toLine){
		this.path = path;
		this.fromLine = fromLine;
		this.toLine = toLine;
		
		if(fromLine < 1 || toLine < fromLine){
			throw new IllegalArgumentException();
		}
		
	}

	private String read(){
		return "";
	}
	
	
	public String readLines(){
		return "";
	}

}
