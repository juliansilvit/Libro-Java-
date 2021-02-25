import java.util.*;
import java.io.*;

public class Pila {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String[] args) {

		Random r = new Random();
		Stack<Integer> pila = new Stack<>();
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int num = r.nextInt();
			pw.println(num);
			pila.push(num);
		}
		pw.println("--------------------");
		while (!pila.isEmpty()) {
			pw.print(pila.pop() + "\t");
		}
		pw.close();
		sc.close();
	}

}
