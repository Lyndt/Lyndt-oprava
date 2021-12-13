public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // For example: if the 3 sides are 10, 10, and 10, then you program should
        // produce the following output:
        //
        // Surface Area: 600
        // Volume: 1000

        double site1 = 10;
        double site2 = 10;
        double site3 = 10;
        double surfaceArea = 2*(10*10) + 2*(10*10) + 2*(10*10);
        double volume = site1*site2*site3;
        System.out.println(surfaceArea);
        System.out.println(volume);


    }
}