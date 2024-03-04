import java.util.Scanner;
/**
 * Ejecución del programa.
 * Utiliza un escarner para leer una cadena desde terminal y luego
 * imprime el arte ASCII creada.
 * @author J-Xander.
 * @version 1.0.0
 * @since 2024/03/03
 * @date 2024/03/03
 */
public class Executor {

	public static void main(String[] args) {
		String data;
		try (Scanner read = new Scanner(System.in)) {
			System.out.print("Ingrese el texto\n>>");
			data = read.nextLine();
		}
		Fuente carty = new Fuente(data);
		
		System.out.println(carty);
	}
}
