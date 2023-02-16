package masaiCodingCompetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) throws NullPointerException {
		System.out.println("enter");
		FastReader sc = new FastReader();
		Map<Integer, List<Integer>> s = new LinkedHashMap<>();
		int n = sc.nextInt();
		while (n-- > 0) {

			String c = sc.next();
			if (c.equals("E")) {

				int cn = sc.nextInt();
				int elem = sc.nextInt();
				if (!s.containsKey(cn)) {
					s.put(cn, new ArrayList<>());
					try {

						s.get(cn).add(elem);
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
				} else {
					try {

						s.get(cn).add(elem);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} else {
				try {
					if ( s.get(1) != null &&s.get(1).size() != 0) {

						System.out.println(1 + " " + s.get(1).remove(0));

					} else if (s.get(2) != null &&s.get(2).size() != 0) {

						System.out.println(2 + " " + s.get(2).remove(0));

					} else if ( s.get(3) != null &&s.get(3).size() != 0) {

						System.out.println(3 + " " + s.get(3).remove(0));

					} else if ( s.get(4) != null &&s.get(4).size() != 0) {

						System.out.println(4 + " " + s.get(4).remove(0));

					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

//		System.out.println(s);
	}
}
