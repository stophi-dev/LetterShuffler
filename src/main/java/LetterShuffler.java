import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LetterShuffler {

    public static void main(String[] args) {
        System.out.println(shuffleSentence("Keep the first and last letter of a word and shuffle the other letters randomly and it is still fairly readable"));
    }

    public static String shuffleSentence(String input) {
        String[] words = input.split(" ");
        List<String> result = new ArrayList<>();
        for (String word : words) {
            result.add(shuffleWord(word));
        }
        return String.join(" ", result);
    }

    private static String shuffleWord(String word) {
        if (word.length() < 4) {
            return word;
        } else {
            String innerSubstring = word.substring(1, word.length() - 1);
            StringBuilder toProcess = new StringBuilder(innerSubstring);
            StringBuilder shuffledWord = new StringBuilder();
            shuffledWord.append(word.charAt(0));
            for (char ch : innerSubstring.toCharArray()) {
                char shuffledChar = shuffleChar(toProcess.toString(), ch);
                shuffledWord.append(shuffledChar);
                toProcess.deleteCharAt(toProcess.indexOf(String.valueOf(shuffledChar)));
            }
            shuffledWord.append(word.charAt(word.length() - 1));
            return shuffledWord.toString();
        }
    }

    private static char shuffleChar(String choices,  char ch) {
        if (choices.length() == 1) {
            return choices.charAt(0);
        }
        int selfIndex = choices.indexOf(String.valueOf(ch));
        StringBuilder toProcess = new StringBuilder(choices);
        if (selfIndex >= 0) {
            toProcess.deleteCharAt(selfIndex);
        }
        int pos = new Random().nextInt(toProcess.length());
        return toProcess.charAt(pos);
    }
}
