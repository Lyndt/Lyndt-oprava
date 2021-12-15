package CountLetters;

import java.util.HashMap;

public class CountLetters {

    public HashMap<String, Integer> charCount(String word) {
        HashMap<String, Integer> letter = new HashMap<>();

        for (int i = 0; i < word.length(); i++){
            String character = " ";
            if (!letter.containsKey(word.charAt(i))) {
                character +=word.charAt(i);
                letter.put(character, 1);
            }
            else {
                character += word.charAt(i);
                int counter = letter.get(character);
                counter++;
                letter.put(character, counter);
            }
        }
        return letter;
    }
}
