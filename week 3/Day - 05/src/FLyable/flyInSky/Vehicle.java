package FLyable.flyInSky;

 abstract public class Vehicle {
    private String name1;
    private String color;
    private int speed;

     public String getInfo() {
         return info;
     }

     public Vehicle(String info) {
         this.info = info;
     }


     private String info;

     public String getName1() {
         return name1;
     }

     public String getColor() {
         return color;
     }

     public int getSpeed() {
         return speed;
     }

     public Vehicle(String name1, String color, int speed) {
         this.name1 = name1;
         this.color = color;
         this.speed = speed;
     }
 }
