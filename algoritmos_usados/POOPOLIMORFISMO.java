CLASE VEHICULO
package Polimorfismo;

public class Vehiculo {

    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
}
CLASE VEHICULO_DEPORTIVO
package Polimorfismo;

public class Vehiculo_Deportivo extends Vehiculo {

    private int cilindrada;

    public Vehiculo_Deportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
        public int getCilindrada(){
        return cilindrada;
    }
     @Override
    public String mostrarDatos() {
        return "Matricula: "+matricula +"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nCilindrada: "+cilindrada;
    }
}


CLASE VEHICULO_TURISMO

package Polimorfismo;

public class Vehiculo_Turismo extends Vehiculo{
    private int nPuertas;
    
    public Vehiculo_Turismo (int nPuertas, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.nPuertas=nPuertas;
    }
    public int getnPuertas(){
        return nPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: "+matricula +"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nNumero de puertas: "+nPuertas;
    }
    
    
}





CLASE VEHICULO_FURGONETA
package Polimorfismo;

public class Vehiculo_Furgoneta extends Vehiculo {

    private int carga;

    public Vehiculo_Furgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
     @Override
    public String mostrarDatos() {
        return "Matricula: "+matricula +"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nCarga: "+carga;
    }
}






CLASE PRINCIPAL(MAIN)
package Polimorfismo;

public class Principal {

    public static void main(String[] args) {
        Vehiculo carritos[] = new Vehiculo[4];

        carritos[0] = new Vehiculo("EWH925", "Renault", "12 break");
        carritos[1] = new Vehiculo_Turismo(4, "FJH763", "Chevrolet", "Sail");
        carritos[2] = new Vehiculo_Deportivo(670, "MKH424", "Chevrolet", "Camaro");
        carritos[3] = new Vehiculo_Furgoneta(200, "HGS450", "Audi", "Q8");
        
        for (Vehiculo carrito : carritos) {
            System.out.println(carrito.mostrarDatos());
            System.out.println("");
        }
    }
}

