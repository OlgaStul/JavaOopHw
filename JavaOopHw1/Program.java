package JavaOopHw1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.brand = "От Мартина";
        product1.name = "Семечки";
        product1.price = 105;
        product1.calories = 578;
        // System.out.println(product1.displayInfo());

        Product product2 = new Product("Кириешки", "Сухарики", 45, 200);
        // System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater1 =
                new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", 90.15, 1.5, 35);
        // System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk
                = new BottleOfMilk("ООО Чистый Источник", "Бутылка с молоком #1", 87, 1.5, 3, 450);
        // System.out.println(bottleOfMilk.displayInfo());

       Chocolate chocolate1 = new Chocolate("Milka", "Шоколад", 150, 525, "Молочный");
       Chocolate chocolate2 = new Chocolate("Бабаевский", "Шоколад", 200, 550, "Темный");
       Chocolate chocolate3 = new Chocolate("Красный Октябрь", "Шоколад", 135, 539, "Горький");
       Chocolate chocolate4 = new Chocolate("Choco&Nuts", "Шоколад", 450, 585, "Белый");


        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        products.add(chocolate4);

        VendingMachine vendingMachine = new VendingMachine(products);
        
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }


        Chocolate chocolateResult = vendingMachine.getChocolate("Молочный");
        if (chocolateResult != null){
            System.out.println("Вы купили:");
            System.out.println(chocolateResult.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет в автомате.");
        }


        Product productResult = vendingMachine.getProduct(500);
        if (productResult != null){
            System.out.println("Продукты выбранной калорийности:");
            System.out.println(productResult.displayInfo());
        }
        else {
            System.out.println("Такого продукта нет в автомате.");
        }
    }

}
