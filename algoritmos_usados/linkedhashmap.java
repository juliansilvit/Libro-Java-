import java.util.*;
import java.io.*;

public class codigos {
	public static void main(String args[]) {
		PrintWriter pw= new PrintWriter(System.out);
		LinkedHashMap<String, String> linked = new LinkedHashMap<String, String>();
		linked.put("Luna", "Mecatronica");
		linked.put("Laura", "Mecatronica");
		linked.put("Edwin", "NMA");
		linked.put("Daniel", "NMA");
		linked.put("Diego", "Artemis-NMA");

		Set st = linked.entrySet();
		Iterator it = st.iterator();
		while (it.hasNext()) {
			Map.Entry cont = (Map.Entry) it.next();
			pw.println(cont.getKey() + " : " + cont.getValue());
		}

		pw.println("La llave contiene : " + linked.containsKey("Luna"));
		pw.println("El valor correspondiente de la llave es : " + linked.get("Edwin"));
		pw.close();
	}
}
