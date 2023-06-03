package JavaOopHw1;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume) {

        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                if (((BottleOfWater) product).getVolume() == volume) {
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(String cocoaBeanContent) {
        for (Product product : products) {
            if (product instanceof Chocolate) {
                if (((Chocolate) product).getCocoaBeanContent() == cocoaBeanContent) {
                    return (Chocolate) product;
                }
            }
        }
        return null;
    }

    public Product getProduct(int calories) {
        for (Product product : products) {
            if (product.getCalories() <= calories) {
                return product;
            }
        }
        return null;
    }
}
