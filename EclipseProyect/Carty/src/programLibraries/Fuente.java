package programLibraries;

public class Fuente {

	private ASCIICharacter[] Abecedario;
	private ASCIICharacter[] AsciiTexto;
	private String TextoUnido;

	public Fuente(String texto) {
		this.Abecedario = new ASCIICharacter[76];

		this.Abecedario[0] = new ASCIICharacter('\t', """
				░░░░░░░░
				░░░░░░░░
				░░░░░░░░
				░░░░░░░░
				░░░░░░░░
				░░░░░░░░
				░░░░░░░░
				░░░░░░░░""");

		this.Abecedario[1] = new ASCIICharacter(' ', """
				░░
				░░
				░░
				░░
				░░
				░░
				░░
				░░""");

		this.Abecedario[2] = new ASCIICharacter('!', """
				╔╗░
				║║░
				║║░
				╚╝░
				╔╗░
				╚╝░
				░░░
				░░░""");

		this.Abecedario[3] = new ASCIICharacter('(', """
				░░╔═╗
				░╔╝╔╝
				╔╝╔╝░
				║║║░░
				║║║░░
				╚╗╚╗░
				░╚╗╚╗
				░░╚═╝""");

		this.Abecedario[4] = new ASCIICharacter(')', """
				╔═╗░░
				╚╗╚╗░
				░╚╗╚╗
				░░║║║
				░░║║║
				░╔╝╔╝
				╔╝╔╝░
				╚═╝░░""");

		this.Abecedario[5] = new ASCIICharacter(',', """
				░░
				░░
				░░
				░░
				╔╗
				╚╣
				░╝
				░░""");

		this.Abecedario[6] = new ASCIICharacter('-', """
				░░░░
				░░░░
				░░░░
				╔══╗
				╚══╝
				░░░░
				░░░░
				░░░░""");

		this.Abecedario[7] = new ASCIICharacter('.', """
				░░
				░░
				░░
				░░
				╔╗
				╚╝
				░░
				░░""");

		this.Abecedario[8] = new ASCIICharacter('0', """
				╔═══╗
				║╔═╗║
				║║║║║
				║║║║║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[9] = new ASCIICharacter('1', """
				░╔╗░
				╔╝║░
				╚╗║░
				░║║░
				╔╝╚╗
				╚══╝
				░░░░
				░░░░""");

		this.Abecedario[10] = new ASCIICharacter('2', """
				╔═══╗
				║╔═╗║
				╚╝╔╝║
				╔═╝╔╝
				║║╚═╗
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[11] = new ASCIICharacter('3', """
				╔═══╗
				║╔═╗║
				╚╝╔╝║
				╔╗╚╗║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[12] = new ASCIICharacter('4', """
				╔╗─╔╗
				║║─║║
				║╚═╝║
				╚══╗║
				░░░║║
				░░░╚╝
				░░░░░
				░░░░░""");

		this.Abecedario[13] = new ASCIICharacter('5', """
				╔═══╗
				║╔══╝
				║╚══╗
				╚══╗║
				╔══╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[14] = new ASCIICharacter('6', """
				╔═══╗
				║╔══╝
				║╚══╗
				║╔═╗║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[15] = new ASCIICharacter('7', """
				╔═══╗
				║╔═╗║
				╚╝╔╝║
				░░║╔╝
				░░║║░
				░░╚╝░
				░░░░░
				░░░░░""");

		this.Abecedario[16] = new ASCIICharacter('8', """
				╔═══╗
				║╔═╗║
				║╚═╝║
				║╔═╗║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[17] = new ASCIICharacter('9', """
				╔═══╗
				║╔═╗║
				║╚═╝║
				╚══╗║
				╔══╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[18] = new ASCIICharacter(':', """
				░░░░
				░░░░
				░╔╗░
				░╚╝░
				░╔╗░
				░╚╝░
				░░░░
				░░░░""");

		this.Abecedario[19] = new ASCIICharacter(';', """
				░░░░
				░░░░
				░╔╗░
				░╚╝░
				░╔╗░
				░╚╣░
				░░╝░
				░░░░""");

		this.Abecedario[20] = new ASCIICharacter('?', """
				╔═══╗
				║╔═╗║
				╚╝╔╝║
				░░║╔╝
				░░╔╗░
				░░╚╝░
				░░░░░
				░░░░░""");

		this.Abecedario[21] = new ASCIICharacter('A', """
				╔═══╗
				║╔═╗║
				║║─║║
				║╚═╝║
				║╔═╗║
				╚╝─╚╝
				░░░░░
				░░░░░""");

		this.Abecedario[22] = new ASCIICharacter('B', """
				╔══╗
				║╔╗║
				║╚╝╚╗
				║╔═╗║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[23] = new ASCIICharacter('C', """
				╔═══╗
				║╔═╗║
				║║─╚╝
				║║─╔╗
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[24] = new ASCIICharacter('D', """
				╔═══╗
				╚╗╔╗║
				░║║║║
				░║║║║
				╔╝╚╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[25] = new ASCIICharacter('E', """
				╔═══╗
				║╔══╝
				║╚══╗
				║╔══╝
				║╚══╗
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[26] = new ASCIICharacter('F', """
				╔═══╗
				║╔══╝
				║╚══╗
				║╔══╝
				║║░░░
				╚╝░░░
				░░░░░
				░░░░░""");

		this.Abecedario[27] = new ASCIICharacter('G', """
				╔═══╗
				║╔═╗║
				║║─╚╝
				║║╔═╗
				║╚╩═║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[28] = new ASCIICharacter('H', """
				╔╗─╔╗
				║║─║║
				║╚═╝║
				║╔═╗║
				║║─║║
				╚╝─╚╝
				░░░░░
				░░░░░""");

		this.Abecedario[29] = new ASCIICharacter('I', """
				╔══╗
				╚╣╠╝
				░║║░
				░║║░
				╔╣╠╗
				╚══╝
				░░░░
				░░░░""");

		this.Abecedario[30] = new ASCIICharacter('J', """
				░░╔╗
				░░║║
				░░║║
				╔╗║║
				║╚╝║
				╚══╝
				░░░░
				░░░░""");

		this.Abecedario[31] = new ASCIICharacter('K', """
				╔╗╔═╗
				║║║╔╝
				║╚╝╝
				║╔╗║
				║║║╚╗
				╚╝╚═╝
				░░░░░
				░░░░░""");

		this.Abecedario[32] = new ASCIICharacter('L', """
				╔╗░░░
				║║░░░
				║║░░░
				║║─╔╗
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[33] = new ASCIICharacter('M', """
				╔═╗╔═╗
				║║╚╝║║
				║╔╗╔╗║
				║║║║║║
				║║║║║║
				╚╝╚╝╚╝
				░░░░░░
				░░░░░░""");

		this.Abecedario[34] = new ASCIICharacter('N', """
				╔═╗─╔╗
				║║╚╗║║
				║╔╗╚╝║
				║║╚╗║║
				║║─║║║
				╚╝─╚═╝
				░░░░░░
				░░░░░░""");

		this.Abecedario[35] = new ASCIICharacter('O', """
				╔═══╗
				║╔═╗║
				║║─║║
				║║─║║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[36] = new ASCIICharacter('P', """
				╔═══╗
				║╔═╗║
				║╚═╝║
				║╔══╝
				║║░░░
				╚╝░░░
				░░░░░
				░░░░░""");

		this.Abecedario[37] = new ASCIICharacter('Q', """
				╔═══╗
				║╔═╗║
				║║─║║
				║║─║║
				║╚═╝║
				╚══╗║
				░░░╚╝
				░░░░░
				░░░░░""");

		this.Abecedario[38] = new ASCIICharacter('R', """
				╔═══╗
				║╔═╗║
				║╚═╝║
				║╔╗╔╝
				║║║╚╗
				╚╝╚═╝
				░░░░░
				░░░░░""");

		this.Abecedario[39] = new ASCIICharacter('S', """
				╔═══╗
				║╔═╗║
				║╚══╗
				╚══╗║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[40] = new ASCIICharacter('T', """
				╔════╗
				║╔╗╔╗║
				╚╝║║╚╝
				░░║║░░
				░░║║░░
				░░╚╝░░
				░░░░░░
				░░░░░░""");

		this.Abecedario[41] = new ASCIICharacter('U', """
				╔╗─╔╗
				║║─║║
				║║─║║
				║║─║║
				║╚═╝║
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[42] = new ASCIICharacter('V', """
				╔╗──╔╗
				║╚╗╔╝║
				╚╗║║╔╝
				░║╚╝║░
				░╚╗╔╝░
				░░╚╝░░
				░░░░░░
				░░░░░░""");

		this.Abecedario[43] = new ASCIICharacter('W', """
				╔╗╔╗╔╗
				║║║║║║
				║║║║║║
				║╚╝╚╝║
				╚╗╔╗╔╝
				░╚╝╚╝░
				░░░░░░
				░░░░░░""");

		this.Abecedario[44] = new ASCIICharacter('X', """
				╔═╗╔═╗
				╚╗╚╝╔╝
				░╚╗╔╝░
				░╔╝╚╗░
				╔╝╔╗╚╗
				╚═╝╚═╝
				░░░░░░
				░░░░░░""");

		this.Abecedario[45] = new ASCIICharacter('Y', """
				╔╗──╔╗
				║╚╗╔╝║
				╚╗╚╝╔╝
				░╚╗╔╝░
				░░║║░░
				░░╚╝░░
				░░░░░░
				░░░░░░""");

		this.Abecedario[46] = new ASCIICharacter('Z', """
				╔════╗
				╚══╗═║
				░░╔╝╔╝
				░╔╝╔╝░
				╔╝═╚═╗
				╚════╝
				░░░░░░
				░░░░░░""");

		this.Abecedario[47] = new ASCIICharacter('_', """
				░░░░
				░░░░
				░░░░
				░░░░
				╔══╗
				╚══╝
				░░░░
				░░░░
				""");

		this.Abecedario[48] = new ASCIICharacter('a', """
				░░░░
				░░░░
				╔══╗
				║╔╗║
				║╔╗║
				╚╝╚╝
				░░░░
				░░░░""");

		this.Abecedario[49] = new ASCIICharacter('b', """
				╔╗░░
				║║░░
				║╚═╗
				║╔╗║
				║╚╝║
				╚══╝
				░░░░
				░░░░""");

		this.Abecedario[50] = new ASCIICharacter('c', """
				░░░░
				░░░░
				╔══╗
				║╔═╝
				║╚═╗
				╚══╝
				░░░░
				░░░░""");

		this.Abecedario[51] = new ASCIICharacter('d', """
				░░╔╗
				░░║║
				╔═╝║
				║╔╗║
				║╚╝║
				╚══╝
				░░░░
				░░░░""");

		this.Abecedario[52] = new ASCIICharacter('e', """
				░░░░
				░░░░
				╔══╗
				║║═╣
				║║═╣
				╚══╝
				░░░░
				░░░░""");

		this.Abecedario[53] = new ASCIICharacter('f', """
				░╔═╗
				░║╔╝
				╔╝╚╗
				╚╗╔╝
				░║║░
				░╚╝░
				░░░░
				░░░░""");

		this.Abecedario[54] = new ASCIICharacter('g', """
				░░░░
				░░░░
				╔══╗
				║╔╗║
				║╚╝║
				╚═╗║
				╔═╝║
				╚══╝""");

		this.Abecedario[55] = new ASCIICharacter('h', """
				╔╗░░
				║║░░
				║╚═╗
				║╔╗║
				║║║║
				╚╝╚╝
				░░░░
				░░░░""");

		this.Abecedario[56] = new ASCIICharacter('i', """
				░░
				░░
				╔╗
				╠╣
				║║
				╚╝
				░░
				░░""");

		this.Abecedario[57] = new ASCIICharacter('j', """
				░░░
				░╔╗
				░╚╝
				░╔╗
				░║║
				░║║
				╔╝║
				╚═╝""");

		this.Abecedario[58] = new ASCIICharacter('k', """
				╔╗░░
				║║░░
				║║╔╗
				║╚╝╝
				║╔╗╗
				╚╝╚╝
				░░░░
				░░░░""");

		this.Abecedario[59] = new ASCIICharacter('l', """
				╔╗░
				║║░
				║║░
				║║░
				║╚╗
				╚═╝
				░░░
				░░░""");

		this.Abecedario[60] = new ASCIICharacter('m', """
				░░░░
				░░░░
				╔╗╔╗
				║╚╝║
				║║║║
				╚╩╩╝
				░░░░
				░░░░""");

		this.Abecedario[61] = new ASCIICharacter('n', """
				░░░░
				░░░░
				╔═╗░
				║╔╗╗
				║║║║
				╚╝╚╝
				░░░░
				░░░░""");

		this.Abecedario[62] = new ASCIICharacter('o', """
				░░░░
				░░░░
				╔══╗
				║╔╗║
				║╚╝║
				╚══╝
				░░░░
				░░░░""");

		this.Abecedario[63] = new ASCIICharacter('p', """
				░░░░
				░░░░
				╔══╗
				║╔╗║
				║╚╝║
				║╔═╝
				║║░░
				╚╝░░
				""");

		this.Abecedario[64] = new ASCIICharacter('q', """
				░░░░
				░░░░
				╔══╗
				║╔╗║
				║╚╝║
				╚═╗║
				░░║║
				░░╚╝""");

		this.Abecedario[65] = new ASCIICharacter('r', """
				░░░
				░░░
				╔═╗
				║╔╝
				║║░
				╚╝░
				░░░
				░░░""");

		this.Abecedario[66] = new ASCIICharacter('s', """
				░░░░
				░░░░
				╔══╗
				║══╣
				╠══║
				╚══╝
				░░░░
				░░░░""");

		this.Abecedario[67] = new ASCIICharacter('t', """
				░╔╗░
				╔╝╚╗
				╚╗╔╝
				░║║░
				░║╚╗
				░╚═╝
				░░░░
				░░░░""");

		this.Abecedario[68] = new ASCIICharacter('u', """
				░░░░
				░░░░
				╔╗╔╗
				║║║║
				║╚╝║
				╚══╝
				░░░░
				░░░░""");

		this.Abecedario[69] = new ASCIICharacter('v', """
				░░░░
				░░░░
				╔╗╔╗
				║╚╝║
				╚╗╔╝
				░╚╝░
				░░░░
				░░░░""");

		this.Abecedario[70] = new ASCIICharacter('w', """
				░░░░░░
				░░░░░░
				╔╗╔╗╔╗
				║╚╝╚╝║
				╚╗╔╗╔╝
				░╚╝╚╝░
				░░░░░░
				░░░░░░""");

		this.Abecedario[71] = new ASCIICharacter('x', """
				░░░░
				░░░░
				╔╗╔╗
				╚╬╬╝
				╔╬╬╗
				╚╝╚╝
				░░░░
				░░░░""");

		this.Abecedario[72] = new ASCIICharacter('y', """
				░░░░░
				░░░░░
				╔╗─╔╗
				║║─║║
				║╚═╝║
				╚═╗╔╝
				╔═╝║░
				╚══╝░""");

		this.Abecedario[73] = new ASCIICharacter('z', """
				░░░░░
				░░░░░
				╔═══╗
				╠══║║
				║║══╣
				╚═══╝
				░░░░░
				░░░░░""");

		this.Abecedario[74] = new ASCIICharacter('Ñ', """
				╔═╗─╔╗
				║║╚╗║║
				║╔╗╚╝║
				║║╚╗║║
				║║─║║║
				╚╝─╚═╝
				░░░░░░
				░░░░░░""");

		this.Abecedario[75] = new ASCIICharacter('ñ', """
				░░░░
				░══░
				╔═╗░
				║╔╗╗
				║║║║
				╚╝╚╝
				░░░░
				░░░░""");

		this.AsciiTexto = new ASCIICharacter[texto.length()];
		for (int i = 0; i < texto.length(); i++) {
			this.AsciiTexto[i] = getLetra(texto.charAt(i));
		}

		this.TextoUnido = CreacionDelTexto(texto);

	}

	private ASCIICharacter getLetra(char caracter) {
		for (int i = 0; i < this.Abecedario.length; i++) {
			if ((int) caracter == this.Abecedario[i].getCharAscii()) {
				return Abecedario[i];
			}
		}
		return this.Abecedario[0];
	}// ------ Finaliza el constructor --------

	private String CreacionDelTexto(String Texto) {
		String[] Lineas = new String[8];
		for (int Linea = 0; Linea < 8; Linea++) {
			String aux = this.AsciiTexto[0].getLine(Linea);
			StringBuilder ConcatenarLineas = new StringBuilder(String.format("%s", aux.substring(0, aux.length() - 1)));
			for (int Letras = 1; Letras < this.AsciiTexto.length; Letras++) {
				String LetraActual = this.AsciiTexto[Letras].getLine(Linea);
				char union = '?';
				char last = aux.charAt(aux.length() - 1);
				char first = LetraActual.charAt(0);

				if (last == first) {
					union = first;
				} else if (last == '░') {
					union = first;
				} else if (first == '░') {
					union = last;
				} else {
					if (last == '║') {
						if (first == '╔' || first == '╚' || first == '╠') {
							union = '╠';
						}
					} else if (last == '╗') {
						if (first == '║') {
							union = '╣';
						} else if (first == '╔') {
							union = '╦';
						} else if (first == '╚') {
							union = '╬';
						} else if (first == '╠') {
							union = '╬';
						}
					} else if (last == '╝') {
						if (first == '╚') {
							union = '╩';
						} else if (first == '║') {
							union = '╣';
						} else if (first == '╔') {
							union = '╬';
						} else if (first == '╠') {
							union = '╬';
						}
					} else if (last == '╣') {
						if (first == '╔' || first == '╚') {
							union = '╬';
						} else if (first == '║') {
							union = '╣';
						}
					}
				}
				ConcatenarLineas.append(union);
				if (Letras < this.AsciiTexto.length - 1)
					ConcatenarLineas.append(LetraActual.substring(1, LetraActual.length() - 1));
				else
					ConcatenarLineas.append(LetraActual.substring(1) + "\n");

				aux = LetraActual;
			}
			Lineas[Linea] = ConcatenarLineas.toString();
		}
		StringBuilder txt = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			String Linea = Lineas[i];
			int contador = 0;
			for (int index = 0; index < Linea.length() - 1; index++) {
				if (Linea.charAt(index) == '░') {
					contador++;
				} else {
					while (contador > 0) {
						txt.append('─');
						contador--;
					}
					txt.append(Linea.charAt(index));
				}
			}
			txt.append("\n");
		}
		return txt.toString();
	}

	public String toString() {
		return this.TextoUnido;
	}
}
