import java.util.*;
import java.io.*;

public class codigos {
	public static void main(String arg[]) throws NumberFormatException, IOException {
		PrintWriter pw = new PrintWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a= Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		int c=a*b;
		int d=a+b;
		pw.println("La suma de los dos numero leidos con BufferedReader es: "+d+" y la multipliacion es: "+c);
	}
}
