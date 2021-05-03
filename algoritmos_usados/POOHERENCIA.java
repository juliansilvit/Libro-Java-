CLASE PERSONA:
package Herencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    /*Podriamos utilizar elprotected cumple la funcion de que los datos 
    pueden ser privados pero tambien los elementos de la misma 
    clase los pueden utilizar, pero en este caso utilizaremos los getters*/
   
    public Persona(String nombre,String apellido, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido=apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    } 
}


CLASE TRABAJADOR:
package Herencia;

public class Trabajador extends Persona {

    private String codigoTrabajador;
    private String cargo;

    //Constructor especial
    public Trabajador(String nombre, String apellido, int edad, String codigo, String cargo) {
        super(nombre, apellido, edad);
        this.codigoTrabajador = codigoTrabajador;
        this.cargo = cargo;
    }
    public void mostrarDatos() {
        System.out.println("El nombre del trabajador es: " + getNombre());
        System.out.println("El apellido del trabajador es: " + getApellido());
        System.out.println("La del trabajador es: " + getEdad());
        System.out.println("El codigo del trabajador es: " + codigoTrabajador);
        System.out.println("El cargo del trabajador es: " + cargo);
    }
}
CLASE PRINCIPAL(MAIN):
package Herencia;
public class Principal {
    public static void main(String[] args) {

        Trabajador trabajador1 = new Trabajador("Stiven", "Silva", 20, "80806", "Desarrollador");
        trabajador1.mostrarDatos();
    }
}
