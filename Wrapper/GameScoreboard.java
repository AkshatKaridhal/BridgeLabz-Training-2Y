// GameScoreboard.java
public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {100, null, 80, null, 50};

        int nullCount = 0, total = 0;

        for (Integer score : scores) {
            if (score == null) nullCount++;
            else total += score; // Auto-unboxing
        }

        System.out.println("Players not played: " + nullCount);
        System.out.println("Total valid score: " + total);
    }
}
