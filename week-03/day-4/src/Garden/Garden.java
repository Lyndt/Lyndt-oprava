package Garden;

import java.util.ArrayList;

//public class Garden {
//    protected ArrayList<Plant> plants = new ArrayList<>();
//    private int plantsNeedWater = 0;
//
//    public void waterGarden(int water) {
//        System.out.println("Using " + water + " water..");
//        for (Plant plant : plants) {
//            if (plant.getWaterAmount() < plant.getNeedsOfWater()) {
//                plant.waterAmount(water / plantsNeedWater);
//            }
//        }
//    }
//    public void checkWater() {
//        plantsNeedWater = 0;
//        for (Plant plant : plants) {
//            if (plant.getCurentWaterAmount() < plant.getNeedOfWater()) {
//                System.out.println(plant.getColor() + plant.getClass() + " needs water!");
//            } else  {
//                System.out.println(plant.getColor() + plant.getClass() + " does not need water!");
//            }
//        }
//    }
//    public void addPlant(Plant plant) {
//        plants.add(plant);
//    }
//
//}
public class Garden {
    private ArrayList<Plant> plants = new ArrayList<>();


    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void watering(double water) {
        for (Plant plant : plants) {
            if (plant.isNeedsWater()) {
                if (plant.getClass().getSimpleName().equals("Flower")) {
                    if (plant.getWaterAmount() < 5) {
                        plant.setWaterAmount(water * plant.getPercent());
                        plant.setNeedsWater(false);
                    }
                } else {
                    if (plant.getWaterAmount() < 10) {
                        plant.setWaterAmount(water * plant.getPercent());
                        plant.setNeedsWater(false);
                    }
                }
            }
        }
    }

    public void info(){
        for (Plant plant : plants) {
            if (!plant.isNeedsWater()) {
                System.out.println("The " + plant.getColor() + " " + plant.getClass().getSimpleName() + " doesn't need water");
            } else {
                System.out.println("The " + plant.getColor() + " " + plant.getClass().getSimpleName() + " needs water");
            }
        }
    }
}