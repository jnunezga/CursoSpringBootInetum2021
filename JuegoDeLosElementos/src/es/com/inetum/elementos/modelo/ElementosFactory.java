package es.com.inetum.elementos.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementosFactory {
	// constantes
	public static final int PIEDRA = 0;
	public static final int PAPEL = 1;
	public static final int TIJERA = 2;
	
	// atributos
	protected String descripcionResultado;
	private static List<ElementosFactory> elementos;
	protected String nombre;
	protected int numero;
	
	// constructor
	public ElementosFactory(String pNombre, int pNumero) {
		this.nombre = pNombre;
		this.numero = pNumero;
	}
	
	// getters and setters	
	public String getDescripcionResultado() {
		return this.descripcionResultado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// métodos
	public abstract int comparar(ElementosFactory pElem);
	
	public boolean isMe(int pNum) {
		return this.numero == pNum;
	}	
	
	public static ElementosFactory getInstance(int pNum) {
		elementos = new ArrayList<ElementosFactory>();
		elementos.add(new Piedra());
		
		for (ElementosFactory elementosFactory : elementos) {
			if (elementosFactory.isMe(pNum))
				return elementosFactory;
		}
		
		return null;
	}
}
