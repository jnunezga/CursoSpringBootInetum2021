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
			descripcionResultado = "Tijera ganó contra papel";
		}
		else if (numero == PIEDRA) {
			resultado = -1;
			descripcionResultado = "Tijera perdió contra piedra";
		}
		else {
			resultado = 0;
			descripcionResultado = "EMPATE";
		}
		
		return resultado;
	}

}
