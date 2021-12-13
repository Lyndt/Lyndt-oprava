package Garden;

class Trees extends Plant{
    public Trees(String color) {
        super(color, 10);
    }

    @Override
    public void waterPlant(double water) {
        setCurentWaterAmount(water * .4);
    }
}