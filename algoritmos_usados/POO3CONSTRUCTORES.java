CLASE:
package Constructor;
public class Persona {
    //Atributos
    String nombre;
    int edad;
    //Metodos
    //constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
}

MAIN:

package Constructor;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Julian", 20);
        persona1.mostrarDatos();
    }
}
