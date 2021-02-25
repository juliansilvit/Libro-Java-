import java.util.*;
import java.io.*;
public class codigos {

	public static void main(String[] args) {
		PrintWriter pw= new PrintWriter(System.out);
		Set<Integer> hashCode = new HashSet<Integer>();
		hashCode.add(20);
		hashCode.add(10);
		hashCode.add(1);
		hashCode.add(5);
		// El valor 20 no se inserta en el conjunto ya que se encuentra repetido
		hashCode.add(20);
		// La impresión no asegura un orden específico
		for (int elemento : hashCode)
			pw.print(elemento + " - ");
		pw.println();

		Set<Integer> treeCode = new TreeSet<Integer> ();
		treeCode.add(232);
		treeCode.add(1032);
		treeCode.add(125);
		treeCode.add(55);
		// El valor 20 no se inserta en el conjunto ya que se encuentra repetido
		treeCode.add(20);
		// Los elementos se muestran de menor a mayor
		for (int elemento : treeCode)
			pw.print(elemento + " - ");
		pw.println();

		Set<Integer> linkedCode = new LinkedHashSet<Integer>();
		linkedCode.add(2034);
		linkedCode.add(1032);
		linkedCode.add(151);
		linkedCode.add(51);
		// El valor 20 no se inserta en el conjunto ya que se encuentra repetido
		linkedCode.add(20);
		// Los elementos se muestran en el orden que se insertaron
		for (int elemento : linkedCode)
			pw.print(elemento + " - ");
		pw.println();
		pw.close();
	}
}
