package JavaOopHw2;

public class Cat {
    private String name; // кличка
    private int appetite; // аппетит
    private boolean satiety; // сытость

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int eat() {
        return appetite = 0;
    }

    public boolean satiety(int appetite) {
        if (appetite == 0) {
            System.out.printf("%s поел\n", name);
            return true;
        } else {
            System.out.printf("%s не поел, ему не хватило %d\n", name, appetite);
            return false;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
