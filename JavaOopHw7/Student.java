
import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();

    private String name;
    private double minSalary;
    private String myVacancy;

    public Student(String name, String myVacancy) {
        this.name = name;
        this.myVacancy = myVacancy;
        minSalary = random.nextDouble(2000, 3000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, String myVacancy) {

        if (minSalary <= salary) {
            System.out.printf("Студент %s (%f) >>> Мне нужна эта работа! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
            minSalary = salary;
        } else {
            System.out.printf("Студент %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
        }

    }
}
