import java.io.PrintWriter;
import java.util.*;

public class códigos {
	public static void main(String args[]) {
		PrintWriter pw = new PrintWriter(System.out);
		// CREACION DEL OBJECJO CHARACTER ESPECIFICANDO SU VALOR
		Character ch = new Character('C');
		pw.println("ISLETTER");
		// IMPRESIONES PARA VERIFICAR SI ES UN CARACTER
		pw.println(ch.isLetter(ch));
		pw.println(Character.isLetter('8'));
		pw.println("___________________________________________________");

		pw.println("ISDIGIT");
		pw.println(ch.isDigit(ch));
		pw.println(Character.isDigit('1'));
		pw.println("___________________________________________________");

		pw.println("ISWHITESPACE");
		pw.println(ch.isWhitespace(ch));
		pw.println(Character.isWhitespace(' '));
		pw.println("___________________________________________________");

		pw.println("ISUPPERCASE");
		pw.println(Character.isUpperCase(ch));
		pw.println(Character.isUpperCase('N'));
		pw.println("___________________________________________________");

		pw.println("ISLOWERCASE");
		pw.println(Character.isLowerCase(ch));
		pw.println(Character.isLowerCase('N'));
		pw.println("___________________________________________________");

		pw.println("TOUPPERCASE");
		pw.println(Character.toUpperCase('b'));
		pw.println(Character.toUpperCase('c'));
		pw.println("___________________________________________________");

		pw.println("TOLOWERCASE");
		pw.println(Character.toLowerCase('B'));
		pw.println(Character.toLowerCase('C'));
		pw.println("___________________________________________________");

		pw.println("TOSTRING");
		pw.println(Character.toString('t'));
		pw.println(Character.toString('H'));
		
		pw.close();
	}

}
