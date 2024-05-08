package model;

public class Employee {
    private final String name;
    private final String job;
    private final double salary;

    public Employee(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateSalary() {
        return salary * 1.1;
    }

    public double updateSalary(double salary) {
        return salary * 1.1;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
