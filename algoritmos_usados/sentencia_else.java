import java.util.*;
import java.io.*;

public class Main4 {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a < 16) {
			pw.println("la condicional if se ejecuto");
		} else {
			pw.println("la condicional if no se cumplio y el else se ejecuto");
		}
		pw.close();
	}
}
