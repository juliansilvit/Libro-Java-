import java.util.*;
import java.io.*;
public class Main4 {
static PrintWriter pw = new PrintWriter (System.out);
	public static void main(String[] args) {
		Map<String, Integer> mapa1 = new HashMap<String, Integer>();
		mapa1.put("edwin", 18);
		mapa1.put("luna", 18);
		mapa1.put("laura", 21);
		mapa1.put("julian", 19);
		pw.println("Listado completo de valores");
		for (Integer valor : mapa1.values())
			pw.print(valor + " - ");
		pw.println();
		pw.println("Listado completo de claves");
		for (String clave : mapa1.keySet())
			pw.print(clave + " - ");
		pw.println();
		pw.println("La edad de 'luna' es:" + mapa1.get("luna"));
		if (mapa1.containsKey("Diego"))
			pw.println("No existe la clave 'Diego'");
		pw.println("La edad de 'Valentina' es:" + mapa1.getOrDefault("valentina", 20));
		mapa1.remove("laura");
		pw.println(mapa1);
		pw.close();
	}
}
