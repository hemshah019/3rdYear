package lab4;

public class ArrayProcessor {
	
	public int getArrayLength(Object[] a) {
        int count = 0;
        while (count < a.length) {
            Object t = a[count];
            count++;
        }
        return count;
    }
}
