package JavaOopHw3;

import java.util.Arrays;
import java.util.Random;


public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salaryEmployee = random.nextInt(20000, 80000);
        int salaryFreelancer = salaryEmployee/2;  // работает 4 часа в день
        int age = random.nextInt(25, 50);
        int employee = random.nextInt(2);
        if (employee==1){
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salaryEmployee, age);
        }
        else{
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salaryFreelancer, age);
        }
        
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[20];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }
        
        Arrays.sort(employees, new SurnamesAgeComparator()); // new SalaryComparator()

        // Arrays.sort(employees);


        for(Employee employee : employees){
            System.out.println(employee);
        }

    }

}
