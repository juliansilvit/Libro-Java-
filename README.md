# Libro-Java-
Libro de introduccion a la programacion en java para la facultad de ingenieria de la univeridad ecci
La finalidad de esta guía será dar a conocer el lenguaje, todos los IDE (Entorno de Desarrollo Integrado) donde se puede programar, también se enfocará en una guía básica para el inicio en la programación competitiva para todo aquel que quiera aprender, pero primero debemos responder la pregunta del ¿Por qué programar con java y no con otros lenguajes?, pues bien,  Java es un lenguaje de programación muy grande y muy utilizado para distintos fines, entre los más destacados que se puede observar los aplicativos y  páginas web, donde si los pluggins de java no se encuentran instalados no funcionan; de la misma manera para la programación competitiva, en la cual se ha visto un crecimiento exponencial de personas que se interesan más sobre el tema; así mismo, para las personas que quieren incursionar en la programación competitiva existen ahora muchas competencias tanto a nivel nacional como internacional, donde podemos encontrar la Colombian Collegiate Programming League (CCPL), la cual es la liga de programación competitiva en Colombia donde compiten todas las universidades a nivel nacional para demostrar quién es el mejor y así poder identificar una que otra falencia, buscando siempre la perfección; por otro lado, también se encuentra la International Collegiate Programming Constest (ICPC), esta es la competencia internacional más grande, consta de 3 fases donde se ubica la maratón nacional de programación en la cual compiten todas la universidades del país donde esté presente la programación competitiva para escoger a los mejores y representar a su país en la segunda fase que sería la maratón regional de programación, en ella compiten los mejores programadores de los países que conforman cada continente escogiendo a los más destacados para llevarlos a la tercera fase la cual sería la maratón internacional de programación; en donde, compiten todos los países del mundo que tiene programación competitiva, para saber quién es el equipo y país optimo en la programación competitiva, recibiendo incentivos no solamente económicos sino también el reconocimiento por toda la comunidad de programación competitiva del mundo.
Además de la programación competitiva, java es uno de los lenguajes más utilizados para la programación orientada a objetos (POO), esta consta de la organización de códigos en clases, en donde en cada una de ellas va una parte del código que luego se relacionará para conseguir las metas del aplicativo a crear. 
De acuerdo con lo dicho anteriormente la programación orientada a objetos (POO) se entiende como la forma en la que las personas se expresan en la vida real mediante la programación y en la creación de ordenes computacionales buscando la satisfacción de necesidades vistas en el día a día mediante la utilización de los conocimientos de la implementación de clases, objetos, métodos y demás cosas que implica la POO. 
<br>

¿Qué es Java?
Java es un lenguaje de alto nivel que fue creado y comercializado en el año 1995 por Sun Microsystem luego comprada por Oracle, la necesidad de crear este lenguaje es buscar una forma mas eficaz de programar, mas completa, con mas opciones y sobre todo con una estructura fácil y sencilla de entender.
¿Para que sirve?
Este lenguaje al ser multiplataforma y muy completo para la programación orientada a objetos (POO), sirve para crear inmensidad de aplicativos para cualquier tipo de dispositivo y/o maquina que requiera una programación extensa completa y fácil de entender.
Java esta muy presente en la programación de aplicativos móviles, de escritorio y de algunos electrodomésticos, asi como en algunos aplicativos web con código HTML.
Características y ventajas
•	Es un lenguaje simple: este lenguaje de programación no es para nada complejo ya que la curva de aprendizaje es corta y de fácil familiarización ya que la mayoría de términos se usan en otros lenguajes de programación como lo es c o c++.
•	Orientado a objetos: como en si ningún lenguaje de programación a llegado al punto que realmente se quiere dar a entender como programación orientada a objetos, java es el que se aproxima mayormente y es uno de los mas completos en esta función, en este caso en java los objetos se encargan de encapsular información, clases y funciones, que se pueden modificar, usar y llamar dentro y fuera de ellas, como también relacionarlo con otros programas.
•	Su compilación: la compilación es tan buena, que se llega a asimilar al lenguaje ensamblador, es decir, desde la base puede ser interpretado. Esto ayuda muchísimo a la ejecución de aplicaciones compiladas en Java, pues se puede ejecutar básicamente en cualquier lugar sin mayor problema.

<hi>Tipos de lecturas e impresión</h1>
¿Qué es lectura de datos?
A diferencia de otros lenguajes la entrada de entrada de datos es un poco complicadas, las lecturas de datos son la forma en que el usuario interactúa o ingresa los datos para el procesamiento de los mismo con el fin de obtener un resultado esperado con el algoritmo creado.
En los métodos de lectura de datos hay 4 que son los mas utilizados o los mas conocidos para el procesamiento de datos, lo cuales serian, lectura por teclado, lectura por consola, lectura por consola (fast) y procesamiento de textos.

Entrada por teclado:
Esta entrada consta en directamente en una operación en donde se ingrese directamente en el software que se este creado, con el fin de no crear o llamar ninguna clase de lectura.
```java
import java.util.*;
import java.io.*;

public class codigos {
	public static void main(String arg[]) {
		  String str;
          System.out.print("como te llamas:  ");
          str = System.console().readLine();
          System.out.println("Hola " + str + 
        ", ¡bienvenido al curso de java para principiantes!");
	}
}
```

Clase de lectura Scanner
Este método es uno de los mas utilizados y conocidos por los programadores, este analiza todos los tipos de datos primitivos y expresiones regulares aunque por medio de comandos se puede hacer la lectura de datos.
```java
import java.util.*;
import java.io.*;

public class codigos {
	public static void main(String arg[]) {
		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		pw.println("el string es: " + a);
		int x = sc.nextInt(), y = sc.nextInt();
		int c = x + y;
		pw.println("los numeros ingresados son: " + x + ", " + y + " y la suma de ambos es: " + c);
		pw.close();
		sc.close();
	}
}
```
Clase de lectura BufferedReader e InputStreamReader
La lectura del BufferedReader consiste en un tipo de entrada por lectura de String, básicamente hace una lectura de las funciones principales de los datos primitivos en forma de String, con el fin de que cada lectura será mas rápida y se pueda ejecutar y compilar de manera efectiva y completa, la parte del InputStreamReader lo que cumple es que hace que los datos y/o datos que se vayan a ingresar sean captados por teclado y procesados por el Buffered, una de las características es que toca colocarle las excepciones si es en caso numérico o de error como lo seria el IOException o el NumberFormatException.
```java
import java.util.*;
import java.io.*;

public class codigos {
	public static void main(String arg[]) throws NumberFormatException, IOException {
		PrintWriter pw = new PrintWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a= Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		int c=a*b;
		int d=a+b;
		pw.println("La suma de los dos numero leidos con BufferedReader es: "+d+" y la multipliacion es: "+c);
	}
}
```
Clase Console
Esta clase es la preferida para leer los datos de usuarios ya que su seguridad no permite en ciertos casos caracteres repetidos, un ejemplo puede ser en una contraseña de un login para un sistema de ingreso.
```java

import java.util.*;
import java.io.*;

public class codigos {
	public static void main(String arg[]){
		PrintWriter pw = new PrintWriter(System.out);
		String str = System.console().readLine();
        pw.println(str);
	pw.close();
	}
}

```

Ventajas 
•	En la clase console no hay repetición de caracteres.
•	El BufferedReader permite lectura de datos contenedores.
•	El BufferedReader permite guardar la lectura eficiente por un cierto tiempo.
•	El Scanner permite la lectura de los datos primitivos haciéndolo mucho mas entendible y menos tedioso de programar.

Desventajas
•	En el BufferedReader la programación es muy tediosa y difícil de recordar.
•	Al momento de leer no se sincroniza correctamente y puede haber perdida de datos.
•	La clase console tiene un gran problema y es que no puede ser compilado y/o ejecutado en un IDE.

¿Qué es salida de datos?
La salida de datos es una forma de mostrar en pantalla el objetivo que cumplió el software creado, esto se hace para cumplir una necesidad y/o testear que el software este cumpliendo su función correctamente, la mayoría de veces no se tiene que importar librerías ya que son propias del lenguaje, en cambio si se va a usar la impresión de PrintWriter si se necesita importar la librería “java.io.PrintWriter;” , con el fin de llamar a todas sus funciones y sus propiedades.

Clase System (salida de datos)
La salida de datos de la clase System es la mas común y la mas utilizada entre los programadores o desarrolladores que utilicen este lenguaje en su dia a dia, esta salida tiene tres métodos de impresión, print(), println() y printf(), cada una de ellas cumple una función distinta y se pueden utilizar para resolver muchas situaciones en las que se pida una impresión especifica.
•	Impresión print:
Este formato de impresión muestra los que se quiere imprimir pero sin el formateo de un salto de línea, por ejemplo si se quiere imprimir “Hola mundo” sin salto de línea usamos este método y el resultado será el mismo sin ningún salto de línea.
```java
public class codigos {
		public static void main(String arg[]) {
			String str = "Hola mundo";
			System.out.print(str);
			System.out.print(" como estas");
		}
}
```

Este algoritmo imprimirá las dos frases en la misma línea.

•	Impresión Println: 
Este formato de impresión es muy similar al print con la pequeña diferencia del (ln) que cumple la función de aplicar un salto de línea, esto con el fin de hacer una impresión mas limpia o simplemente cumplir con los requerimientos dados.
```java
public class codigos {
		public static void main(String arg[]) {
			String str = "Hola mundo";
			System.out.println(str);
			System.out.println("como estas");
		}
}
```

Este algoritmo imprimirá cada uno en línea separada.


