package es.com.inetum.elementos.modelo;

public class Papel extends ElementosFactory {

	public Papel() {
		super("Papel", 1);
	}

	@Override
	public int comparar(ElementosFactory pElem) {
		int numero = pElem.getNumero();
		int resultado = 0;
		
		if (numero == PIEDRA) {
			resultado = 1;
			descripcionResultado = "Papel gan� contra piedra";
		}
		else if (numero == SPOCK) {
			resultado = 1;
			descripcionResultado = "Papel gan� contra Spock";
		}
		else if (numero == TIJERA) {
			resultado = -1;
			descripcionResultado = "Papel perdi� contra tijera";
		}
		else if (numero == LAGARTO) {
			resultado = -1;
			descripcionResultado = "Papel perdi� contra lagarto";
		}
		else {
			resultado = 0;
			descripcionResultado = "EMPATE";
		}
		
		return resultado;
	}

}
