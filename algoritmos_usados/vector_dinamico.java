import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		// se crea el array
		ArrayList arraisito = new ArrayList();

		// se verifica el tamaño de la lista antes de ser llenado
		System.out.println("Tamaño de ArrayList en la creación:" + arraisito.size());

		// elemento que se agregaran al array
		arraisito.add("JULIAN");
		arraisito.add("EDWIN");
		arraisito.add("DANIEL");
		arraisito.add("LUNA");

		// verificacion de la lista despues de agregar datos
		System.out.println("Tamaño de ArrayList después de agregar elementos:" + arraisito.size());

		// se muestran todos los elementos dentro de la lista
		System.out.println("Lista de todos los elementos:" + arraisito);

		// eliminar contenido de la lista
		arraisito.remove ("DANIEL");
		System.out.println("Ver contenido después de eliminar un elemento:" + arraisito);

		// eliminar contenido de la lista por indice
		arraisito.remove (1);
		System.out.println("Ver contenido después de eliminar elemento por índice:" + arraisito);

		// verificacion de tamaño de la lista despues de eliminar elementos
		System.out.println("Tamaño de arrayList después de eliminar elementos:" + arraisito.size());
		// mostrar los elementos que quedaron en la lista
		System.out.println("Lista de todos los elementos después de eliminar elementos:" + arraisito);

		// Verifica si la lista contiene "LUNA"
		System.out.println(arraisito.contains("LUNA"));
	}
}
