package ru.safoev.menu;

import ru.safoev.box.Box;
import ru.safoev.box.BoxUtils;
import ru.safoev.compare.IntegerValue;
import ru.safoev.function.Filter;
import ru.safoev.function.Functions;
import ru.safoev.function.ListTransform;
import ru.safoev.function.Reduction;

import java.util.*;

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
                System.out.println("Неверно! Введите число от 0 до 2");
            }
        }
    }

    // Ручной ввод
    private int manualInputMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n=== РУЧНОЙ ВВОД ===");
            System.out.println("Выберите задание (вы будете вводить данные):");
            System.out.println("1. Категория №1 - Задача 1 (Обобщенная коробка)");
            System.out.println("2. Категория №1 - Задача 3 (Поиск максимума)");
            System.out.println("3. Категория №2 - Задача 2 (Сравнимое)");
            System.out.println("4. Категория №3 - Задача 1 (Функция)");
            System.out.println("5. Категория №3 - Задача 2 (Фильтр)");
            System.out.println("6. Категория №3 - Задача 3 (Сокращение)");
            System.out.println("7. Категория №3 - Задача 4 (Коллекционирование)");
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
            System.out.println("1. Категория №1 - Задача 1");
            System.out.println("2. Категория №1 - Задача 3");
            System.out.println("3. Категория №2 - Задача 2");
            System.out.println("4. Категория №3 - Задача 1");
            System.out.println("5. Категория №3 - Задача 2");
            System.out.println("6. Категория №3 - Задача 3");
            System.out.println("7. Категория №3 - Задача 4");
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
        System.out.println("\n=== РУЧНОЙ ВВОД: Обобщенная коробка ===");
        System.out.println("Создаем коробку для целых чисел");

        Box<Integer> box = new Box<>();

        // Ввод числа для коробки
        while (true) {
            System.out.print("Введите целое число для помещения в коробку: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();

                try {
                    box.putBox(number);
                    System.out.println("✓ Число " + number + " успешно помещено в коробку");
                    break;
                } catch (IllegalStateException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else {
                scanner.next();
                System.out.println("Неверный ввод! Введите целое число.");
            }
        }

        // Проверка заполненности
        System.out.println("Проверка заполненности коробки: " + (box.isEmpty() ? "полная" : "пустая"));

        // Извлечение значения
        System.out.println("Извлекаем значение из коробки...");
        try {
            Integer value = box.takeItem();
            System.out.println("✓ Извлеченное значение: " + value);
            System.out.println("Проверка после извлечения: " + (box.isEmpty() ? "пустая" : "полная"));
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Демонстрация исключения при попытке положить второй объект
        System.out.print("\nПопробуем положить второе число (должна быть ошибка): ");
        if (scanner.hasNextInt()) {
            int secondNumber = scanner.nextInt();
            scanner.nextLine();
            try {
                box.putBox(secondNumber);
            } catch (IllegalStateException e) {
                System.out.println("✓ Ожидаемая ошибка: " + e.getMessage());
            }
        }
    }

    private void manualInput2() {
        System.out.println("\n=== РУЧНОЙ ВВОД: Поиск максимума ===");
        System.out.println("Создадим несколько коробок с разными числовыми типами");

        List<Box<? extends Number>> boxes = new ArrayList<>();

        System.out.print("Сколько коробок вы хотите создать? (минимум 2): ");
        int count = getPositiveInt(2);

        for (int i = 0; i < count; i++) {
            System.out.println("\nКоробка " + (i + 1) + ":");
            System.out.println("Выберите тип числа:");
            System.out.println("1. Integer (целое)");
            System.out.println("2. Double (дробное)");
            System.out.println("3. Float (дробное)");
            System.out.println("4. Long (целое большое)");

            int typeChoice = getIntInRange(1, 4);

            switch (typeChoice) {
                case 1:
                    System.out.print("Введите целое число: ");
                    int intValue = scanner.nextInt();
                    boxes.add(new Box<>(intValue));
                    break;
                case 2:
                    System.out.print("Введите дробное число: ");
                    double doubleValue = scanner.nextDouble();
                    boxes.add(new Box<>(doubleValue));
                    break;
                case 3:
                    System.out.print("Введите дробное число (float): ");
                    float floatValue = scanner.nextFloat();
                    boxes.add(new Box<>(floatValue));
                    break;
                case 4:
                    System.out.print("Введите большое целое число: ");
                    long longValue = scanner.nextLong();
                    boxes.add(new Box<>(longValue));
                    break;
            }
            scanner.nextLine(); // очистка буфера
        }

        // Поиск максимума
        try {
            double max = BoxUtils.findMaxValue(boxes);
            System.out.println("\n✓ Максимальное значение среди всех коробок: " + max);
        } catch (Exception e) {
            System.out.println("Ошибка при поиске максимума: " + e.getMessage());
        }
    }

    private void manualInput3() {
        System.out.println("\n=== РУЧНОЙ ВВОД: Сравнимое ===");

        System.out.print("Введите первое целое число для сравнения: ");
        int value1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите второе целое число для сравнения: ");
        int value2 = scanner.nextInt();
        scanner.nextLine();

        IntegerValue integerValue1 = new IntegerValue(value1);

        System.out.println("\nСравниваем " + value1 + " с " + value2 + ":");
        integerValue1.compare(value2);
    }

    private void manualInput4() {
        System.out.println("\n=== РУЧНОЙ ВВОД: Функция ===");
        System.out.println("Выберите подзадачу:");
        System.out.println("1. Длины строк");
        System.out.println("2. Абсолютные значения чисел");
        System.out.println("3. Максимумы массивов");

        int subTask = getIntInRange(1, 3);

        switch (subTask) {
            case 1:
                manualInput4_1();
                break;
            case 2:
                manualInput4_2();
                break;
            case 3:
                manualInput4_3();
                break;
        }
    }

    private void manualInput4_1() {
        System.out.println("\n--- Длины строк ---");
        List<String> strings = new ArrayList<>();

        System.out.print("Сколько строк вы хотите ввести? ");
        int count = getPositiveInt(1);

        for (int i = 0; i < count; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings.add(scanner.nextLine());
        }

        List<Integer> lengths = ListTransform.transform(strings, new Functions<String, Integer>() {
            @Override
            public Integer apply(String item) {
                return item.length();
            }
        });

        System.out.println("\nРезультат:");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println("Строка: '" + strings.get(i) + "' -> Длина: " + lengths.get(i));
        }
    }

    private void manualInput4_2() {
        System.out.println("\n--- Абсолютные значения чисел ---");
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Сколько чисел вы хотите ввести? ");
        int count = getPositiveInt(1);

        for (int i = 0; i < count; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        scanner.nextLine();

        List<Integer> absoluteValues = ListTransform.transform(numbers, new Functions<Integer, Integer>() {
            @Override
            public Integer apply(Integer item) {
                return Math.abs(item);
            }
        });

        System.out.println("\nРезультат:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Число: " + numbers.get(i) + " -> Абсолютное: " + absoluteValues.get(i));
        }
    }

    private void manualInput4_3() {
        System.out.println("\n--- Максимумы массивов ---");
        List<int[]> arrays = new ArrayList<>();

        System.out.print("Сколько массивов вы хотите ввести? ");
        int arrayCount = getPositiveInt(1);

        for (int i = 0; i < arrayCount; i++) {
            System.out.print("Введите размер массива " + (i + 1) + ": ");
            int size = getPositiveInt(1);

            int[] array = new int[size];
            System.out.println("Введите " + size + " чисел для массива " + (i + 1) + ":");
            for (int j = 0; j < size; j++) {
                System.out.print("Элемент " + (j + 1) + ": ");
                array[j] = scanner.nextInt();
            }
            scanner.nextLine();
            arrays.add(array);
        }

        List<Integer> maxValues = ListTransform.transform(arrays, new Functions<int[], Integer>() {
            @Override
            public Integer apply(int[] array) {
                int max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                return max;
            }
        });

        System.out.println("\nРезультат:");
        for (int i = 0; i < arrays.size(); i++) {
            System.out.println("Массив " + Arrays.toString(arrays.get(i)) + " -> Максимум: " + maxValues.get(i));
        }
    }

    private void manualInput5() {
        System.out.println("\n=== РУЧНОЙ ВВОД: Фильтр ===");
        System.out.println("Выберите подзадачу:");
        System.out.println("1. Строки длиной >= 3 символов");
        System.out.println("2. Положительные числа");
        System.out.println("3. Массивы без положительных элементов");

        int subTask = getIntInRange(1, 3);

        switch (subTask) {
            case 1:
                manualInput5_1();
                break;
            case 2:
                manualInput5_2();
                break;
            case 3:
                manualInput5_3();
                break;
        }
    }

    private void manualInput5_1() {
        System.out.println("\n--- Строки длиной >= 3 символов ---");
        List<String> strings = new ArrayList<>();

        System.out.print("Сколько строк вы хотите ввести? ");
        int count = getPositiveInt(1);

        for (int i = 0; i < count; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings.add(scanner.nextLine());
        }

        List<String> filtered = ListTransform.test(strings, new Filter<String>() {
            @Override
            public boolean test(String item) {
                return item.length() >= 3;
            }
        });

        System.out.println("\nИсходные строки: " + strings);
        System.out.println("После фильтрации (длина >= 3): " + filtered);
    }

    private void manualInput5_2() {
        System.out.println("\n--- Положительные числа ---");
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Сколько чисел вы хотите ввести? ");
        int count = getPositiveInt(1);

        for (int i = 0; i < count; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        scanner.nextLine();

        List<Integer> filtered = ListTransform.test(numbers, new Filter<Integer>() {
            @Override
            public boolean test(Integer item) {
                return item > 0;
            }
        });

        System.out.println("\nИсходные числа: " + numbers);
        System.out.println("После фильтрации (положительные): " + filtered);
    }

    private void manualInput5_3() {
        System.out.println("\n--- Массивы без положительных элементов ---");
        List<int[]> arrays = new ArrayList<>();

        System.out.print("Сколько массивов вы хотите ввести? ");
        int arrayCount = getPositiveInt(1);

        for (int i = 0; i < arrayCount; i++) {
            System.out.print("Введите размер массива " + (i + 1) + ": ");
            int size = getPositiveInt(1);

            int[] array = new int[size];
            System.out.println("Введите " + size + " чисел для массива " + (i + 1) + ":");
            for (int j = 0; j < size; j++) {
                System.out.print("Элемент " + (j + 1) + ": ");
                array[j] = scanner.nextInt();
            }
            scanner.nextLine();
            arrays.add(array);
        }

        List<int[]> filtered = ListTransform.test(arrays, new Filter<int[]>() {
            @Override
            public boolean test(int[] array) {
                for (int num : array) {
                    if (num > 0) {
                        return false;
                    }
                }
                return true;
            }
        });

        System.out.println("\nИсходные массивы:");
        for (int[] arr : arrays) {
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("После фильтрации (без положительных элементов):");
        for (int[] arr : filtered) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private void manualInput6() {
        System.out.println("\n=== РУЧНОЙ ВВОД: Сокращение ===");
        System.out.println("Выберите подзадачу:");
        System.out.println("1. Конкатенация строк");
        System.out.println("2. Сумма чисел");
        System.out.println("3. Общее количество элементов в списках списков");

        int subTask = getIntInRange(1, 3);

        switch (subTask) {
            case 1:
                manualInput6_1();
                break;
            case 2:
                manualInput6_2();
                break;
            case 3:
                manualInput6_3();
                break;
        }
    }

    private void manualInput6_1() {
        System.out.println("\n--- Конкатенация строк ---");
        List<String> strings = new ArrayList<>();

        System.out.print("Сколько строк вы хотите ввести? ");
        int count = getPositiveInt(1);

        for (int i = 0; i < count; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings.add(scanner.nextLine());
        }

        try {
            String result = ListTransform.reduce(strings, new Reduction<String>() {
                @Override
                public String reduce(String accumulator, String current) {
                    return accumulator + current;
                }
            });

            System.out.println("\nИсходные строки: " + strings);
            System.out.println("Результат конкатенации: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void manualInput6_2() {
        System.out.println("\n--- Сумма чисел ---");
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Сколько чисел вы хотите ввести? ");
        int count = getPositiveInt(1);

        for (int i = 0; i < count; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        scanner.nextLine();

        try {
            Integer result = ListTransform.reduce(numbers, new Reduction<Integer>() {
                @Override
                public Integer reduce(Integer accumulator, Integer current) {
                    return accumulator + current;
                }
            });

            System.out.println("\nИсходные числа: " + numbers);
            System.out.println("Сумма: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void manualInput6_3() {
        System.out.println("\n--- Общее количество элементов в списках списков ---");
        List<List<Integer>> listOfLists = new ArrayList<>();

        System.out.print("Сколько списков вы хотите создать? ");
        int listCount = getPositiveInt(1);

        for (int i = 0; i < listCount; i++) {
            List<Integer> innerList = new ArrayList<>();
            System.out.print("Сколько чисел в списке " + (i + 1) + "? ");
            int elementCount = getPositiveInt(0);

            for (int j = 0; j < elementCount; j++) {
                System.out.print("Введите число " + (j + 1) + " для списка " + (i + 1) + ": ");
                innerList.add(scanner.nextInt());
            }
            scanner.nextLine();
            listOfLists.add(innerList);
        }

        // Преобразуем в список размеров
        List<Integer> sizes = ListTransform.transform(listOfLists, List::size);

        // Суммируем размеры
        try {
            Integer totalCount = ListTransform.reduce(sizes, new Reduction<Integer>() {
                @Override
                public Integer reduce(Integer accumulator, Integer current) {
                    return accumulator + current;
                }
            });

            System.out.println("\nСписки: " + listOfLists);
            System.out.println("Размеры списков: " + sizes);
            System.out.println("Общее количество элементов: " + totalCount);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void manualInput7() {
        System.out.println("\n=== РУЧНОЙ ВВОД: Коллекционирование ===");
        System.out.println("Выберите подзадачу:");
        System.out.println("1. Разделение чисел на положительные и отрицательные");
        System.out.println("2. Группировка строк по длине");
        System.out.println("3. Уникальные строки");

        int subTask = getIntInRange(1, 3);

        switch (subTask) {
            case 1:
                manualInput7_1();
                break;
            case 2:
                manualInput7_2();
                break;
            case 3:
                manualInput7_3();
                break;
        }
    }

    private void manualInput7_1() {
        System.out.println("\n--- Разделение чисел на положительные и отрицательные ---");
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Сколько чисел вы хотите ввести? ");
        int count = getPositiveInt(1);

        for (int i = 0; i < count; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        scanner.nextLine();

        Map<Boolean, List<Integer>> partitioned = ListTransform.groupBy(
                numbers,
                HashMap::new,
                ArrayList::new,
                n -> n > 0
        );

        System.out.println("\nИсходные числа: " + numbers);
        System.out.println("Положительные: " + partitioned.get(true));
        System.out.println("Отрицательные: " + partitioned.get(false));
    }

    private void manualInput7_2() {
        System.out.println("\n--- Группировка строк по длине ---");
        List<String> strings = new ArrayList<>();

        System.out.print("Сколько строк вы хотите ввести? ");
        int count = getPositiveInt(1);

        for (int i = 0; i < count; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings.add(scanner.nextLine());
        }

        Map<Integer, List<String>> groupedByLength = ListTransform.groupBy(
                strings,
                HashMap::new,
                ArrayList::new,
                String::length
        );

        System.out.println("\nИсходные строки: " + strings);
        System.out.println("Группировка по длине:");
        groupedByLength.forEach((length, strList) ->
                System.out.println("Длина " + length + ": " + strList)
        );
    }

    private void manualInput7_3() {
        System.out.println("\n--- Уникальные строки ---");
        List<String> strings = new ArrayList<>();

        System.out.print("Сколько строк вы хотите ввести? ");
        int count = getPositiveInt(1);

        for (int i = 0; i < count; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings.add(scanner.nextLine());
        }

        Set<String> uniqueStrings = ListTransform.collect(
                strings,
                HashSet::new,
                Set::add
        );

        System.out.println("\nИсходные строки: " + strings);
        System.out.println("Уникальные строки: " + uniqueStrings);
    }

    // Вспомогательные методы для валидации ввода
    private int getPositiveInt(int minValue) {
        while (true) {
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                if (value >= minValue) {
                    return value;
                } else {
                    System.out.print("Введите число >= " + minValue + ": ");
                }
            } else {
                scanner.next();
                System.out.print("Неверный ввод! Введите целое число: ");
            }
        }
    }

    private int getIntInRange(int min, int max) {
        while (true) {
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.print("Введите число от " + min + " до " + max + ": ");
                }
            } else {
                scanner.next();
                System.out.print("Неверный ввод! Введите целое число: ");
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

    private void autoInput2() {
        System.out.println("Сравнимое.\n" +
                "Создайте ссылочный тип Сравнимое, гарантирующий наличие по данной ссылке метода со\n" +
                "следующими характеристиками:\n" +
                "\uF0B7 Называется “сравнить”\n" +
                "\uF0B7 Принимает объект.\n" +
                "\uF0B7 Тип принимаемого объекта может быть изменен без изменения самого Сравнимого.\n" +
                "\uF0B7 Возвращает целое число.\n");

        System.out.println("Пример с первым обьектом (значение 1 и сравниваем с 1)!");
        IntegerValue integerValue1 = new IntegerValue(1);
        IntegerValue integerValue2 = new IntegerValue(2);
        System.out.print("Результат: ");
        integerValue1.compare(1);

    }

    private void autoInput3() {
        System.out.println("Поиск максимума.\n" +
                "Создайте метод, принимающий набор Коробок из задачи 3.1.1 и возвращающий максимальное из\n" +
                "их значений в формате double. Принимаемые методом Коробки могут быть параметризованы\n" +
                "любыми видами чисел.");

        List<? extends Box<? extends Number>> boxes = Arrays.asList(
                new Box<>(10),           // Integer
                new Box<>(3.14),         // Double
                new Box<>(-5L),          // Long
                new Box<>(2.718f),       // Float
                new Box<>((short) 100)    // Short
        );

        double max = BoxUtils.findMaxValue(boxes);
        System.out.println("Максимальное значение: " + max); // 100.0

    }

    private void autoInput4() {
        System.out.println("Функция.\n" +
                "Разработайте такой метод, который будет принимать список значений типа T, и объект имеющий\n" +
                "единственный метод apply. Данный метод надо применить к каждому элементу списка, и вернуть\n" +
                "новый список значений типа P, при этом типы T и P могут совпадать, а могут не совпадать.\n" +
                "Используйте разработанный метод следующим образом:\n" +
                "1. Передайте в метод список со значениями:“qwerty”, “asdfg”, “zx”, а получите список чисел,\n" +
                "где каждое число соответствует длине каждой строки.\n" +
                "2. Передайте в метод список со значениями: 1,-3,7, а получите список в котором все\n" +
                "отрицательные числа стали положительными, а положительные остались без изменений\n" +
                "3. Передайте в метод список состоящий из массивов целых чисел, а получите список в\n" +
                "котором будут только максимальные значения каждого из исходных массивов\n");
        // 1 подзадача
        System.out.println("Первая подзадачка: ");
        List<String> a1 = Arrays.asList("qwerty", "asdfg", "zx");
        List<Integer> a2 = ListTransform.transform(a1, new Functions<String, Integer>() {
            @Override
            public Integer apply(String item) {
                System.out.println(item.length());
                return item.length();
            }
        });
        System.out.println("\nВторая подзадачка: ");
        // 2 подзадача
        List<Integer> a3 = Arrays.asList(1, -3, 7);
        List<Integer> a4 = ListTransform.transform(a3, new Functions<Integer, Integer>() {
            @Override
            public Integer apply(Integer item) {
                System.out.println(Math.abs(item));
                return Math.abs(item);
            }
        });
        System.out.println("\nТретья подзадачка: ");
        //3 подзадача
        List<int[]> a5 = Arrays.asList(
                new int[]{1, 5, 3},
                new int[]{-2, 8, 0},
                new int[]{10, 2, 7},
                new int[]{-5, -1, -10}
        );

        List<Integer> a6 = ListTransform.transform(a5, new Functions<int[], Integer>() {
            @Override
            public Integer apply(int[] array) {
                if (array.length == 0) {
                    return null;
                }

                int max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                return max;
            }
        });
        System.out.println("Максимумы массивов: " + a6);
    }

    private void autoInput5() {
        System.out.println("Фильтр.\n" +
                "Разработайте такой метод, который будет принимать список значений типа T и объект имеющий\n" +
                "единственный метод test (принимает T и возвращает boolean). Верните новый список типа T, из\n" +
                "которого удалены все значения не прошедшие проверку условием.\n" +
                "Используйте разработанный метод следующим образом:\n" +
                "1. Передайте в метод список со значениями: “qwerty”, “asdfg”, “zx”, и отфильтруйте все\n" +
                "строки имеющие менее трех символов\n" +
                "2. Передайте в метод список со значениями: 1,-3,7, и отфильтруйте все положительные\n" +
                "элементы\n" +
                "3. Передайте в метод список состоящий из массивов целых чисел, а получите список в\n" +
                "котором будут только те массивы, в которых нет ни одного положительного элемента");
        // 1 подзадача
        System.out.println("Первая подзадачка: ");
        List<String> a1 = Arrays.asList("qwerty", "asdfg", "zx");
        List<String> a2 = ListTransform.test(a1, new Filter<String>() {
            @Override
            public boolean test(String item) {
                System.out.println(item.length() >= 3);
                return item.length() >= 3;
            }
        });

        System.out.println("\nВторая подзадачка: ");
        // 2 подзадача
        List<Integer> a3 = Arrays.asList(1, -3, 7);
        List<Integer> a4 = ListTransform.test(a3, new Filter<Integer>() {
            @Override
            public boolean test(Integer item) {
                System.out.println(item > 0);
                return item > 0;
            }
        });

        System.out.println("\nТретья подзадачка: ");
        //3 подзадача
        List<int[]> a5 = Arrays.asList(
                new int[]{1, 5, 3},
                new int[]{-2, -8, 0},
                new int[]{-10, -2, -7},
                new int[]{-5, 1, -10}
        );
        List<int[]> a6 = ListTransform.test(a5, new Filter<int[]>() {
            @Override
            public boolean test(int[] array) {
                for (int num : array) {
                    if (num > 0) {
                        return false;
                    }
                }
                return true;
            }
        });
        System.out.println("Массивы без положительных элементов:");
        for (int[] arr : a6) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private void autoInput6() {
        System.out.println("Сокращение.\n" +
                "Разработайте такой метод, который будет принимать список значений типа T и способ с помощью\n" +
                "которого список значений можно свести к одному значению типа T, которое и возвращается из\n" +
                "метода.\n" +
                "Используйте разработанный метод следующим образом:\n" +
                "1. Передайте в метод список со значениями: “qwerty”, “asdfg”, “zx”, и сформируйте одну\n" +
                "большую строку, которая состоит из всех строк исходного списка.\n" +
                "2. Передайте в метод список со значениями: 1,-3,7, и верните сумму всех значений исходного\n" +
                "списка.\n" +
                "3. Имеется список, состоящий из списков целых чисел, получите общеe количество\n" +
                "элементов во всех списках. Подсказка: решить задачу можно в одно действие или\n" +
                "последовательно использовать методы из 3.3.1 и 3.3.3.\n" +
                "Далее необходимо изменить разработанный метод таким образом, чтобы данный метод\n" +
                "гарантированно не возвращал null и не выбрасывал ошибок в том случае, если исходный список\n" +
                "пуст.");
        // 1 подзадача
        System.out.println("Первая подзадачка: ");
        List<String> a1 = Arrays.asList("qwerty", "asdfg", "zx");
        String a2 = ListTransform.reduce(a1, new Reduction<String>() {
            @Override
            public String reduce(String accumulator, String current) {
                return accumulator + current;
            }
        });
        System.out.println(a2);


        System.out.println("\nВторая подзадачка: ");
        // 2 подзадача
        List<Integer> a3 = Arrays.asList(1, -3, 7);
        Integer a4 = ListTransform.reduce(a3, new Reduction<Integer>() {
            @Override
            public Integer reduce(Integer accumulator, Integer current) {
                return accumulator + current;
            }
        });
        System.out.println(a4);

        System.out.println("\nТретья подзадачка: ");

        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2, 3,10),
                List.of(4, 5),
                List.of(6, 7, 8, 9)
        );

        // Сначала преобразуем в список размеров
        List<Integer> sizes = ListTransform.transform(listOfLists, list -> list.size());

        // Затем суммируем размеры
        Integer totalCount = ListTransform.reduce(sizes, (a, b) -> a + b);

        System.out.println("Общее количество: " + totalCount);
    }

    private void autoInput7() {
        System.out.println("Коллекционирование.\n" +
                "Разработайте такой метод, который будет возвращать коллекцию типа P со значениями типа T.\n" +
                "Данный метод будет принимать:\n" +
                "1. Список исходных значений\n" +
                "2. Способ создания результирующей коллекции\n" +
                "3. Способ передачи значений исходного списка в результирующую коллекцию.\n" +
                "Используйте разработанный метод следующим образом:\n" +
                "1. Передайте в метод список со значениями: 1,-3,7, и верните их разбитыми на два\n" +
                "подсписка, в одном из которых будут только положительные числа, а в другом только\n" +
                "отрицательные.\n" +
                "2. Передайте в метод список со значениями: “qwerty”, “asdfg”, “zx”, “qw” и верните их\n" +
                "разбитыми на подсписки таким образом, чтобы в любом подсписке были строки только\n" +
                "одинаковой длины\n" +
                "3. Передайте в метод список со значениями: “qwerty”, “asdfg”, “qwerty”, “qw” и верните набор\n" +
                "такого вида, который не может содержать одинаковые объекты.");
        // 1. Разделение на положительные и отрицательные числа
        List<Integer> numbers = List.of(1, -3, 7, -2, 0, 5, -8);

        Map<Boolean, List<Integer>> partitioned = ListTransform.groupBy(
                numbers,
                HashMap::new,
                ArrayList::new,
                n -> n > 0
        );

        System.out.println("Положительные: " + partitioned.get(true));
        System.out.println("Отрицательные: " + partitioned.get(false));

        // 2. Группировка строк по длине
        List<String> strings1 = List.of("qwerty", "asdfg", "zx", "qw");

        Map<Integer, List<String>> groupedByLength = ListTransform.groupBy(
                strings1,
                HashMap::new,
                ArrayList::new,
                String::length
        );

        groupedByLength.forEach((length, strList) ->
                System.out.println("Длина " + length + ": " + strList)
        );

        // 3. Уникальные строки (Set)
        List<String> strings2 = List.of("qwerty", "asdfg", "qwerty", "qw");

        Set<String> uniqueStrings = ListTransform.collect(
                strings2,
                HashSet::new,
                Set::add
        );

        System.out.println("Уникальные строкы: " + uniqueStrings);
    }


}

