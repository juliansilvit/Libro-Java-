import java.util.*;

public class Cola {
	public static void main(String[] args) {
		// se crea la cola y se indica que tipo de dato es
		Queue<Integer> cola = new LinkedList();
		// se ingresan datos mediante los metodos ya enseñados 
		cola.offer(3);
		cola.add(14);
		cola.offer(12);
		cola.add(7);
		cola.offer(10);
		//se imprime con los datos ingresados 
		System.out.println("Cola llena: " + cola);
		// Esta es la estructura basica para sacar datos 
		while (cola.poll() != null) {// se saca un dato y se compara con null a ver si era 
			System.out.println(cola.peek());//nos muestra la nueva posicion del frente
		}
		//Se nos mostrara un null ya que la cola esta vacia 
		System.out.print(cola.peek());
	}
}
