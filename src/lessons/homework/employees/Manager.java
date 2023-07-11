package lessons.homework.employees;

public class Manager extends Employee{
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary() / 12;
    }
}
