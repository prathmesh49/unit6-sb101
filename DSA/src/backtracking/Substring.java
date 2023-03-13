package backtracking;

import java.util.Stack;

public class Substring {
    public static void main(String[] args) {
        String str = "abcd";
        Stack<Character> n_str = new Stack<>();
        generateSubS(str, n_str, 0);
    }

    static void generateSubS(String str, Stack<Character> n_str, int index) {
        if (n_str.size() != 0){
            n_str.forEach(c -> System.out.print(c));
            System.out.println();
        }


        if (index == str.length())
            return;

        for (int i = index; i < str.length(); i++) {
            n_str.push(str.charAt(i));
            generateSubS(str, n_str, i + 1);
            n_str.pop();
        }

    }
}
