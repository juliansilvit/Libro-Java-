import java.io.*;
import java.util.*;

public class codigos {
	public static void main(String arg[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		System.out.println("Digite dos numeros para incrementar y disminuir");
		int x=sc.nextInt();
		int z=sc.nextInt();
		x++;
		z--;
		pw.println(x);
		pw.println(z);
		pw.close();
		sc.close();
	}
}
