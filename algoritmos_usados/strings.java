import java.util.*;
import java.io.*;
public  class codigos {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out); 
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		while (sc.hasNextLine()) {
			s = sc.nextLine();
			s = s.replaceAll("_", "");
			if (s.equals("")) {
				break;
			}
			s = s.replace("|", "");
			s = s.replace(".", "");
			s = s.replace(" ", "0");
			s = s.replace("o", "1");
			int a = Integer.parseInt(s, 2);
			char imp = (char) a;
			pw.print(imp);
			pw.close();
			sc.close();
		}
	}
}
