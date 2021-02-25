import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> jugadores = new ArrayList<>();
		jugadores.add("Jordan");
		jugadores.add("Gasol");
		jugadores.add("Ronaldo");
		jugadores.add("Messi");
		int cont = 0;
		System.out.println("Los jugadores agregados en el arreglo son: ");

		for (String str : jugadores) {
			System.out.println((cont + 1) + ".- " + str);
			cont++;
		}
	}
}
