//Clase:

package archivo4;

public class Lista implements java.io.Serializable {
	private int[] x; // array de datos
	private int n; // dimensión

	public Lista(int[] x) {
		this.x = x;
		n = x.length;
		ordenar();
	}

	public double valorMedio() {
		int suma = 0;
		for (int i = 0; i < n; i++) {
			suma += x[i];
		}
		return (double) suma / n;
	}

	public int valorMayor() {
		return x[n - 1];
	}

	public int valorMenor() {
		return x[0];
	}

	private void ordenar() {
		int aux;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (x[i] > x[j]) {
					aux = x[j];
					x[j] = x[i];
					x[i] = aux;
				}
			}
		}
	}

	public String toString() {
		String texto = "";
		for (int i = 0; i < n; i++) {
			texto += "\t" + x[i];
		}
		return texto;
	}
}

//_______________________________________________________________________________________________________________________________

//App:
package archivo4;

import java.io.*;
import java.util.*;

public class app {
	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String[] args) {
		Lista lit = new Lista(new int[] { 12, 15, 11, 4, 32 });
		try {
			ObjectOutputStream impre = new ObjectOutputStream(new FileOutputStream("media.obj"));
			impre.writeObject("guardar este string y un objeto\n");
			impre.writeObject(lit);
			impre.close();

			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("media.obj"));
			String str = (String) entrada.readObject();
			Lista obj1 = (Lista) entrada.readObject();
			pw.println("Valor medio " + obj1.valorMedio());
			pw.println("-----------------------------");
			pw.println(str + obj1);
			pw.println("-----------------------------");
			entrada.close();
//se puede fundir en una catch Exception
		} catch (IOException ex) {
			pw.println(ex);
		} catch (ClassNotFoundException ex) {
			pw.println(ex);
		}

		try {
//espera la pulsación de una tecla y luego RETORNO
			System.in.read();
		} catch (Exception e) {
		}
		pw.close();
	}
}
