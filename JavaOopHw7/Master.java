
import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;
    private double minSalary;
    private String myVacancy;

    public Master(String name, String myVacancy) {
        this.name = name;
        this.myVacancy = myVacancy;
        minSalary = random.nextDouble(80000, 100000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, String vacancy) {
        if (myVacancy.equals(vacancy)) {
            if (minSalary <= salary) {
                System.out.printf("Мастер %s (%f) >>> Мне нужна эта работа! (%s - %f)\n",
                        name, minSalary, nameCompany, salary);
                minSalary = salary;
            } else {
                System.out.printf("Мастер %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                        name, minSalary, nameCompany, salary);
            }
        } else{
            System.out.println("Меня не интересует эта должность");
        }
    }

}
