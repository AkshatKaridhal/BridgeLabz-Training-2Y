// EmployeeDataProcessing.java
import java.util.*;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {25, 42, 31, 19, 60};

        List<Integer> ageList = new ArrayList<>();
        for (int age : ages) ageList.add(age); // Auto-boxing

        int min = Collections.min(ageList);
        int max = Collections.max(ageList);

        System.out.println("Employee Ages: " + ageList);
        System.out.println("Youngest: " + min);
        System.out.println("Oldest: " + max);
    }
}
