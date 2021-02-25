import java.util.*;

public class codigos {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Estas son las distintas formas del printf");
		int x=10;
		System.out.printf("%d %n", x);
		System.out.println("________________________________________");
		double a=12.3698;
		System.out.printf("%.2f %n", a);
		System.out.println("________________________________________");
		double n = 1.25036;
		System.out.printf("%.3f %n", n);
		System.out.println("________________________________________");
		double v = 1.25036;
		System.out.printf("%+.3f %n", v);
		System.out.println("________________________________________");
		double z = 1.25036;
		int y = 10;
		System.out.printf("z = %.2f y = %d %n", z, y);
		System.out.println("________________________________________");
		double c = 1.25036;
		System.out.println("Aqui se hace un corrimiento de los espacios que se especifique");
		System.out.printf("%+10.2f %n", c);
		System.out.println("________________________________________");
		sc.close();
	}
}
