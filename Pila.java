/**
Universidad del Valle de Guatemala
Algoritmos y Estructura de datos
Hoja de Trabajo 2
Clase: Pila, clase principal que imprime resultado 
 * @author Paulina Cano 15053
 * @author Jackeline Hidalgo 15776
 **/

import java.util.Vector;

public class Pila <E> implements iPila<E> {
	Vector<E> vector= new Vector<>();

	@Override
	public void push(E element) {
		vector.addElement(element);
	}

	@Override
	public E pop() {
		return vector.lastElement();
	}

	@Override
	public boolean IsEmpty() {
		return vector.isEmpty();
	}

	@Override
	public int Size() {
		return vector.size();
	}

	@Override
	public E get() {
		return null;
	}
	
}
