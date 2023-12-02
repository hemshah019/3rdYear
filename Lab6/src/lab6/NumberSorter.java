package lab6;

import java.util.Stack;

public class NumberSorter {
	public void sort(int[] numbers, boolean ascending) {
        Stack<Integer> srcStack = new Stack<>();
        Stack<Integer> destStack = new Stack<>();

        for (int number : numbers)
            srcStack.push(number);
        
        while (!srcStack.isEmpty()) {
            int currentNumber = srcStack.pop();

            while (!destStack.isEmpty() && ((ascending && destStack.peek() < currentNumber) ||
                    (!ascending && destStack.peek() > currentNumber))) {
                srcStack.push(destStack.pop());
            }

            destStack.push(currentNumber);
        }

        // Copy the sorted numbers back to the original array
        int i = 0;
        while (!destStack.isEmpty()) {
            numbers[i++] = destStack.pop();
        }	
	}
}
