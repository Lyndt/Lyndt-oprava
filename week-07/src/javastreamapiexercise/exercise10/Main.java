package javastreamapiexercise.exercise10;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //TODO: Create a list of foxes and add at least 8 instances to it.
        ArrayList<Fox> foxArrayList = new ArrayList<>();
        foxArrayList.add(new Fox("Helga", "GREEN", 6));
        foxArrayList.add(new Fox("Otto", "RED", 6));
        foxArrayList.add(new Fox("Ferda", "WHITE", 3));
        foxArrayList.add(new Fox("Linda", "GREEN", 1));
        foxArrayList.add(new Fox("Peter", "GREEN", 2));
        foxArrayList.add(new Fox("Pinky", "WHITE", 1));
        foxArrayList.add(new Fox("Marco", "GREY", 8));
        foxArrayList.add(new Fox("Jakub", "GREEN", 9));


        System.out.println(getGreenFoxes(foxArrayList, "GREEN"));
        System.out.println(getNumberOfGreenFoxes(foxArrayList, "GREEN"));
        System.out.println(colorFrequency(foxArrayList));
    }

    //TODO:write a method to return a list of foxes of green color
    private static List<Fox> getGreenFoxes(List<Fox> foxes, String color) {
        ArrayList<Fox> greenFoxes = new ArrayList<>();
        foxes.stream()
                .filter(n -> n.getColor().equals(color))
                .forEach(greenFoxes::add);

        return greenFoxes;

    }

    //TODO:write a method to return a list of foxes of green color younger than 5
    private static List<Fox> getNumberOfGreenFoxes(List<Fox> foxes, String color) {
        ArrayList<Fox> numberOfFoxesWithGreenColor = new ArrayList<>();
        foxes.stream()
                .filter(n -> n.getColor().equals(color) && n.getAge() < 5)
                .forEach(numberOfFoxesWithGreenColor::add);
        return numberOfFoxesWithGreenColor;
    }

    //TODO:write a method to return a map specifying the frequency of foxes by color
    private static Map<String,Integer> colorFrequency(List<Fox> foxes) {
        ArrayList<Fox> frequencyByColoreList = new ArrayList<>();
        return foxes.stream()
                .map(fox -> fox.getColor())
                .collect(Collectors.toMap(fox -> fox, fox -> 1, Integer::sum));

    }
}