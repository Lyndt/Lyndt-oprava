import java.nio.charset.StandardCharsets;

public class Strings2 {
    public static void main(String[] args) {

    }
    public String removeAllX(String str)
    {
        char singleChar;
        if(str.length() == 0)
            return str;
        singleChar = str.charAt(0);
        if(singleChar == 'x')
            return removeAllX(str.substring(1));
        return singleChar + removeAllX(str.substring(1));
    }
}
