import java.util.*;
import java.io.*;

public class codigos {
	public static void main(String arg[]) {
		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		pw.println("el string es: " + a);
		int x = sc.nextInt(), y = sc.nextInt();
		int c = x + y;
		pw.println("los numeros ingresados son: " + x + ", " + y + " y la suma de ambos es: " + c);
		pw.close();
		sc.close();
	}
}
