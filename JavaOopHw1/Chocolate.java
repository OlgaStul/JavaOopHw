package JavaOopHw1;

public class Chocolate extends Product  {
    private String cocoaBeanContent; // содержание какао-бобов

    public Chocolate(String brand, String name, double price, int calories, String cocoaBeanContent) {
        super(brand, name, price, calories);
        this.cocoaBeanContent = cocoaBeanContent;
    }

    public String getCocoaBeanContent() {
        return cocoaBeanContent;
    }

    public void setCocoaBeanContent(String cocoaBeanContent) {
        this.cocoaBeanContent = cocoaBeanContent;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка] %s - %s - %f - %s", brand, name, price, cocoaBeanContent);
    }
}
