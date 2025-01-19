public class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("собака бежит.");
    }

    @Override
    public void makeSound() {
        System.out.println("аф!");
    }
}