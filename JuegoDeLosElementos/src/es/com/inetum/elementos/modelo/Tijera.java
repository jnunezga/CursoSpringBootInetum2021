package es.com.inetum.elementos.modelo;

public class Tijera extends ElementosFactory {

	public Tijera() {
		super("Tijera", 2);
	}

	@Override
	public int comparar(ElementosFactory pElem) {
		int numero = pElem.getNumero();
		int resultado = 0;
		
		if (numero == PAPEL) {
			resultado = 1;
			descripcionResultado = "Tijera gan? contra papel";
		}
		else if (numero == LAGARTO) {
			resultado = 1;
			descripcionResultado = "Tijera gan? contra lagarto";
		}
		else if (numero == PIEDRA) {
			resultado = -1;
			descripcionResultado = "Tijera perdi? contra piedra";
		}
		else if (numero == SPOCK) {
			resultado = -1;
			descripcionResultado = "Tijera perdi? contra Spock";
		}
		else {
			resultado = 0;
			descripcionResultado = "EMPATE";
		}
		
		return resultado;
	}

}
