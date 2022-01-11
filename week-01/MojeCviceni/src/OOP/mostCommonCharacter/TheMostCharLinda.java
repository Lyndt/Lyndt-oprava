package OOP.mostCommonCharacter;

import java.io.EOFException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheMostCharLinda {
    public static HashMap<Character, Integer> getTwoMostCommonCharacters(String fileName) throws Exception {
        List<String> file = readFile(fileName);
        //TODO: make from list -> HashMap
        HashMap<Character, Integer> occurrences = new HashMap<>();
        for (String line : file) {
            char[] chars = line.toCharArray();
            for (char characters : chars) {
                if (occurrences.containsKey(characters)) {
                    occurrences.put(characters, occurrences.get(characters) + 1);
                } else {
                    occurrences.put(characters, 1);
                }
            }
        }
        //TODO: try to find 2 most common chars (make loop twice)
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < 2; i++) {
            char maxKey = 'a';
            int maxValue = 0;
            for (Map.Entry<Character , Integer> entry : occurrences.entrySet()) {
                if (entry.getValue() > maxValue) {
                    maxKey = entry.getKey();
                    maxValue = entry.getValue();
                }
            }
            result.put(maxKey, maxValue);
            occurrences.remove(maxKey);
        }
        return result;


    }
    public static List<String> readFile(String fileName) throws Exception {
        Path path = Paths.get("src/OOP/mostCommonCharacter/countchar.txt");
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new Exception("Not found.");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getTwoMostCommonCharacters("countchar"));

    }





}
