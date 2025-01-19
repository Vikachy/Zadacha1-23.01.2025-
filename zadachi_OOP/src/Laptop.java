public class Laptop extends Device {
    public Laptop(String brand) {
        super(brand);
    }

    public void openApp(){
        System.out.println("Ноутбук " + brand + " открытое приложение.");
    }
}