import java.util.*;
import java.io.*;

public class Main4 {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a < 16) {
			pw.println("la condicional if retorno true");
		} 
		pw.close();
	}
}
