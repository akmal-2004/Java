package lessons.employees;

public class Salesperson extends Employee {
    public Salesperson(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary() + (getSalary() * 0.1);
    }
}
