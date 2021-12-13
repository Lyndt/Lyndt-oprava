package Garden;

//public class Plant {
//    private boolean needWater;
//    private double curentWaterAmount;
//    private int needOfWater;
//    private String color;
//
//    public Plant(String color, int needOfWater) {
//        this.color = color;
//        this.curentWaterAmount = 0;
//        this.needOfWater = needOfWater;
//
//    }
//
//    public String getColor() {
//        return this.color;
//    }
//
//    public double getCurentWaterAmount() {
//        return this.curentWaterAmount;
//    }
//
//    public void waterPlant(int waterAmount) {
//        curentWaterAmount += waterAmount;
//    }
//
//    public int getNeedOfWater() {
//        return needOfWater;
//    }
//
//    public void setNeedOfWater(int needOfWater) {
//        this.needOfWater = needOfWater;
//    }
//
//    public void waterAmount(int i) {
//    }
//
//    public void setCurentWaterAmount(double waterAmount) {
//        curentWaterAmount += waterAmount;
//    }
//}
public class Plant {
    private String color;
    private double waterAmount;
    private boolean needsWater;
    private double percent;


    public void watering(double water){
        System.out.println("Watering with " + water);
        waterAmount += water;
    }

    public Plant(String color, double waterAmount, boolean needsWater, double percent) {
        this.color = color;
        this.waterAmount = waterAmount;
        this.needsWater = needsWater;
        this.percent = percent;
    }

    public Plant() {
        this.waterAmount = 0;
        this.needsWater = true;
        this.percent = 0.10;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNeedsWater() {
        return needsWater;
    }

    public void setNeedsWater(boolean needsWater) {
        this.needsWater = needsWater;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}