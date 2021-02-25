//Clase Elemento

public class elemento {
	elemento(String s, int i) {
		nombre = s;
		cantidad = i;
	}

	String nombre;
	int cantidad;
}


//Función main


import java.io.*;
import java.util.*;

public class Main4 {
	static PrintWriter pw= new PrintWriter(System.out);
	public static void main(String args[]) {
		// Definir 5 instancias de la Clase Producto
		elemento a = new elemento("TOSTADAS", 6);
		elemento b = new elemento("ACEITE", 2);
		elemento c = new elemento("PERAS", 5);
		elemento d = new elemento("PESCADO", 2);
		elemento e = new elemento("MELON", 2);

		// Definir un ArrayList
		ArrayList mercado = new ArrayList();

		// Colocar Instancias de Producto en ArrayList
		mercado.add(a);
		mercado.add(b);
		mercado.add(c);
		mercado.add(d);
		// Indica el indice de inserción
		mercado.add(1, e);
		mercado.add(e);

		// Imprimir contenido de ArrayLists
		System.out.println(" - Lista de mandado con " + mercado.size() + " elementos");

		// Definir Iterator para extraer/imprimir valores

		for (Iterator it = mercado.iterator(); it.hasNext();) {
			elemento x = (elemento) it.next();
			System.out.println(x.nombre + " : " + x.cantidad);

		}

		// Eliminar elemento de ArrayList
		mercado.remove(2);
		System.out.println(" - Lista de mandado con " + mercado.size() + " elementos");
		// Definir Iterator para extraer/imprimir valores

		for (Iterator iterator = mercado.iterator(); iterator.hasNext();) {

			elemento x = (elemento) iterator.next();
			System.out.println(x.nombre + " : " + x.cantidad);

		}

		// Eliminar todos los valores del ArrayList
		mercado.clear();
		System.out.println(" - Lista de mandado final con " + mercado.size() + " elementos");
	}
}
