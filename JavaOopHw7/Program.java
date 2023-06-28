

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        // Student student1 = new Student("A");
        // Object student2 = new Student("B");
        // Observer student3 = new Student("C");


        Company geekBrains = new Company("GeekBrains", 70000, jobAgency, "Программист");
        Company google = new Company("Google", 100000, jobAgency, "Уборщица");
        Company yandex = new Company("Yandex", 120000, jobAgency, "Тестировщик");

        Master ivanov = new Master("Ivanov", "Программист");
        Master petrov = new Master("Petrov", "Программист");
        Student sidorov = new Student("Sidorov", "Любая");
        Middle kurochkin = new Middle("Kurochkin", "Тестировщик");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(kurochkin);

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }

}
