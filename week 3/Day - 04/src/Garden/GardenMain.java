package Garden;

public class GardenMain {
    public static void main(String[] args) {
        Garden garden = new Garden();

        Flowers yellow = new Flowers("yellow",0,true, 0.75);
        garden.addPlant(yellow);
        Flowers blue = new Flowers("blue",0,true, 0.75);
        garden.addPlant(blue);
        Tree purple = new Tree("purple",0,true, 0.40);
        garden.addPlant(purple);
        Tree orange = new Tree("orange",0,true, 0.40);
        garden.addPlant(orange);

        garden.info();
        System.out.println();
        garden.watering(10);
        garden.info();
        System.out.println();
        garden.watering(100);
        garden.info();

    }
}
