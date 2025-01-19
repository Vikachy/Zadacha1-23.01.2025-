import java.util.ArrayList;
import java.util.List;

public class Manager extends Worker {
    List<Worker> subordinates;

    public Manager(String name, int age, String gender, double salary) {
        super(name, age, gender, salary);
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Worker worker) {
        subordinates.add(worker);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Подчиненные:");
        for (Worker worker : subordinates) {
            worker.displayInfo();
        }
    }
}