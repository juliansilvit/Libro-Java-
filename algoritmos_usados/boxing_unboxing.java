import java.util.*;

public class Main {
		public static void main(String args[]) {
			//BOXING, INGRESADO UN VALOR PRIMITIVO EN UN ENVOLTORIO DE LA CLASE INTEGER
			Integer iOb = Integer.valueOf(80);
			//UNBOXING EXTRAYENDO EL VALOR DADO EN EL BOXING EN UNA VARIABLE DE TIPO DE PRIMITIVO
	        int i=iOb.intValue();
	        //IMPRESION DE LOS DATOS DEL UNBOXIN Y BOXING
	        System.out.println(i+ " "+iOb);
	}

}
