CLASE:
package Librito;

import javax.swing.JOptionPane;

public class Operacion {

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos
    
    //Metodos para pedirle al usuario que digite los numeros
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
    }
    //Metodo para sumar
    public void sumar() {
        suma = numero1 + numero2;
    }
    //Metodo para restar
    public void resta() {
        resta = numero1 - numero2;
    }
    //Metodo para multiplicar
    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }
    //Metodo para dividir
    public void dividir() {
        division = numero1 / numero2;
    }
    
    public void mostrarResultado(){
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicacion es: "+ multiplicacion);
        System.out.println("La divison es: "+ division);
    }
}



MAIN:

package Librito;

public class Main {
       public static void main(String[]args){
           Operacion op = new Operacion();
           
           op.leerNumeros();
           op.sumar();
           op.resta();
           op.multiplicar();
           op.dividir();
           op.mostrarResultado();
                        
       }
}
