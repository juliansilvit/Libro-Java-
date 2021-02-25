import java.util.*;
import java.io.*;

public class Main4 {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		SortedMap Ejemplo = new TreeMap();
		Ejemplo.put(18, "Luna");
		Ejemplo.put(21, "Laura");
		pw.println("La mas pequeña el las key es:" 
		+ Ejemplo.firstKey());
		pw.println("La edad más grande en las key es: " 
		+ Ejemplo.lastKey());
		pw.println("Las claves y valores son: " + Ejemplo);
		Iterator it = Ejemplo.keySet().iterator();
		while (it.hasNext()) {
			Object cl = it.next();
			pw.println("Clave: " + cl + " Valor: " 
			+ Ejemplo.get(cl));
		}
		pw.close();
	}
}
