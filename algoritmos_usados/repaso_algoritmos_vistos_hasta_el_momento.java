import java.util.*;

public class Repaso_Estructuras {

	static Random r = new Random();
	static int i, j;
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		
		System.out.println("Inserte cantidad de datos");
		int n = sc.nextInt();
		System.out.println("Que estructura quiere utilizar? (Los números son aleatorios");
		System.out.println("1) Vector fijo ");
		System.out.println("2) Vector dinámico");
		System.out.println("3) Vector sin repetición");
		System.out.println("4) Matriz");
		System.out.println("5) Diccionario");
		System.out.println("6) cola");
		System.out.println("7) pila");
		int aux = sc.nextInt();
		switch (aux) {
		case 1:
			vectorfijo(n);
			break;
		case 2:
			vectordinamico(n);
			break;
		case 3:
			vectorsinrepeticion(n);
			break;
		case 4:
			matriz(n);
			break;
		case 5:
			Diccionario(n);
			break;
		case 6:
			cola(n);
			break;
		case 7:
			pila(n);
			break;
		}
	}

	public static void vectordinamico(int n) {
		ArrayList<Integer> arreglo = new ArrayList<>();
		for (i = 0; i < n; i++) {
			arreglo.add(r.nextInt());
		}
		for (i = 0; i < n; i++) {
			System.out.println(arreglo.get(i));
		}
	}

	public static void vectorfijo(int n) {
		int[] números = new int[n];
		for (i = 0; i < n; i++) {
			números[i] = r.nextInt();
		}
		for (i = 0; i < n; i++) {
			System.out.println(números[i]);
		}
	}

	public static void matriz(int n) {
		int[][] matrix = new int[n][n];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				matrix[i][j] = r.nextInt(50);
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void vectorsinrepeticion(int n) {
		HashSet<Integer> sinrep = new HashSet<>();
		for (i = 0; i < n; i++) {
			sinrep.add(r.nextInt(50));
		}
		Iterator it = sinrep.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void Diccionario(int n) {
		TreeMap<String, String> dicc = new TreeMap<>();
		dicc.put("Programar", "Utilizacion de codigo para ejecutar un programa");
		dicc.put("Futbol", "Deporte con una pelota y arcos");
		dicc.put("helado", "crema helada");
		dicc.put("Sargento mayor Johnson", "Practicar con palos y piedras");
		for (String concepto : dicc.keySet()) {
			String key = concepto;
			String value = dicc.get(concepto);
			System.out.println(key + "->" + value);
		}
	}

	public static void pila(int n) {
		Stack<Integer> mipila = new Stack<>();
		for (i = 0; i < n; i++) {
			mipila.push(r.nextInt(50));
		}
		while (!mipila.isEmpty()) {
			System.out.println(mipila.pop());
		}
	}


	public static void cola(int n) {
		Queue<Integer> micola = new LinkedList<>();
		for (i = 0; i < n; i++) {
			micola.offer(r.nextInt(50));
		}
		while (!micola.isEmpty()) {
			System.out.println(micola.poll());
		}
	}
}
