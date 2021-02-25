import java.io.*;
import java.util.*;

public class codigos {
	public static void main(String arg[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		System.out.println("Digite dos numeros");
		float a = sc.nextFloat(), b = sc.nextFloat(), suma, resta, multi, divi, mod;
		suma = a + b;
		resta = a - b;
		multi = a * b;
		divi = a / b;
		mod = a % b;
		pw.println("el resultado de la suma es: " + suma);
		pw.println("el resultado de la resta es: " + resta);
		pw.println("el resultado de la multiplicacion es: " + multi);
		pw.println("el resultado de la division es: " + divi);
		pw.println("el resultado del residuo es: " + mod);
		pw.close();
		sc.close();
	}
}
