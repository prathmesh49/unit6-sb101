package oddSubset;

public class Demo {

	public static void main(String[] args) {
		int set[] = { 1, 2, 3, 5, 4, 6 };
		printSubsets(set);
	}

	static void printSubsets(int set[]) {
		int n = set.length;

		int c=0;
		
		for (int i = 0; i < (1 << n); i++) {
			int sum=0;

			
			for (int j = 0; j < n; j++)
				if ((i & (1 << j)) > 0)
				sum+=set[j];

			if(sum%2==1)
				c++;
		}
		System.out.println(c);
	}

}
