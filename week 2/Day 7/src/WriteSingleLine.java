import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        Path path = Paths.get("my-file.txt");
        List<String> name = new ArrayList<>();
        name.add("Linda Sukovská");

        try {
            Files.write(path, name);
        }
        catch (IOException chyba) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
// Write a function that is able to manipulate a file
// by writing your name into it as a single line.
// The file should be named "my-file.txt".
// In case the program is unable to write the file,
// it should print the following error message: "Unable to write file: my-file.txt".

