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
			descripcionResultado = "Piedra gan� contra tijera";
		}
		else if (numero == PAPEL) {
			resultado = -1;
			descripcionResultado = "Piedra perdi� contra papel";
		}
		else {
			resultado = 0;
			descripcionResultado = "EMPATE";
		}
		
		return resultado;
	}

}
