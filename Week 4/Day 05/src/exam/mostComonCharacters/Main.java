package exam.mostComonCharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        readFromFile();

    }
    public static void readFromFile() throws IOException {
        Path path = Paths.get("countchar.txt");
        List<String> file = new ArrayList<>();
        file = Files.readAllLines(path);
        for (String files : file) {
            System.out.println(files);
        }
    }

}
