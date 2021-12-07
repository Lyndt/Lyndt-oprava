package PostIt;

import java.awt.*;

public class PostIt {

    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;

    }

    @Override
    public String toString() {
        return "PostIt.PostIt{" +
                "backgroundColor='" + backgroundColor + '\'' +
                ", text='" + text + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }
}

