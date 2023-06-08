package JavaOopHw2;

public class Plate {
    private int food; // количество порций в тарелке

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food >= 0) {
            this.food = food;
        } else {
            this.food = 0;
        }
    }

    public void addFood(int number) {
        this.food = food + number;
        System.out.printf("В тарелке не хватает еды, добавим %d\n", number);
    }
}
