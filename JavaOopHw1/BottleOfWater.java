package JavaOopHw1;

public class BottleOfWater extends Product  {
    
    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume, int calories) {
        super(brand, name, price, calories);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка] %s - %s - %f [объем: %f]", brand, name, price, volume);
    }
}
