package Garden;

//public class Tree extends Plant {
//    public Tree(String color) {
//        super(color, 10);
//    }
//
//    @Override
//    public void waterPlant(int water) {
//        setCurentWaterAmount(water * .4);
//    }
//}
public class Tree extends Plant{
    public Tree(String color, double waterAmount, boolean needsWater, double percent) {
        super(color, waterAmount, needsWater, percent);
    }
}