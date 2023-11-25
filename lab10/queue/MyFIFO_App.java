package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyFIFO_App {
	// method stutter that accepts a queue of integers as a parameter and replaces
	// every element of the queue with two copies of that element
	// front [1, 2, 3] back
	// becomes
	// front [1, 1, 2, 2, 3, 3] back
	public static <E> void stutter(Queue<E> input) {
		Queue<E> tmp = new LinkedList<>();
		while (!input.isEmpty()) {
			tmp.add(input.peek());
			tmp.add(input.poll());
		}
		input.addAll(tmp);
	}
	// Method mirror that accepts a queue of strings as a parameter and appends the
	// queue's contents to itself in reverse order
	// front [a, b, c] back
	// becomes
	// front [a, b, c, c, b, a] back

	public static <E> void mirror(Queue<E> input) {
		Queue<E> queue = new LinkedList<>();
		Stack<E> stack = new Stack<>();
		while (!input.isEmpty()) {
			queue.add(input.peek());
			stack.add(input.poll());
		}
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		input.addAll(queue);
	}

	public static void main(String[] args) {
		Queue<Integer> result = new LinkedList<>();
		result.add(1);result.add(2);result.add(3);
		stutter(result);
		System.out.println(result);
		mirror(result);
		System.out.println(result);
	}
}
