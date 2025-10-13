import java.util.Scanner;

public class MenuAndValidator {

    private static final Scanner scanner = new Scanner(System.in);

    // Способ ввода
    public int menu() {
        while (true) {
            System.out.println("\nЗдравствуйте, это Лабораторная работа №4!");
            System.out.println("Выберите способ ввода данных:");
            System.out.println("1. Ручной ввод");
            System.out.println("2. Автоматический ввод (готовые данные)");
            System.out.println("0. Выход");

            System.out.print("Ваш выбор: ");

            if (scanner.hasNextInt()) {
                int inputMethod = scanner.nextInt();
                scanner.nextLine();

                switch (inputMethod) {
                    case 1:
                        return manualInputMenu(scanner);
                    case 2:
                        return autoInputMenu(scanner);
                    case 0:
                        System.out.println("Выход из программы...");
                        System.exit(0);
                    default:
                        System.out.println("Неверный выбор способа ввода!");
                        break;
                }
            } else {
                scanner.next(); // очистка некорректного ввода
                System.out.println("Неверно! Введите число от 0 до 3");
            }
        }
    }

    // Ручной ввод
    private int manualInputMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n=== РУЧНОЙ ВВОД ===");
            System.out.println("Выберите задание (вы будете вводить данные):");
            System.out.println("1. Категория №1 - Задача 1");
            System.out.println("0. Назад к выбору способа ввода");
            System.out.print("Ваш выбор задания: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        break;
                    case 0:
                        return menu();
                    default:
                        System.out.println("Неверный номер задания!");
                        break;
                }
            } else {
                scanner.next();
                System.out.println("Неверно! Введите число от 0 до 6");
            }
        }
    }

    // Автоматический ввод
    private int autoInputMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n=== АВТОМАТИЧЕСКИЙ ВВОД ===");
            System.out.println("Выберите задание (будут использованы готовые данные):");
            System.out.println("1. Категория №1 - Задача 1");
            System.out.println("0. Назад к выбору способа ввода");
            System.out.print("Ваш выбор задания: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        autoInput1();
                        break;
                    case 0:
                        return menu();
                    default:
                        System.out.println("Неверный номер задания!");
                        break;
                }
            } else {
                scanner.next();
                System.out.println("Неверно! Введите число от 0 до 6");
            }
        }
    }

    // Методы для автоматического ввода
    private void autoInput1() {
        System.out.println("Обобщенная коробка.\n" +
                "Создайте сущность Коробка, которая обладает следующими характеристиками:\n" +
                "\uF0B7 Может хранить один произвольный объект в один момент времени.\n" +
                "\uF0B7 Объект можно получить и разместить на хранение в любой момент времени.\n" +
                "\uF0B7 Если объект забирают из коробки – ссылку на этот объект необходимо обнулить.\n" +
                "\uF0B7 Если объект кладут в коробку, но она не пуста – необходимо выкинуть исключение.\n" +
                "\uF0B7 Имеет метод проверки на заполненность.\n" +
                "\uF0B7 Методы класса должны работать с тем типом данных, который был указан во время\n" +
                "создания объекта\n" +
                "Создайте Коробку которая может хранить целочисленное значение, разместите туда число 3.\n" +
                "Передайте Коробку в какой-либо метод, извлеките значение, и выведите его на экран.");
        Box<Integer> box1 = new Box<>();
        box1.putBox(3);

        Integer box = box1.takeItem();
        System.out.println("Ответ: " + box);
    }



}
