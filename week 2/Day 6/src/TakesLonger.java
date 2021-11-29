public class TakesLonger {
    public static void main(String... args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
        // Use pieces of the `quote` variable, e.g. quote.substring(...), instead of just redefining the string!


        StringBuilder add = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        add.insert(21, "always takes longer than ");
        // System.out.println(add);
        int num = quote.indexOf("you");
        System.out.println(num + " - info for me if I dont wanna count");
        quote = add.toString();

        System.out.println(quote);






    }




}