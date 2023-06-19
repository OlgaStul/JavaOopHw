package JavaOopHw4;

public class Orange implements Fruit {

    private final double weigth;
    private final String name;

    public Orange() {
        this.weigth = 1.5;
        this.name = "orange";
    }

    public double getWeigth() {
        return weigth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "weigth: " + weigth +
                " fruit: " + name;
    }
}
