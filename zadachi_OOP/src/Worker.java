import java.util.ArrayList;
import java.util.List;

public class Worker extends Person {
    double salary;

    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Зарплата: " + salary);
    }
}
