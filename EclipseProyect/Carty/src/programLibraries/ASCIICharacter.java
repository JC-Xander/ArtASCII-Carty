package programLibraries;

public class ASCIICharacter {
	private char charAscii;
	private String[] ArrayDiseño;
	
	public ASCIICharacter(char charAscii, String Diseño) {
		this.charAscii = charAscii;
		this.ArrayDiseño = Diseño.split("\n");
	}
	
	public int getCharAscii() {
		return (int)charAscii;
	}
	
	public String[] getDiseño() {
		return ArrayDiseño;
	}
	
	public String getLine(int i) {
		return this.ArrayDiseño[i];
	}
}
