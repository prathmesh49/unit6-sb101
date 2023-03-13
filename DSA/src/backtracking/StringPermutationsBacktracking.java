package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPermutationsBacktracking {
    static List<Character> arr = new ArrayList<>();

    public static void main(String[] args) {
        arr.add('a');
        arr.add('b');
        arr.add('c');
        arr.add('d');
        generatePerm(arr, 0);
    }

    static void generatePerm(List<Character> arr, int index) {
        if (index == arr.size() - 1) {
            arr.forEach(c -> System.out.print(c));
            System.out.println();
            return;
        }

        for (int i = index; i < arr.size(); i++) {
            Collections.swap(arr, i, index);
            generatePerm(arr, index + 1);
            Collections.swap(arr, i, index);
        }
    }

}
