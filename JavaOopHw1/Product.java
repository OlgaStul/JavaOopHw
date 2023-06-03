package JavaOopHw1;

public class Product {
    protected String name; // Наименование
    protected String brand; // Бренд
    protected double price; // Цена
    protected int calories; // ккал

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    public Product()
    {
        this("product", 100);
    }

    public Product(String inputName, double inputPrice)
    {
        this("noname", inputName, inputPrice, 100);
    }

    public Product(String brand, String name, double price, int calories)
    {
        if (brand == null || brand.length() < 4){
            this.brand = "noname";
        }
        else {

            this.brand = brand;
        }
        if (name == null || name.length() < 4){
            this.name = "product";
        }
        else {
            this.name = name;
        }
        checkPrice(price);
        checkcalories(calories);
    }

    private void checkPrice(double price){
        if (price <= 0){
            this.price = 100;
        }
        else {
            this.price = price;
        }
    }

    private void checkcalories(int calories){
        if (calories <= 0){
            this.calories = 100;
        }
        else {
            this.calories = calories;
        }
    }


    public String displayInfo(){
        return String.format("%s - %s - %f - %d", brand, name, price, calories);
    }


}
