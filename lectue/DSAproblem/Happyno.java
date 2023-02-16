package DSAproblem;

public class Happyno {
    public static void main(String[] args) {
        // This will take the input
        String s = "302638422";
        System.out.println(happyNo(s));

    }

    // Happy number
    static int happyNo(String s) {
        int n = Integer.parseInt(s);
        System.out.println(n);
        
        if (n == 1)
            return 1;
        if(n>1&&n<10) 
            return -1;
        if (n < 1)
            return 0;

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));

            sum += Math.pow(num, 2);
        }

        String str = "" + sum;
        
        return happyNo(str);
    }
}
