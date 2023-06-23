package JavaOopHw6;

public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        DataInput dataInput = new DataInput();
        SavingData savingData = new SavingData();
        dataInput.inputFromConsole(order);
        savingData.saveToJson(order);
    }

}
