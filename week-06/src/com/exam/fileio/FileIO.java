package com.exam.fileio;

//import java.io.IOException;
//import java.nio.file.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        System.out.println(bestYearOfMovies("src/com/exam/fileio/top100.dat"));
    }

    public static int bestYearOfMovies(String filename) throws IOException {
        Path path = Paths.get(filename);

        List<String> fileLines = Files.readAllLines(path);
        List<String> movies = new ArrayList<>();
        for (String movie : fileLines) {
            String year = movie.substring(0, 4);
            movies.add(year);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String year : movies) {
            int count = map.getOrDefault(year, 0);
            map.put(year, count + 1);
        }
        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        return Integer.parseInt(key);
    }
}

