package JavaOopHw4;

import java.util.ArrayList;

// import ru.geekbrains.lesson4.homework.Fruit;

public class Box<F extends Fruit> {

    private final F fruit;
    private ArrayList<F> fruits;
    
    public Box(F fruit) {
        this.fruit = fruit;
        this.fruits = new ArrayList<F>();
    }

    public F getFruit() {
        return fruit;
    }

    public ArrayList<F> getFruits() {
        return fruits;
    }

    public ArrayList<F> addFruitToBox(int quantityFruit) {
        for (int i = 0; i < Math.abs(quantityFruit); i++) {
            fruits.add(fruit);
        }
        return fruits;
    }


    public ArrayList<F> removeFruitInBox (int quantityFruit) {
        if (getQuantityFruitInBox() >= quantityFruit) {
            for (int i = 0; i < Math.abs(quantityFruit); i++) {
                fruits.remove(0);
            }
            return fruits;
        } else {
            System.out.println("operation is not possible");
            return fruits;
        }
    }

    public float getQuantityFruitInBox() {
        return fruits.size();
    }


    public double getBoxWeight() {
        return fruits.size() * fruit.getWeigth();
    }

    public boolean compare(Box o) {
        if (getBoxWeight() == o.getBoxWeight()) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Box [fruit=" + fruit + ", fruits=" + fruits + "]";
    }

    
}




   
