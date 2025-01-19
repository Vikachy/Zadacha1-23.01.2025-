public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("имя: " + name);
        System.out.println("возраст: " + age);
        System.out.println("пол: " + gender);
    }

    public void increaseAge() {
        age++;
    }

    public void changeName(String newName) {
        name = newName;
    }
}