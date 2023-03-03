package projet;

public class ConfigurationAutreExemple {

	protected int byte_ = 0;
	protected int word = 0;
	protected int line = 0;
	
	@Override public String toString() {
		return "line=" + line + ", word=" + word
			+ ", byte=" + byte_;
	}
	
	public int countByte(String str) {return 0;}
	public int countLine(String str) {return 0;}
	public int countWord(String str) {return 0;}
	
}