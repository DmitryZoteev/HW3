package ch9.workers;

public abstract class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double weeklyPay(int hoursWorked);
}
