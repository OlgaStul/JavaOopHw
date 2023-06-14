package JavaOopHw3;

public abstract class Employee {

    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы
    protected int age;

    public Employee(String name, String surname, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    /**
     * Расчет среднемесячной заработной платы
     * 
     * @return
     */
    public abstract double calculateSalary();

    // При Employee implements Comparable<Employee>
    // @Override
    // public int compareTo(Employee o) {
    //     int res = surname.compareTo(o.surname);
    //     if (res == 0)
    //         return Double.compare(calculateSalary(), o.calculateSalary());
    //     else
    //         return res;
    // }
}