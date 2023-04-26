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

        System.out.println("Hello, this is yout first random-generated sentence: ");

        while (true) {
            String randomName = getRandomWords(names);
            String randomPlace = getRandomWords(places);
            String randomVerb = getRandomWords(verbs);
            String randomNoun = getRandomWords(nouns);
            String randomAdverb = getRandomWords(adverbs);
            String randomDetail = getRandomWords(details);

            System.out.printf("%s from %s %s %s %s%n", randomName, randomPlace, randomAdverb, randomVerb, randomNoun, randomDetail);
            System.out.println("Click [Enter] to generate a new one.");
        }

    }

    public static String getRandomWords(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
}
