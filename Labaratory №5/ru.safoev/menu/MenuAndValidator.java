package ru.safoev.menu;

import ru.safoev.file.FileRead;
import ru.safoev.fractions.Fraction;
import ru.safoev.list.RemoveList;
import ru.safoev.map.PeopleMap;
import ru.safoev.queue.QueueReverse;

import java.io.IOException;
import java.util.*;

public class MenuAndValidator {

  private static final Scanner scanner = new Scanner(System.in);

  // Способ ввода
  public int menu() {
    while (true) {
      System.out.println("\nЗдравствуйте, это Лабораторная работа №5!");
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
        System.out.println("Неверно! Введите число от 0 до 2");
      }
    }
  }

  // Ручной ввод
  private int manualInputMenu(Scanner scanner) {
    while (true) {
      System.out.println("\n=== РУЧНОЙ ВВОД ===");
      System.out.println("Выберите задание (вы будете вводить данные):");
      System.out.println("1. Дроби с кэшированием");
      System.out.println("2. Коты и мяуканье");
      System.out.println("3. Удаление элементов из списка");
      System.out.println("4. Генерация логинов учеников");
      System.out.println("5. Анализ файла - звонкие согласные");
      System.out.println("6. Реверс очереди");
      System.out.println("0. Назад к выбору способа ввода");
      System.out.print("Ваш выбор задания: ");

      if (scanner.hasNextInt()) {
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
          case 1:
            manualInput1();
            break;
          case 2:
            manualInput2();
            break;
          case 3:
            manualInput3();
            break;
          case 4:
            manualInput4();
            break;
          case 5:
            manualInput5();
            break;
          case 6:
            manualInput6();
            break;
          case 7:
            manualInput7();
            break;
          case 0:
            return menu();
          default:
            System.out.println("Неверный номер задания!");
            break;
        }
      } else {
        scanner.next();
        System.out.println("Неверно! Введите число от 0 до 7");
      }
    }
  }

  // Автоматический ввод
  private int autoInputMenu(Scanner scanner) {
    while (true) {
      System.out.println("\n=== АВТОМАТИЧЕСКИЙ ВВОД ===");
      System.out.println("Выберите задание (будут использованы готовые данные):");
      System.out.println("1. Дроби с кэшированием");
      System.out.println("2. Удаление элементов из списка");
      System.out.println("3. Коты и мяуканье");
      System.out.println("4. Генерация логинов учеников");
      System.out.println("5. Анализ файла - звонкие согласные");
      System.out.println("6. Реверс очереди");
      System.out.println("0. Назад к выбору способа ввода");
      System.out.print("Ваш выбор задания: ");

      if (scanner.hasNextInt()) {
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
          case 1:
            autoInput1();
            break;
          case 2:
            autoInput2();
            break;
          case 3:
            autoInput3();
            break;
          case 4:
            autoInput4();
            break;
          case 5:
            autoInput5();
            break;
          case 6:
            autoInput6();
            break;
          case 7:
            autoInput7();
            break;
          case 0:
            return menu();
          default:
            System.out.println("Неверный номер задания!");
            break;
        }
      } else {
        scanner.next();
        System.out.println("Неверно! Введите число от 0 до 7");
      }
    }
  }

  // Методы для ручного ввода
  private void manualInput1() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("=== Ручной ввод данных для класса Fraction ===");

    try {
      // Создание первой дроби
      System.out.println("\n--- Создание первой дроби ---");
      System.out.print("Введите числитель для дроби 1: ");
      int num1 = scanner.nextInt();
      System.out.print("Введите знаменатель для дроби 1: ");
      int den1 = scanner.nextInt();

      Fraction fraction1 = new Fraction(num1, den1);
      System.out.println("Создана дробь: " + fraction1);
      System.out.println("Вещественное значение: " + fraction1.getFloat());

      // Создание второй дроби
      System.out.println("\n--- Создание второй дроби ---");
      System.out.print("Введите числитель для дроби 2: ");
      int num2 = scanner.nextInt();
      System.out.print("Введите знаменатель для дроби 2: ");
      int den2 = scanner.nextInt();

      Fraction fraction2 = new Fraction(num2, den2);
      System.out.println("Создана дробь: " + fraction2);
      System.out.println("Вещественное значение: " + fraction2.getFloat());

      // Демонстрация кэширования
      System.out.println("\n--- Демонстрация кэширования ---");
      System.out.println("Первое получение вещественного значения дроби 1: " + fraction1.getFloat());
      System.out.println("Второе получение вещественного значения дроби 1: " + fraction1.getFloat() + " (из кэша)");

      // Изменение числителя
      System.out.println("\n--- Изменение числителя дроби 1 ---");
      System.out.print("Введите новый числитель для дроби 1: ");
      int newNum1 = scanner.nextInt();
      fraction1.setNumerator(newNum1);
      System.out.println("Дробь после изменения: " + fraction1);
      System.out.println("Вещественное значение после изменения: " + fraction1.getFloat() + " (кэш сброшен)");

      // Изменение знаменателя
      System.out.println("\n--- Изменение знаменателя дроби 2 ---");
      System.out.print("Введите новый знаменатель для дроби 2: ");
      int newDen2 = scanner.nextInt();
      fraction2.setDenominator(newDen2);
      System.out.println("Дробь после изменения: " + fraction2);
      System.out.println("Вещественное значение после изменения: " + fraction2.getFloat() + " (кэш сброшен)");

      // Сравнение дробей
      System.out.println("\n--- Сравнение дробей ---");
      System.out.println("Дробь 1: " + fraction1);
      System.out.println("Дробь 2: " + fraction2);
      System.out.println("Дроби равны? " + fraction1.equals(fraction2));

      // Создание дроби для сравнения
      System.out.println("\n--- Проверка равенства ---");
      System.out.print("Введите числитель для сравнения: ");
      int compNum = scanner.nextInt();
      System.out.print("Введите знаменатель для сравнения: ");
      int compDen = scanner.nextInt();

      Fraction fractionComp = new Fraction(compNum, compDen);
      System.out.println("Создана дробь для сравнения: " + fractionComp);
      System.out.println("Дробь 1 равна дроби для сравнения? " + fraction1.equals(fractionComp));
      System.out.println("Дробь 2 равна дроби для сравнения? " + fraction2.equals(fractionComp));

      // Тестирование отрицательных значений
      System.out.println("\n--- Тестирование отрицательных значений ---");
      System.out.print("Введите отрицательный числитель: ");
      int negNum = scanner.nextInt();
      System.out.print("Введите отрицательный знаменатель: ");
      int negDen = scanner.nextInt();

      Fraction negativeFraction = new Fraction(negNum, negDen);
      System.out.println("Обработанная дробь: " + negativeFraction);
      System.out.println("Вещественное значение: " + negativeFraction.getFloat());

      // Демонстрация обработки исключений
      System.out.println("\n--- Проверка обработки исключений ---");
      try {
        System.out.print("Введите знаменатель равный 0: ");
        int zeroDen = scanner.nextInt();
        Fraction invalidFraction = new Fraction(1, zeroDen);
      } catch (IllegalArgumentException e) {
        System.out.println("Поймано исключение: " + e.getMessage());
      }

      System.out.println("\n=== Ручной ввод завершен ===");

    } catch (Exception e) {
      System.out.println("Произошла ошибка: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }

  private void manualInput2() {
    // Дошпилить
  }

  private void manualInput3() {
    Scanner scanner = new Scanner(System.in);
    RemoveList<String> removeList = new RemoveList<>();

    System.out.print("Сколько элементов в список L? ");
    int countL = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < countL; i++) {
      System.out.print("L элемент " + (i + 1) + ": ");
      removeList.addListL(scanner.nextLine());
    }

    System.out.print("Сколько элементов в список E? ");
    int countE = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < countE; i++) {
      System.out.print("E элемент " + (i + 1) + ": ");
      removeList.addLisE(scanner.nextLine());
    }

    System.out.println("\nИсходные данные:");
    System.out.println("L: " + removeList.getListL());
    System.out.println("E: " + removeList.getListE());

    List<String> result = removeList.mainMethodList();
    System.out.println("\nРезультат: " + result);

    scanner.close();
  }

  private void manualInput4() {
    Scanner scanner = new Scanner(System.in);
    PeopleMap peopleMap = new PeopleMap();

    System.out.print("Введите количество учеников: ");
    int N = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < N; i++) {
      System.out.print("Ученик " + (i + 1) + " (Фамилия Имя): ");
      String line = scanner.nextLine();
      String[] parts = line.split(" ");

      if (parts.length >= 2) {
        peopleMap.addPerson(parts[0], parts[1]);
      }
    }

    System.out.println("\nСгенерированные логины:");
    peopleMap.printAllLogins();
    scanner.close();
  }

  private void manualInput5() {
    Scanner scanner = new Scanner(System.in);
    FileRead fileRead = new FileRead();

    System.out.print("Введите название файла: ");
    String filename = scanner.nextLine();

    try {
      Set<Character> result = fileRead.analyzeFile(filename);
      fileRead.printResult(result);
    } catch (IOException e) {
      System.out.println("Ошибка чтения файла: " + e.getMessage());
    }

    scanner.close();
  }


  private void manualInput6() {
    Scanner scanner = new Scanner(System.in);
    QueueReverse<String> queueReverse = new QueueReverse<>();

    System.out.print("Сколько элементов добавить в очередь L1? ");
    int count = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < count; i++) {
      System.out.print("Элемент " + (i + 1) + ": ");
      queueReverse.addL1(scanner.nextLine());
    }

    System.out.println("Исходная очередь L1: " + queueReverse.getL1());
    queueReverse.reverseQueueMethod();
    System.out.println("Результат в L2: " + queueReverse.getL2());

    scanner.close();
  }

  private void manualInput7() {
    // Дошпилить
  }


  // Методы для автоматического ввода
  private void autoInput1() {
    System.out.println("В класс Дробь, добавить интерфейс на два метода: получение вещественного значения, установка\n" +
            "числителя и установка знаменателя.\n" +
            "Сгенерировать такую версию дроби, которая будет кэшировать вычисление вещественного\n" +
            "значения.\n" +
            "Если раннее в вашем варианте не было Дроби, то создайте сущность Дробь со следующими\n" +
            "особенностями:\n" +
            "• Имеет числитель: целое число\n" +
            "• Имеет знаменатель: целое число\n" +
            "• Дробь может быть создана с указанием числителя и знаменателя\n" +
            "• Может вернуть строковое представление вида “числитель/знаменатель”\n" +
            "• Необходимо корректно обрабатывать отрицательные значения. Учтите, что знаменатель не может\n" +
            "быть отрицательным.\n" +
            "• Переопределите метод сравнения объектов по состоянию таким образом, чтобы две дроби\n" +
            "считались одинаковыми тогда, когда у них одинаковые значения числителя и знаменателя.");

    // 1. Создание обычных дробей
    Fraction frac1 = new Fraction(1, 2);
    Fraction frac2 = new Fraction(3, 4);
    System.out.println("1. Обычные дроби:");
    System.out.println("   Дробь 1: " + frac1 + " = " + frac1.getFloat());
    System.out.println("   Дробь 2: " + frac2 + " = " + frac2.getFloat());

    // 2. Обработка отрицательных значений
    Fraction frac3 = new Fraction(-2, 3);
    Fraction frac4 = new Fraction(2, -3);
    Fraction frac5 = new Fraction(-2, -3);
    System.out.println("\n2. Обработка отрицательных значений:");
    System.out.println("   Дробь -2/3: " + frac3 + " = " + frac3.getFloat());
    System.out.println("   Дробь 2/-3: " + frac4 + " = " + frac4.getFloat());
    System.out.println("   Дробь -2/-3: " + frac5 + " = " + frac5.getFloat());

    // 3. Демонстрация кэширования вещественного значения
    System.out.println("\n3. Демонстрация кэширования:");
    Fraction frac6 = new Fraction(5, 8);
    System.out.println("   Первый вызов getFloat(): " + frac6.getFloat());
    System.out.println("   Второй вызов getFloat(): " + frac6.getFloat() + " (значение из кэша)");

    // 4. Изменение числителя и сброс кэша
    System.out.println("\n4. Изменение числителя:");
    System.out.println("   Исходная дробь: " + frac6 + " = " + frac6.getFloat());
    frac6.setNumerator(7);
    System.out.println("   После setNumerator(7): " + frac6 + " = " + frac6.getFloat() + " (кэш сброшен)");

    // 5. Изменение знаменателя и сброс кэша
    System.out.println("\n5. Изменение знаменателя:");
    Fraction frac7 = new Fraction(3, 5);
    System.out.println("   Исходная дробь: " + frac7 + " = " + frac7.getFloat());
    frac7.setDenominator(10);
    System.out.println("   После setDenominator(10): " + frac7 + " = " + frac7.getFloat() + " (кэш сброшен)");

    // 6. Сравнение дробей
    System.out.println("\n6. Сравнение дробей:");
    Fraction frac8 = new Fraction(2, 4);
    Fraction frac9 = new Fraction(1, 2);
    Fraction frac10 = new Fraction(2, 4);
    System.out.println("   Дробь 2/4: " + frac8);
    System.out.println("   Дробь 1/2: " + frac9);
    System.out.println("   Дробь 2/4: " + frac10);
    System.out.println("   2/4 equals 1/2: " + frac8.equals(frac9));
    System.out.println("   2/4 equals 2/4: " + frac8.equals(frac10));

  }

  private void autoInput2() {
    // Дошпилить
  }

  private void autoInput3() {
    System.out.println("Составить программу, которая удаляет из списка L все элементы E, если такие есть.");

    // 1. Демонстрация с целыми числами
    System.out.println("\n1. Работа с целыми числами:");
    RemoveList<Integer> removeList1 = new RemoveList<>();

    // Заполняем список L
    removeList1.addListL(1);
    removeList1.addListL(2);
    removeList1.addListL(3);
    removeList1.addListL(2);
    removeList1.addListL(4);
    removeList1.addListL(2);
    removeList1.addListL(5);

    // Заполняем список E (элементы для удаления)
    removeList1.addLisE(2);

    System.out.println("   Исходный список L: " + removeList1.getListL());
    System.out.println("   Элементы для удаления E: " + removeList1.getListE());

    List<Integer> result1 = removeList1.mainMethodList();
    System.out.println("   Результат после удаления: " + result1);

    // 2. Демонстрация с строками
    System.out.println("\n2. Работа со строками:");
    RemoveList<String> removeList2 = new RemoveList<>();

    removeList2.addListL("apple");
    removeList2.addListL("banana");
    removeList2.addListL("orange");
    removeList2.addListL("apple");
    removeList2.addListL("grape");
    removeList2.addListL("apple");

    removeList2.addLisE("apple");
    removeList2.addLisE("orange");

    System.out.println("   Исходный список L: " + removeList2.getListL());
    System.out.println("   Элементы для удаления E: " + removeList2.getListE());

    List<String> result2 = removeList2.mainMethodList();
    System.out.println("   Результат после удаления: " + result2);
  }

  private void autoInput4() {
    System.out.println("На вход программы подаются фамилии и имена учеников. Известно, что общее количество\n" +
            "учеников не превосходит 100. В первой строке вводится количество учеников, принимавших\n" +
            "участие в соревнованиях, N. Далее следуют N строк, имеющих следующий формат:\n" +
            "<Фамилия><Имя>\n" +
            "Здесь <Фамилия> – строка, состоящая не более чем из 20 символов; <Имя>– строка, состоящая не\n" +
            "более чем из 15 символов. При этом <Фамилия> и <Имя> разделены одним пробелом. Примеры\n" +
            "входных строк:\n" +
            "Иванова Мария\n" +
            "Петров Сергей\n" +
            "Требуется написать программу, которая формирует и печатает уникальный логин для каждого\n" +
            "ученика по следующему правилу: если фамилия встречается первый раз, то логин – это данная\n" +
            "фамилия, если фамилия встречается второй раз, то логин – это фамилия, в конец которой\n" +
            "приписывается число 2 и т.д. Например, для входной последовательности:\n" +
            "Иванова Мария\n" +
            "Петров Сергей\n" +
            "Бойцова Екатерина\n" +
            "Петров Иван\n" +
            "Иванова Наташа\n" +
            "будут сформированы следующие логины:\n" +
            "Иванова\n" +
            "Петров\n" +
            "Бойцова\n" +
            "Петров2\n" +
            "Иванова2\n");


    PeopleMap peopleMap1 = new PeopleMap();

    peopleMap1.addPerson("Иванова", "Мария");
    peopleMap1.addPerson("Петров", "Сергей");
    peopleMap1.addPerson("Бойцова", "Екатерина");
    peopleMap1.addPerson("Петров", "Иван");
    peopleMap1.addPerson("Иванова", "Наташа");

    System.out.println("Входные данные:");
    System.out.println("Иванова Мария");
    System.out.println("Петров Сергей");
    System.out.println("Бойцова Екатерина");
    System.out.println("Петров Иван");
    System.out.println("Иванова Наташа");

    System.out.println("\nСгенерированные логины:");
    peopleMap1.printAllLogins();
  }

  private void autoInput5() {
    System.out.println("Файл содержит текст на русском языке. Напечатать в алфавитном порядке все звонкие\n" +
            "согласные буквы, которые входят хотя бы в одно слово.\n");
    FileRead analyzer = new FileRead();

    try {
      Set<Character> result = analyzer.analyzeFile("test.txt");

      analyzer.printResult(result);

    } catch (Exception e) {
      System.out.println("Ошибка: " + e.getMessage());
    }
  }

  private void autoInput6() {
    System.out.println("Переписать элементы из очереди L1 в очередь L2 в обратном порядке.");
    QueueReverse<Integer> queueReverse = new QueueReverse<>();
    queueReverse.addL1(1);
    queueReverse.addL1(2);
    queueReverse.addL1(3);
    queueReverse.addL1(4);
    queueReverse.reverseQueueMethod();
  }

  private void autoInput7() {
   // Дошпилить
  }
}
