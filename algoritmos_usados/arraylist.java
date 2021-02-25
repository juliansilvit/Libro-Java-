ARRAYLIST

import java.util.*;
import java.io.*;
public class codigos {

    public static void main(String[] args) {
    	PrintWriter pw= new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ejemplo = new ArrayList();
        int x;
  
        do {
           pw.println("Introduce números enteros. 0 para acabar: ");                                     
           pw.println("Numero: ");
            x = sc.nextInt();
            if (x != 0){
                ejemplo.add(x);
            }
        }while (x != 0);
       
        pw.println("Ha introducido: " + ejemplo.size() + " números:");
       
        //mostrar el arrayList completo
        pw.println(ejemplo);
       
        //recorrido usando un iterador para mostrar un elemento por línea                                         
        Iterator it = ejemplo.iterator();
        while(it.hasNext()){
        	pw.println(it.next());
        }
  
        //recorrido usando foreach para sumar los elementos
        double suma = 0;
        for(Integer i: ejemplo){
            suma = suma + i;
        }
        pw.println("Suma: " + suma);
        pw.println("Media: " + suma/ejemplo.size());
        pw.close();
        sc.close();
    }
}
