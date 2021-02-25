import java.io.*;
import java.util.*;

public class app {
	static PrintWriter pw = new PrintWriter(System.out);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int i = sc.nextInt();

		if (i < 10) {

			if (i < 15) {
				pw.println("soy menor que 15");
			}
			if (i < 12) {
				pw.println("yo también soy menor que 12");
			} else {
				pw.println("soy mayor que 15");
			}
		}
		pw.close();
	}
}

