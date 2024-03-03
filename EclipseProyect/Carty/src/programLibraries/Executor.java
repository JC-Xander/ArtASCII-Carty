package programLibraries;

import java.util.Scanner;

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
