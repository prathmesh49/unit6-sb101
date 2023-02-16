package doctors_appointment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("enter the elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] list = new int[n];
		int it = n;
		int in = 0;
		while (it-- > 0) {
			list[in++] = sc.nextInt();
		}
		List<Integer> line = new ArrayList<>();
		it = n;
		while (it-- > 0) {
			// System.out.println(sc.nextInt());
			line.add(sc.nextInt());
		}
		sc.close();
		int move = 0;
		for (int i = 0; i < n; i++) {
//			 System.out.println(list[i]);
			int c=0;
			int ind=0;
			

			if (line.contains(list[i]) && line.indexOf(list[i]) == 0) {
				ind=line.indexOf(list[i]);
				line.remove(line.indexOf(list[i]));
				move++;
			} else if (line.contains(list[i])) {
				ind=line.indexOf(list[i]);
				move = move + line.indexOf(list[i]) + 1;
				c=line.indexOf(list[i]) + 1;
				line.remove(line.indexOf(list[i]));

			}
			System.out.println(c+" "+list[i]+" "+ind);
		}
		System.out.println("move: "+move);
	}

}

/*
enter the elements
20
18 19 14 3 20 13 10 15 8 9 16 5 11 7 17 2 12 6 1 4
20 10 13 15 17 2 12 18 16 8 9 6 5 19 1 7 14 3 11 4
 */
