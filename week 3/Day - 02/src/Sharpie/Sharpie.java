package Sharpie;

public class Sharpie {
    private String color;
    private int width;
    private int inkAmount;

    public Sharpie(String color, int widthOfSharpie) {
        this.color = color;
        this.inkAmount = 100;
        this.width = widthOfSharpie;
    }


    public void use() {
        this.inkAmount -= 10;
    }

    public int getInkAmount() {
        return inkAmount;
    }
}
/*Create a Sharpie.Sharpie class
We should know the followings about each sharpie:
color (which should be a string),
width (which will be a number) and the
inkAmount (another number)
We need to specify the color and the width at creation
Every sharpie is created with a default inkAmount value: 100
We can use() the sharpie objects: using it decreases inkAmount by 10*/