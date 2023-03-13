package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
  public static void main(String[] args) {
    List<Character> arr = new ArrayList<>();
    arr.add('a');
    arr.add('b');
    arr.add('c');
    arr.add('d');
    System.out.println(arr);
    Collections.swap(arr, 0, 0);
    System.out.println(arr);
  }  
}
