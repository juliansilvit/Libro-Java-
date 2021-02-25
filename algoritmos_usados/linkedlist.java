import java.util.*;
import java.io.*;
public class codigos {

    public static void main(String[] args) {
    	PrintWriter pw= new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        LinkedList ListCode = new LinkedList();
        int x=sc.nextInt();
        for (int i = 1; i <= x; i++) {
			ListCode.add(i);
		}
        pw.println("el primer digito es: " + ListCode.getFirst());
        pw.println("el ultimo digito es: " + ListCode.getLast());
        pw.close();
    }
}
