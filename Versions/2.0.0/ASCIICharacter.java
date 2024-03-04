/**
 * Clase Base la cual se encarga de almacenar el modelo Ascii junto al caracter al que representa en el abecedario.
 * @author J-Xander.
 * @version 1.1.0
 * @since 2024/03/04
 * @date 2024/02/15
 */
public class ASCIICharacter {

	private char charAscii;
	private String[] ArrayDiseño;
	
	/**
	 * Crea una nueva instancia de ASCIICharacter la cual resive un caracter y crea
	 * un arreglo con cada linea de la cadena enviada
	 * @param charAscii Caracter(char)
	 * @param Diseño Arte ASCII simbolica al caracter.
	 */
	public ASCIICharacter(char charAscii, String Diseño) {
		this.charAscii = charAscii;
		this.ArrayDiseño = Diseño.split("\n");
	}
	
	/**
	 * Optiene el Caracter simbolico del objeto y le aplica un casting(int)
	 * @return el casting a int de un char.
	 */
	public int getCharAscii() {
		return (int)charAscii;
	}
	
	/**
     * Retorna un arreglo el cual contiene las lineas por separado de toda la secuencia ASCII
     * @return un Arreglo de cadena.
     */
	public String[] getDiseño() {
		return ArrayDiseño;
	}
	
	/**
	 * Optiene la lines x del ArtASCII
	 * @param i Linea que queremos optener
	 * @return la cadena almacena en la posición i del arreglo.
	 */
	public String getLine(int i) {
		return this.ArrayDiseño[i];
	}
}//--------------- Fin de la clase ------------------