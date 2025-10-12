package ru.safoev.main;

import ru.safoev.application.MenuAndValidator;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        // 7.3 - Возведение в степень из аргументов командной строки
        if (args.length >= 2) {
            String xStr = args[0];
            String yStr = args[1];
            double result = power(xStr, yStr);
            System.out.printf("Результат возведения " + xStr + " в степень " + yStr + ": " + result);
            System.out.println();
        }

        // 7.2 - Демонстрация метода блока 2.5.8
        PolymorphismDemo.demonstrateShooters();

        // Запуск основного меню приложения
        MenuAndValidator menu = new MenuAndValidator();
        menu.menu();
    }

    // 7.3 - Метод возведения в степень
    public static double power(String xStr, String yStr) {
        int x = parseInt(xStr);
        int y = parseInt(yStr);
        return pow(x, y);
    }
}
