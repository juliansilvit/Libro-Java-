import java.io.*;
import java.util.*;

public class codigos {
	public static void main(String arg[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		System.out.println("Digite un numero");
		int x=sc.nextInt();
		x+=10;
		pw.println(x);
		System.out.println("Digite un numero");
		int y=sc.nextInt();
		y-=20;
		pw.println(y);
		System.out.println("Digite un numero");
		int z=sc.nextInt();
		z*=10;
		pw.println(z);
		pw.close();
		sc.close();
	}
}
