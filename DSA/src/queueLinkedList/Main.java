package queueLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.addAll(Arrays.asList(1,2,3,4,5));
		queue.offer(9);
		
		
		
		System.out.println(queue);
		System.out.println(queue.peek()+" next element");
		System.out.println(queue.poll()+" element is removed");
		
	}

}
