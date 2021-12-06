import java.io.OutputStream;

public class Strings3 {
    public static void main(String[] args) {
        System.out.println(stringWithStars("Hello world"));
//        String input = "hello";
//        pairStars(input, 0);
//        System.out.println(OutputStream.nullOutputStream());

//    }
//    static String output;
//    public static void pairStars(String input, int i) {
//        output = output + input.charAt(i);
//        if (i == input.length() - 1) {
//            return;
//        }
//        if (input.charAt(i) == input.charAt(i + 1)) {
//            output = output + '*';
//        }
//         pairStars(input, i + 1);
    }
    public static String stringWithStars(String str)
    {
        if(str.length() < 2)
            return str;
        return str.charAt(0) + "*" + stringWithStars(str.substring(1));
    }

}
// Given a string, write a recursive (no loops) method which returns a new
// string with all adjacent chars separated by an `*`. Please note that there
// should be no trailing `*` at the end of the returned string. For example,
// the string `word` should be changed to `w*o*r*d`.