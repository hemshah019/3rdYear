package lab6;

public class Drivers {
	public static void main(String[] args) {
        // Testing the NumberSorter class
        NumberSorter sorter = new NumberSorter();

        int[] array1 = {1, 9, 2, 3, 10, 8, 12, 1, 99, 2, 43, 68, 109, 0};
        sorter.sort(array1, true);
        printArray("Sorted Ascending: ", array1);

        int[] array2 = {1, 2, 3, 4};
        sorter.sort(array2, true);
        printArray("Sorted Ascending: ", array2);

        int[] array3 = {4, 3, 2, 1};
        sorter.sort(array3, false);
        printArray("Sorted Descending: ", array3);
    }

    private static void printArray(String message, int[] array) {
        System.out.print(message);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
