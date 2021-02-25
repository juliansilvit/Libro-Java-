package archivo4;

import java.io.*;
public class app {
	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		DataInputStream sc = new DataInputStream(System.in);
		String str;
		int n, aux = 0;
		pw.print("\n[" + aux + "] ");
		while ((str = sc.readLine()) != null) {
			n = Integer.parseInt(str);
			aux += n;
			pw.print("\n[" + aux + "] ");
		}
		pw.println("\n[" + aux + "]\n");
		pw.close();
	}
}
