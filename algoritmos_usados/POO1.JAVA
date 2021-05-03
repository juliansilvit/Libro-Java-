public class Coche {

    //Atributos
    String color;
    String marca;
    int km;

    //Metodo
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.color = "Rojo";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del auto numero 1 es: " + coche1.color);
        System.out.println("La marca del auto 1 es: " + coche1.marca);
        System.out.println("El kilometraje del auto 1 es: " + coche1.km);

        System.out.println("_________________________________________________________");
        Coche coche2 = new Coche();

        coche2.color = "Blanco";
        coche2.marca = "Mercedez-Benz";
        coche2.km = 20000;
        System.out.println("El color del auto numero 2 es: " + coche2.color);
        System.out.println("La marca del auto 2 es: " + coche2.marca);
        System.out.println("El kilometraje del auto 2 es: " + coche2.km);
    }

}
