import java.io.*;
import java.util.*;

public class codigos {
	double x = 0;

	public static void main(String arg[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("x = Math.round(2.5);  dará como resultado : " + Math.round(2.5) + "\n");
		pw.println("x = Math.round(-2.5); dará como resultado : " + Math.round(-2.5) + "\n");
		pw.println("x = Math.ceil(-2.5);  dará como resultado : " + Math.ceil(-2.5) + "\n");
		pw.println("x = Math.floor(2.6);  dará como resultado : " + Math.floor(2.6) + "\n");
		pw.println("x = Math.abs(-7);  dará como resultado : " + Math.abs(-7) + "\n");
		pw.println("x = Math.PI;  dará como resultado : " + Math.PI + "\n");
		pw.println("x = Math.E;  dará como resultado : " + Math.E + "\n");
		pw.println("x = Math.pow(2, 6);  dará como resultado : " + Math.pow(2, 6) + "\n");
		pw.println("x = Math.max(2, 8);  dará como resultado : " + Math.max(2, 8) + "\n");
		pw.close();
		sc.close();

	}
}
