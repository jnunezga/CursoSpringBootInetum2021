package es.com.inetum.elementos.modelo;

public class Piedra extends ElementosFactory {

	public Piedra() {		
		super("Piedra", 0);
	}

	@Override
	public int comparar(ElementosFactory pElem) {
		int numero = pElem.getNumero();
		int resultado = 0;
		
		if (numero == TIJERA)
			resultado = 1;
		else if (numero == PAPEL)
			resultado = -1;
		
		return resultado;
	}

}
