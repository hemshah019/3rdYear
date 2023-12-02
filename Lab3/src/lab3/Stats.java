package lab3;

import java.util.Arrays;

// This class represents statistics about a collection of numbers.
public class Stats {
	int[] numbers;
	int count;
	/**
	 * Adds a value to the collection.
	 * @param value The value to add to the collection.
	 */
	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}
	/**
	 * Gets the count of numbers in the collection.
	 * @return The count of numbers in the collection.
	 */
	public int getCount() {
		return numbers.length;
	}
	/**
	 * Gets the maximum value in the collection.
     * @return The maximum value in the collection.
	 */
	public int getA() {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) max = numbers[i]; }
			return max;
		}
	/**
	 * Gets the minimum value in the collection.
     * @return The minimum value in the collection.
	 */
	public int getB() {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min)
				min = numbers[i];
		}
		return min;
	}
	/**
	 * Gets the total sum of values in the collection.
     * @return The total sum of values in the collection.
	 */
	public int getTotal() {
		int total = 0;
		// total all values within the array
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
	/**
	 * Gets the average value of the numbers in the collection.
     * @return The average value of the numbers in the collection.
	 */
	public double get() {
		int x = 0;
		for (int i = 0; i < numbers.length; i++) {
			x += numbers[i];
		}
		double y = x/(double)numbers.length;
		return y;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}
	/**
	 * Constructs a Stats object with a specified capacity.
     * @param capacity The capacity of the collection.
	 */
	public Stats(int capacity) {
		numbers = new int[capacity];
	}
}
