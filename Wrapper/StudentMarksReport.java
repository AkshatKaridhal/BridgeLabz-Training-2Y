// StudentMarksReport.java
import java.util.*;

public class StudentMarksReport {
    public static void main(String[] args) {
        String[] inputs = {"85", "95", "null", "abc", "88"};

        List<Integer> marks = new ArrayList<>();
        for (String s : inputs) {
            try {
                if (s.equalsIgnoreCase("null")) continue;
                marks.add(Integer.valueOf(s));
            } catch (NumberFormatException e) {
                // ignore invalid
            }
        }

        double avg = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Valid Marks: " + marks);
        System.out.println("Average: " + avg);
    }
}
