import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Задание 1: Класс "Человек", "Работник", "Менеджер"
        System.out.println("--- Задание 1: Класс Человек, Работник, Менеджер ---");
        Person person1 = new Person("Алиса", 30, "Женский");
        person1.displayInfo();
        person1.increaseAge();
        person1.changeName("Алисия");
        person1.displayInfo();

        Worker worker1 = new Worker("Боб", 25, "Мужской", 50000);
        worker1.displayInfo();

        Manager manager1 = new Manager("Чарли", 40, "Мужской", 100000);
        manager1.addSubordinate(worker1);
        manager1.displayInfo();

        // Задание 3: Полиморфизм - Животные
        System.out.println("\n--- Задание 3: Полиморфизм - Животные ---");
        Animal[] animals = new Animal[]{new Dog(), new Cat(), new Cow(), new Fish(), new Bird()};

        for (Animal animal : animals) {
            animal.makeSound();
            animal.move();
        }

        // Задание 4: Абстрактный класс - Транспорт
        System.out.println("\n--- Задание 4: Абстрактный класс - Транспорт ---");
        Transport car = new Car();
        Transport bike = new Bike();

        car.move();
        bike.move();

        // Задание 5: Книга и Библиотека
        System.out.println("\n--- Задание 5: Книга и Библиотека ---");
        Library library = new Library();
        library.addBook(new Book("Властелин колец", "Дж.Р.Р. Толкин", 1954));
        library.addBook(new Book("Гордость и предубеждение", "Джейн Остин", 1813));
        library.addBook(new Book("Хоббит", "Дж.Р.Р. Толкин", 1937));
        library.addBook(new Book("Убить пересмешника", "Харпер Ли", 1960));

        System.out.println("Все книги в библиотеке:");
        library.displayAllBooks();

        System.out.println("\nКниги Дж.Р.Р. Толкина:");
        List<Book> tolkienBooks = library.searchByAuthor("Дж.Р.Р. Толкин");
        for (Book book : tolkienBooks) {
            System.out.println(book.toString());
        }

        System.out.println("\nКниги, опубликованные в 1960 году:");
        List<Book> yearBooks = library.searchByYear(1960);
        for(Book book : yearBooks) {
            System.out.println(book.toString());
        }

        // Задание 6: Инкапсуляция - Банковский счет
        System.out.println("\n--- Задание 6: Инкапсуляция - Банковский счет ---");
        BankAccount account = new BankAccount("12345", 1000);
        System.out.println("Номер счета: " + account.getAccountNumber());
        System.out.println("Начальный баланс: " + account.getBalance());

        account.deposit(500);
        System.out.println("Баланс после пополнения: " + account.getBalance());

        account.withdraw(200);
        System.out.println("Баланс после снятия: " + account.getBalance());

        // Задание 7: Счетчик объектов
        System.out.println("\n--- Задание 7: Счетчик объектов ---");
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        System.out.println("Количество созданных объектов Counter: " + Counter.getCount());

        // Задание 8: Площадь фигур
        System.out.println("\n--- Задание 8: Площадь фигур ---");
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());

        // Задание 9: Наследование - Животные и их движения
        System.out.println("\n--- Задание 9: Наследование - Животные и их движения ---");
        Animal fish = new Fish();
        Animal bird = new Bird();
        Animal dog2 = new Dog();

        fish.move();
        bird.move();
        dog2.move();

        // Задание 10: Работа с коллекциями - Университет
        System.out.println("\n--- Задание 10: Работа с коллекциями - Университет ---");
        University university = new University();
        university.addStudent(new Student("Алиса", "A", 4.0));
        university.addStudent(new Student("Боб", "B", 3.5));
        university.addStudent(new Student("Чарли", "A", 3.8));
        university.addStudent(new Student("Дэвид", "C", 4.0));

        System.out.println("Все студенты:");
        university.displayAllStudents();

        university.sortByStudentName();
        System.out.println("Студенты, отсортированные по имени: ");
        university.displayAllStudents();

        System.out.println("Студенты с оценкой >= 3.8:");
        List<Student> filteredStudents = university.filterStudentsByGrade(3.8);
        for (Student student : filteredStudents) {
            System.out.println(student.toString());
        }

        // Задание 11: Магазин
        System.out.println("\n--- Задание 11: Магазин ---");
        Store store = new Store();
        store.addProduct(new Product("Ноутбук", 1200.00, 10));
        store.addProduct(new Product("Мышь", 25.00, 50));
        store.addProduct(new Product("Клавиатура", 75.00, 30));
        store.addProduct(new Product("Монитор", 300.00, 15));

        System.out.println("Все товары в магазине:");
        store.displayAllProducts();
        System.out.println("\nТовары, содержащие 'Ноутбук' в названии:");
        List<Product> products = store.findProduct("Ноутбук");
        for (Product product : products){
            System.out.println(product.toString());
        }
        store.removeProduct("Мышь");
        System.out.println("\nВсе товары в магазине после удаления 'Мышь':");
        store.displayAllProducts();


        // Задание 12: Интерфейс - Платежная система
        System.out.println("\n--- Задание 12: Интерфейс - Платежная система ---");
        PaymentSystem creditCard = new CreditCard("1234-5678-9012-3456");
        PaymentSystem payPal = new PayPal("test@example.com");

        creditCard.pay(100.00);
        payPal.refund(50.00);


        // Задание 13: Генерация уникальных идентификаторов
        System.out.println("\n--- Задание 13: Генерация уникальных идентификаторов ---");
        UniqueID id1 = new UniqueID();
        UniqueID id2 = new UniqueID();
        UniqueID id3 = new UniqueID();

        System.out.println("ID 1: " + id1.getId());
        System.out.println("ID 2: " + id2.getId());
        System.out.println("ID 3: " + id3.getId());

        // Задание 14: Класс Точка и Прямоугольник
        System.out.println("\n--- Задание 14: Класс Точка и Прямоугольник ---");
        Point point1 = new Point(1, 2);
        Point point2 = new Point(5, 7);
        Rectangle1 rectangles = new Rectangle1(point1, point2);
        System.out.println("Площадь прямоугольника: " + rectangles.getArea());

        // Задание 15: Комплексные числа
        System.out.println("\n--- Задание 15: Комплексные числа ---");
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(1, -1);
        System.out.println("Комплексное число 1: " + c1);
        System.out.println("Комплексное число 2: " + c2);

        ComplexNumber sum = c1.add(c2);
        System.out.println("Сумма: " + sum);
        ComplexNumber difference = c1.subtract(c2);
        System.out.println("Разность: " + difference);
        ComplexNumber product = c1.multiply(c2);
        System.out.println("Произведение: " + product);
        ComplexNumber quotient = c1.divide(c2);
        System.out.println("Частное: " + quotient);

        // Задание 16: Матричные операции
        System.out.println("\n--- Задание 16: Матричные операции ---");
        int[][] data1 = {{1, 2}, {3, 4}};
        int[][] data2 = {{5, 6}, {7, 8}};
        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);
        System.out.println("Матрица 1:");
        matrix1.printMatrix();
        System.out.println("Матрица 2:");
        matrix2.printMatrix();


        Matrix sumMatrix = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sumMatrix.printMatrix();
        Matrix productMatrix = matrix1.multiply(matrix2);
        System.out.println("Произведение матриц:");
        productMatrix.printMatrix();

        // Задание 17: Текстовая игра
        System.out.println("\n--- Задание 17: Текстовая игра ---");
        Weapon sword = new Weapon("Меч", 10);
        Player player = new Player("Герой", 100, sword);
        Enemy goblin = new Enemy("Гоблин", 50);
        player.attack(goblin);

        // Задание 18: Система автоматизации заказов
        System.out.println("\n--- Задание 18: Система автоматизации заказов ---");
        Customer customer1 = new Customer("Майк");
        Order order = new Order(customer1);
        order.addProduct(new Product1("Ноутбук", 1200));
        order.addProduct(new Product1("Монитор", 300));
        System.out.println("Заказ для " + order.getCustomer().getName() + ", с товарами " + order.getProducts() + " имеет общую стоимость: " + order.getTotalCost());


        // Задание 19: Электроника
        System.out.println("\n--- Задание 19: Электроника ---");
        Device smartphone = new Smartphone("Samsung");
        Device laptop = new Laptop("Apple");
        smartphone.turnOn();
        ((Smartphone) smartphone).takePhoto();
        laptop.turnOn();
        ((Laptop) laptop).openApp();

        // Задание 20: Крестики-нолики
        System.out.println("\n--- Задание 20: Крестики-нолики ---");
        TicTacToePlayer tttPlayer1 = new TicTacToePlayer("Игрок 1", 'X');
        TicTacToePlayer tttPlayer2 = new TicTacToePlayer("Игрок 2", 'O');
        Game game = new Game(tttPlayer1, tttPlayer2);
        game.startGame();
    }
}