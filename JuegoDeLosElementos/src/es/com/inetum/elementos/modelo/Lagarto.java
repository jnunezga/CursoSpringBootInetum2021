package es.com.inetum.elementos.modelo;

public class Lagarto extends ElementosFactory {

	public Lagarto() {
		super("Lagarto", 3);
	}

	@Override
	public int comparar(ElementosFactory pElem) {
		int numero = pElem.getNumero();
		int resultado = 0;
		
		if (numero == SPOCK) {
			resultado = 1;
			descripcionResultado = "Lagarto gan� contra Spock";
		}
		else if (numero == PAPEL) {
			resultado = 1;
			descripcionResultado = "Lagarto gan� contra papel";
		}
		else if (numero == PIEDRA) {
			resultado = -1;
			descripcionResultado = "Lagarto perdi� contra piedra";
		}
		else if (numero == TIJERA) {
			resultado = -1;
			descripcionResultado = "Lagarto perdi� contra tijera";
		}
		else {
			resultado = 0;
			descripcionResultado = "EMPATE";
		}
		
		return resultado;
	}

}
