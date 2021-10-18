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
			descripcionResultado = "Lagarto ganó contra Spock";
		}
		else if (numero == PAPEL) {
			resultado = 1;
			descripcionResultado = "Lagarto ganó contra papel";
		}
		else if (numero == PIEDRA) {
			resultado = -1;
			descripcionResultado = "Lagarto perdió contra piedra";
		}
		else if (numero == TIJERA) {
			resultado = -1;
			descripcionResultado = "Lagarto perdió contra tijera";
		}
		else {
			resultado = 0;
			descripcionResultado = "EMPATE";
		}
		
		return resultado;
	}

}
