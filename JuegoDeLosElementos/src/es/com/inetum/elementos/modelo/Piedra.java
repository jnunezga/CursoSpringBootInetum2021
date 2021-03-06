package es.com.inetum.elementos.modelo;

public class Piedra extends ElementosFactory {

	public Piedra() {		
		super("Piedra", 0);
	}

	@Override
	public int comparar(ElementosFactory pElem) {
		int numero = pElem.getNumero();
		int resultado = 0;
		
		if (numero == TIJERA) {
			resultado = 1;
			descripcionResultado = "Piedra gan? contra tijera";
		}
		else if (numero == LAGARTO) {
			resultado = 1;
			descripcionResultado = "Piedra gan? contra lagarto";
		}
		else if (numero == PAPEL) {
			resultado = -1;
			descripcionResultado = "Piedra perdi? contra papel";
		}
		else if (numero == SPOCK) {
			resultado = -1;
			descripcionResultado = "Piedra perdi? contra Spock";
		}
		else {
			resultado = 0;
			descripcionResultado = "EMPATE";
		}
		
		return resultado;
	}

}
