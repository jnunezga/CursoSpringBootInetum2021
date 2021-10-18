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
			descripcionResultado = "Papel ganó contra piedra";
		}
		else if (numero == TIJERA) {
			resultado = -1;
			descripcionResultado = "Papel perdió contra tijera";
		}
		else {
			resultado = 0;
			descripcionResultado = "EMPATE";
		}
		
		return resultado;
	}

}
