package exam.mostComonCharacters;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Path file = Paths.get("countchar.txt");
        String textPath = file.toString();
        System.out.println(textPath);



    }

}
