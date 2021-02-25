import java.io.*;

public class codigos {
	public static void main(String arg[]) throws IOException {
		FileWriter Escrituradedatos = new FileWriter("c:/ficheros/datos.txt");
		PrintWriter impresiondedatos = new PrintWriter(Escrituradedatos);
		impresiondedatos.close();
	}
}
