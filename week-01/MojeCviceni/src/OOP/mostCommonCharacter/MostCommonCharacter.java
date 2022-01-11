package OOP.mostCommonCharacter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonCharacter {

    public static HashMap<Character, Integer> getTwoMostCommonCharacters(String filename)
            throws Exception {

        //read in the content of the file
        List<String> lines = readFile(filename);
        //turn content into characters
        HashMap<Character, Integer> occurrences = new HashMap<>();
        for (String line : lines) {
            char[] characters = line.toCharArray();
            for (char character : characters) {
                if(occurrences.containsKey(character)) {
                    occurrences.put(character, occurrences.get(character) + 1);
                } else {
                    occurrences.put(character, 1);
                }
            }
        }

        //get the 2 most common
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < 2; i++) {
            char maxKey = 'a';
            int maxValue = 0;
            for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
                if(entry.getValue() > maxValue) {
                    maxKey = entry.getKey();
                    maxValue = entry.getValue();
                }
            }
            result.put(maxKey, maxValue);
            occurrences.remove(maxKey);
        }
        //return result

        return result;
    }

    private static List<String> readFile(String filename) throws Exception {
        Path path = Paths.get(filename);

        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new Exception("File does not exist!");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getTwoMostCommonCharacters("countchar.txt"));
    }

}