import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {

        String copyFrom = "mujSoubor.txt";
        String copyTo = "mujSoubor2.txt";


        copyFile("mujSoubor.txt", "mujSoubor2.txt");
        System.out.println(copyFile("mujSoubor.txt","mujSoubor2.txt"));


    }
    private static Boolean copyFile(String source, String target) {

        Path copyFrom = Paths.get(source);
        Path copyTo = Paths.get(target);

        try {
            List<String> lst = Files.readAllLines(copyFrom);
            Files.write(copyTo, lst);
            return true;

        }
        catch (IOException chyba) {
            return false;


        }

    }
}

// Write a function that copies the contents of a file into another file
// It should take two filenames (string) as parameters:
//  - path and name of the source file
//  - path and name of the target file
// It should return a boolean that shows if the copy was successful