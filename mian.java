import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MyVector vector = new MyVector();

        int choice = 0;

        while (choice != 6) {

            System.out.println("\n--- VECTOR ---");
            System.out.println("1 - Додати в кінець");
            System.out.println("2 - Додати по індексу");
            System.out.println("3 - Видалити по індексу");
            System.out.println("4 - Отримати елемент");
            System.out.println("5 - Показати вектор");
            System.out.println("6 - Вихід");
            System.out.print(">> ");

            try {

                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1 -> {
                        System.out.print("Число: ");
                        vector.add(Integer.parseInt(scanner.nextLine()));
                    }

                    case 2 -> {
                        System.out.print("Індекс: ");
                        int index = Integer.parseInt(scanner.nextLine());
                        System.out.print("Число: ");
                        int value = Integer.parseInt(scanner.nextLine());
                        vector.add(index, value);
                    }

                    case 3 -> {
                        System.out.print("Індекс: ");
                        vector.remove(Integer.parseInt(scanner.nextLine()));
                    }

                    case 4 -> {
                        System.out.print("Індекс: ");
                        System.out.println("Значення: " + vector.get(Integer.parseInt(scanner.nextLine())));
                    }

                    case 5 -> {
                        System.out.print("Vector: ");
                        vector.print();
                        System.out.println("Size: " + vector.size());
                        System.out.println("Capacity: " + vector.capacity());
                    }

                    case 6 -> System.out.println("Вихід");

                    default -> System.out.println("Неверно");
                }

            } catch (Exception e) {
                System.out.println("Ошибка ввода");
            }
        }
    }
}
