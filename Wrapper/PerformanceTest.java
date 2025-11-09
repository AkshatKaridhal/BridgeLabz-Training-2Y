// PerformanceTest.java
import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {
        int size = 1_000_000;
        long start, end;

        // Using int[]
        int[] intArray = new int[size];
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) intArray[i] = i;
        long sum1 = 0;
        for (int x : intArray) sum1 += x;
        end = System.currentTimeMillis();
        System.out.println("int[] sum = " + sum1 + ", Time = " + (end - start) + "ms");

        // Using ArrayList<Integer>
        ArrayList<Integer> list = new ArrayList<>(size);
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) list.add(i); // Auto-boxing
        long sum2 = 0;
        for (int x : list) sum2 += x; // Auto-unboxing
        end = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> sum = " + sum2 + ", Time = " + (end - start) + "ms");
    }
}
