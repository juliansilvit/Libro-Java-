import java.util.*;

public class Diccionarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> dicc = new HashMap<String, String>();
		String a = sc.nextLine(), b = sc.nextLine();
		dicc.put(a, b);
		dicc.put("futbol", "deporte con una pelota y arcos");
		dicc.put("vainazo", "lo que se tiran en el grupo de discord");
		dicc.put("impostor", "among us");
		dicc.put("edwin", "parlon de miedo");
		for (String concepto : dicc.keySet()) {
			String key = concepto;
			String value = dicc.get(concepto);
			System.out.println(key + "->" + value);

		}
	}

}
