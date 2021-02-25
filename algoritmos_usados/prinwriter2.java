import java.io.*;
import java.util.*;
public class codigos {
	public static void main(String arg[]) throws IOException {
		Scanner sc= new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int x=sc.nextInt();
		int z=sc.nextInt();
		pw.println(x*z);
		pw.close();
		sc.close();
	}
}
