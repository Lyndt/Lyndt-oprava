package exercise.beforeExam;

public class AppendA {
    public static void main(String[] args) {
        String animals[] = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
                "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"};

        for (int i = 0; i < animals.length; i++) {
            animals[i] += "a";
            System.out.println(animals[i]);

        }

    }
}
// - Create an array variable named `animals`
//   with the following content:
//   `["koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
//     "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"]`
//
// - Add an `"a"` at the end of all elements (use a loop!)