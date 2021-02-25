import java.util.*;

public class códigos {
	// CREACION DEL METODO ENVOLTORIO INTEGER
	public void metodoEnvoltorio(Integer a) {
		// IMPRESION DEL DATO CON LA CONCATENACION DE LA PALABRA SEGUN SU TIPO
		System.out.println("Integer " + a);
	}

	// CREACION DEL METODO DATO PRIMITIVO INT
	public void metodoEnvoltorio(int a) {
		// IMPRESION DEL DATO CON LA CONCATENACION DE LA PALABRA SEGUN SU TIPO
		System.out.println("int " + a);
	}

	public static void main(String args[]) {
		// LLAMADO DEL METODO PARA LA IMPRESION
		códigos LLAMADO = new códigos();
		// DECLARAR VALORES DE LOS METODOS Y CLASES CREADAS
		Integer a1 = new Integer(1);
		int a2 = 1;
		// LLAMADO DE CADA CLASE PARA SU RESPECTIVA IMPRESION
		LLAMADO.metodoEnvoltorio(a1);
		LLAMADO.metodoEnvoltorio(a2);

	}

}
