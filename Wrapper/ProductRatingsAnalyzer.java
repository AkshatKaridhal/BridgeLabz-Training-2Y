// ProductRatingsAnalyzer.java
import java.util.*;
import java.util.stream.*;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] primitiveRatings = {4, 5, 3};
        List<Integer> objectRatings = new ArrayList<>(Arrays.asList(5, null, 4));

        List<Integer> allRatings = new ArrayList<>();
        for (int r : primitiveRatings) allRatings.add(r);
        allRatings.addAll(objectRatings);

        List<Integer> validRatings = allRatings.stream()
                .filter(Objects::nonNull)
                .toList();

        double avg = validRatings.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("All Ratings: " + allRatings);
        System.out.println("Average Rating: " + avg);
    }
}
