public class AppendA {
    public static void main(String[] args) {

        String[] animals = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
                "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"};

        for (int b = 0; b < animals.length; b++){
            animals[b] = animals[b] + "a";
            System.out.println(animals[b]);
        }
    }
}
