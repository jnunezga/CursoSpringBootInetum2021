package es.com.inetum.elementos.modelo;

public class Spock extends ElementosFactory {

	public Spock() {
		super("Spock", 4);
	}

	@Override
	public int comparar(ElementosFactory pElem) {
		int numero = pElem.getNumero();
		int resultado = 0;
		
		if (numero == TIJERA) {
			resultado = 1;
			descripcionResultado = "Spock gan� contra tijera";
		}
		else if (numero == PIEDRA) {
			resultado = 1;
			descripcionResultado = "Spock gan� contra piedra";
		}
		else if (numero == PAPEL) {
			resultado = -1;
			descripcionResultado = "Spock perdi� contra papel";
		}
		else if (numero == LAGARTO) {
			resultado = -1;
			descripcionResultado = "Spock perdi� contra lagarto";
		}
		else {
			resultado = 0;
			descripcionResultado = "EMPATE";
		}
		
		return resultado;
	}

}
