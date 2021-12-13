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
// - Create an array variable named `animals`
//   with the following content:
//   `["koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
//     "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"]`
//
// - Add an `"a"` at the end of all elements (use a loop!)