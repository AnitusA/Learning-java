import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = sc.nextLine().toLowerCase();

        String[] words = text.split("\\W+");

        // Create HashMap to store word counts
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) { // avoid empty strings
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}
