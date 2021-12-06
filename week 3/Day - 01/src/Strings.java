public class Strings {
    public static void main(String[] args) {

    }
    public String changeXtoY(String str)
    {
        char singleChar;
        if(str.length() == 0)
            return str;
        singleChar = str.charAt(0);
        if(singleChar == 'x')
            return 'y' + changeXtoY(str.substring(1));
        return singleChar + changeXtoY(str.substring(1));
    }
}
// Given a string, write a recursive (no loops) method which returns
// a new string with the lowercase 'x' chars changed to 'y' chars.