import java.io.*;


public class códigos {
	public static void main(String args[]) throws IOException {
		//Lectura rápida mediante String
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Impresión rápida mediante ejecución String
		PrintWriter pw = new PrintWriter(System.out);
		Integer Prueba1 = Integer.parseInt(br.readLine());
		Integer Prueba2 = Integer.parseInt(br.readLine());
		pw.println(Prueba1 + Prueba2);
		pw.println("___________________________");
		String cadenita = br.readLine();
		pw.println(cadenita);
		pw.println("___________________________");
		Double Pruebadecimal = Double.parseDouble(br.readLine());
		pw.println(Pruebadecimal);
		pw.println("___________________________");
		pw.close();

	}

}
