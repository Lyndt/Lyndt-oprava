package OOP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
//
//        try {
//            Path path = Paths.get("OOP/my-file.txt");
//            List<String> list = Files.readAllLines(path);
//            System.out.println(list);
//        } catch (IOException e) {
//            System.err.println("Unable to read file: my-file.txt.");
//        }
        Path paths = Paths.get("C:\\Users\\Marnotka\\New\\greenfox\\week 1\\MojeCviceni\\src\\OOP\\my-file.txt");
        printEachLine(paths);


    }
    public static void printEachLine(Path path) {
        List<String> pathContent = new ArrayList<String>();
        try {
            pathContent = Files.readAllLines(path);
            for (String file : pathContent) {
                System.out.println(file);

            }
        } catch (IOException e) {
            System.err.println("Unable to read file: my-file.txt.");
        }
    }

}
// Write a program that opens a file called "my-file.txt" and prints each
// line from the file.
// If the program is unable to read the file (for example the file does not exist),
// it should print the following error message: "Unable to read file: my-file.txt".