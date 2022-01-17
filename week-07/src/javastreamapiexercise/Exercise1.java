package javastreamapiexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Exercise1 {
    public static void main(String[] args) {
        //TODO: Write a method to return a list of even numbers from the list of integers below using the Stream API.
//        System.out.println(evenNumbers());
        //TODO: Write a method to return a list of squares of positive numbers from the list of integers below using the Stream API.
//        System.out.println(positiveNumbers());
        //TODO:Write a method to return a list of numbers whose square is greater than 20 from the list of integers below using the Stream API. The value 20 should be one of the method's parameters.
//        System.out.println();
        //TODO: Write a method to return the average of odd numbers in the list of integers below using the Stream API. Implement this without calculating the sum first!
//        System.out.println(average());
//        //TODO: Write a method to return the sum of odd numbers in the list of integers below using the Stream API.
//        System.out.println(sumOfOdd());
        //TODO:Write a method to return a list of uppercase characters from a given string using the Stream API.
//        System.out.println(returnUpperCase());

    }

    private static List<String> returnUpperCase() {
        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";
        List<String> upperCaseCharacters = new ArrayList<>();
        s.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char)c))
                .forEach(upperCaseCharacters::add);
        return upperCaseCharacters;

    }

    private static long sumOfOdd() {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer::sum);


    }

    private static double average() {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> averageNumber = new ArrayList<>();
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(averageNumber::add);
        return averageNumber.stream()
                .mapToDouble(n -> n)
                .average().orElse(Double.NaN);


    }

    private static List<Integer> positiveNumbers() {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> positiveNumbers = new ArrayList<>();
        numbers.stream()
                .filter(n -> n > 0)
                .map(n -> n * n)
                .forEach(positiveNumbers::add);
        return positiveNumbers;

    }


    private static List<Integer> evenNumbers() {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> evenNumbers = new ArrayList<>();
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(evenNumbers::add);
        return evenNumbers;
    }

}
