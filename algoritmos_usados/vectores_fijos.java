import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=10;
		int vec [] = new int [a];
		for (int i = 0; i < vec.length; i++) {
			vec[i]=a--;
		}
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
	}
}
