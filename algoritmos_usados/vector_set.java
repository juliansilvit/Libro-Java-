import java.io.*;
import java.util.*;

public class Sets {

	public static void main(String[] args) throws Throwable, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			if (set.add(Integer.parseInt(br.readLine()))) {

			} else {
				System.out.println("Este dato ya existe en el set");
			}

		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
