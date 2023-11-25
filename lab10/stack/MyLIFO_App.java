package stack;

import java.util.Stack;

public class MyLIFO_App {

	// This method reserves the given array
	public static <E> void reserve(E[] array) {
		Stack<E> result = new Stack<>();
		for (E e : result) {
			result.push(e);
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = result.pop();
		}

	}

	// This method checks the correctness of the
	// given input
	// i.e. ()(())[]{(())} ==> true, ){[]}() ==>
	// false
	public static boolean isCorrect(String input) {
		Stack <Character> stack = new Stack<>();
		for (char c : input.toCharArray()) {
			if(c == '(')
			stack.push(')');
			else if(c == '{')
			stack.push('}');
			else if(c == '[')
			stack.push(']');
			else if(stack.isEmpty() || stack.pop() != c)
			return false;
		}
		return stack.isEmpty();
	}

	// This method evaluates the value of an expression
	// i.e. 51 + (54 *(3+2)) = 321
	public static int evaluateExpression(String expression) {
		Stack<Integer> openrandStack = new Stack<>();
		Stack<String> operatorStack = new Stack<>();
		
		for (int i = 0; i < expression.length(); i++) {
			
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isCorrect("("));
		System.out.println(isCorrect("()(())[]{(())}"));
	}
}
