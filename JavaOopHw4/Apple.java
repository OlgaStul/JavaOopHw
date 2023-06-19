package JavaOopHw4;

// import ru.geekbrains.lesson4.homework.Fruit;

public class Apple implements Fruit{

    private final double weigth;
    private final String name;

    public Apple() {
        this.weigth = 1.0;
        this.name = "apple";
    }

    public double getWeigth() {
        return weigth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Apple [weigth=" + weigth + ", name=" + name + "]";
    }
    
}
