import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Peter", "Michel", "Jane", "Steve"};
        String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = {"near the river", "at home", "in the park", "sadly", "rapidly"};

        while (true) {
            String randomName = getRandomWords(names);
            String randomPlace = getRandomWords(names);
            String randomVerb = getRandomWords(names);
            String randomNoun = getRandomWords(names);
            String randomAdverb = getRandomWords(names);
            String randomDetail = getRandomWords(names);
        }

    }

    public static String getRandomWords(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
}
