/**
 * Clase: iPila, interfaz pila. 
 * @author Paulina Cano 15053
 * @author Jackeline Hidalgo 15776
 * @author Irvin Oliva 15816
 * @param <E>
 */
public interface iPila <E> {
	public void push(E element);
	public E pop();
	public boolean IsEmpty();
	public int Size();
	public E get();
}
