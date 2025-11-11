package ru.safoev.laba;

import java.util.Random;
import java.util.Scanner;

public class Labaratory {
  private static Scanner scanner = new Scanner(System.in);

  // Меню
  public void menu() {
    while (true) {
      System.out.println("\nЗдравствуйте, это первая лабораторная работа по Java!");
      System.out.println("=======Меню=======");
      System.out.println("----Методы----");
      System.out.println("1 - Задача 2");
      System.out.println("2 - Задача 4");
      System.out.println("3 - Задача 6");
      System.out.println("4 - Задача 8");
      System.out.println("5 - Задача 10");
      System.out.println("----Условия----");
      System.out.println("6 - Задача 2");
      System.out.println("7 - Задача 4");
      System.out.println("8 - Задача 6");
      System.out.println("9 - Задача 8");
      System.out.println("10 - Задача 10");
      System.out.println("----Циклы----");
      System.out.println("11 - Задача 2");
      System.out.println("12 - Задача 4");
      System.out.println("13 - Задача 6");
      System.out.println("14 - Задача 8");
      System.out.println("15 - Задача 10");
      System.out.println("----Массивы----");
      System.out.println("16 - Задача 2");
      System.out.println("17 - Задача 4");
      System.out.println("18 - Задача 6");
      System.out.println("19 - Задача 8");
      System.out.println("20 - Задача 10");
      System.out.println("0 - Выход");
      System.out.print("Выберите задание: ");

      int choice = -1;
      if (scanner.hasNextInt()) {
        choice = scanner.nextInt();
        scanner.nextLine();
      } else {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
      }

      switch (choice) {
        case 0:
          System.out.println("Выход из программы.......");
          return;
        case 1:
          int num = input2m();
          System.out.println(sumLastNums(num));
          break;
        case 2:
          int num1 = input4m();
          System.out.println(isPositive(num1));
          break;
        case 3:
          char simbol = input6m();
          System.out.println(isUpperCase(simbol));
          break;
        case 4:
          int[] num2 = input8m();
          int firstnum = num2[0];
          int lastnum = num2[1];
          System.out.println(isDivisor(firstnum, lastnum));
          break;
        case 5:
          int[] num3 = input10m();
          int firstnum1 = num3[0];
          int lastnum2 = num3[1];
          lastNumSum(firstnum1, lastnum2);
          break;
        case 6:
          int[] num4 = input2y();
          int firstnum4 = num4[0];
          int lastnum4 = num4[1];
          System.out.println(safeDiv(firstnum4, lastnum4));
          break;
        case 7:
          int[] num5 = input4y();
          int firstnum5 = num5[0];
          int lastnum5 = num5[1];
          System.out.println(makeDecision(firstnum5, lastnum5));
          break;
        case 8:
          int[] num6 = input6y();
          int onenum6 = num6[0];
          int twonum6 = num6[1];
          int threenum6 = num6[2];
          System.out.println(sum3(onenum6, twonum6, threenum6));
          break;
        case 9:
          int num8 = input8y();
          System.out.println(age(num8));
          break;
        case 10:
          String num9 = input10y();
          printDays(num9);
          break;
        case 11:
          int num10 = input2c();
          System.out.println(reverseListNums(num10));
          break;
        case 12:
          int[] num10arr = input4c();
          int firstnum10 = num10arr[0];
          int lastnum10 = num10arr[1];
          System.out.println(pow(firstnum10, lastnum10));
          break;
        case 13:
          int num11 = input6c();
          System.out.println(equalNum(num11));
          break;
        case 14:
          int num12 = input8c();
          leftTriangle(num12);
          break;
        case 15:
          guessGame();
          break;
        case 16:
          int[] arr = input2arr();
          outarr(arr);
          int num12val = input2arr1();
          System.out.println(findLast(arr, num12val));
          break;
        case 17:
          System.out.println("Задача: Необходимо реализовать метод таким образом, чтобы он возвращал новый\n" +
              "массив, который будет содержать все элементы массива arr, однако в позицию\n" +
              "pos будет вставлено значение x.\n");
          int[] arr1 = input4arr();
          outarr(arr1);
          System.out.println("\nВведите число которое хотите вставить в массив! ");
          int x = inputhelp2();
          System.out.println("\nВведите на какую позицию вы хотите вставить число! ");
          int pos = inputhelp2();
          add(arr1, x, pos);
          break;
        case 18:
          System.out.println(
              "Задача: Необходимо реализовать метод таким образом, чтобы он изменял массив arr.\n"
                  + "После проведенных изменений массив должен быть записан задом-наперед.");
          int[] arr2 = helpinput();
          result();
          reverse(arr2);
          break;
        case 19:
          System.out.println(
              "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал новый\n"
                  + "массив, в котором сначала идут элементы первого массива (arr1), а затем\n"
                  + "второго (arr2).\n");
          System.out.println("Введите первый массив! ");
          int[] arr3 = helpinput();
          System.out.println("Введите второй массив! ");
          int[] arr4 = helpinput();
          System.out.println("Ваш первый массив!");
          outarr(arr3);
          System.out.println("\nВаш второй массив!");
          outarr(arr4);
          concat(arr3, arr4);
          break;
        case 20:
          System.out.println(
              "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал новый\n"
                  + "массив, в котором записаны все элементы массива arr кроме отрицательных.\n");
          int[] arr5 = helpinput();
          outarr(arr5);
          deleteNegative(arr5);
          break;
        default:
          System.out.println("Неверный выбор! Попробуйте снова.");
          break;
      }
    }
  }

  public void result() {
    System.out.print("Результат: ");
  }
  

  public void outarr(int[] arr) {
    System.out.print("Ваш массив: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  // ========= МЕТОДЫ =========

  // 2 Задание
  public int input2m() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал результат\n"
            + "сложения двух последних знаков числах, предполагая, что знаков в числе не\n"
            + "менее двух.");
    while (true) {
      System.out.print("Введите целое число (минимум 2 цифры): ");

      if (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        scanner.nextLine();
        if (x < 0) {
          System.out.println("Ошибка! Число отрицательное.");
          continue;
        }

        if (x >= 10) {
          return x;
        } else {
          System.out.println("Ошибка! Число должно содержать минимум 2 цифры.");
        }
      } else {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
      }
    }
  }

  public int sumLastNums(int x) {
    int last = x % 10;
    int last1 = (x / 10) % 10;
    result();
    return last + last1;
  }

  public int inputhelp2() {
    while (true) {
      System.out.print("Введите целое число: ");

      if (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        scanner.nextLine();
        return x;
      } else {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
      }
    }
  }

  // 4 Задание
  public int input4m() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он принимал число x и\n"
            + "возвращал true, если оно положительное.");
    return inputhelp2();
  }

  public boolean isPositive(int x) {
    result();
    return x > 0;
  }

  // 6 Задание
  public char input6m() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он принимал символ x и\n"
            + "возвращал true, если это большая буква в диапазоне от 'A' до 'Z'. ");
    while (true) {
      System.out.print("Введите символ (только A-Z): ");
      String input = scanner.next();

      if (input.length() != 1) {
        System.out.println("Ошибка! Введите ровно один символ.");
        continue;
      }

      char x = input.charAt(0);

      if ((x >= 'А' && x <= 'Я') || (x >= 'а' && x <= 'я')) {
        System.out.println("Ошибка! Введена русская буква. Введите только символы от A до Z.");
        continue;
      }

      return x;
    }
  }

  public boolean isUpperCase(char x) {
    result();
    return x >= 'A' && x <= 'Z';
  }

  // 8 Задание
  public int[] input8m() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
            + "любое из принятых чисел делит другое нацело.");
    int[] x = new int[2];
    for (int i = 0; i < x.length; i++) {
      while (true) {
        System.out.print("Введите " + (i + 1) + " число: ");
        if (scanner.hasNextInt()) {
          x[i] = scanner.nextInt();
          scanner.nextLine();
          break;
        } else {
          String invalidInput = scanner.next();
          System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
        }
      }
    }
    return x;
  }

  public boolean isDivisor(int a, int b) {
    result();
    return a % b == 0 || b % a == 0;
  }

  // 10 Задание
  public int[] input10m() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он считал сумму цифр\n"
            + "двух чисел из разряда единиц. Выполните с его помощью последовательное\n"
            + "сложение пяти чисел и результат выведите на экран. Постарайтесь выполнить\n"
            + "задачу, используя минимально возможное количество вспомогательных\n"
            + "переменных.");
    int[] x = new int[2];

    for (int i = 0; i < x.length; i++) {
      while (true) {
        System.out.print("Введите " + (i + 1) + " число: ");

        if (scanner.hasNextInt()) {
          x[i] = scanner.nextInt();
          scanner.nextLine();
          break;
        } else {
          String invalidInput = scanner.next();
          System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
        }
      }
    }
    return x;
  }

  public int lastNumSum(int a, int b) {
    a = a % 10 + b % 10;
    System.out.print("Результат первых двух чисел: " + a);

    for (int i = 2; i < 5; i++) {
      System.out.println();

      int x1;
      while (true) {
        System.out.print("Введите " + (i + 1) + " число: ");

        if (scanner.hasNextInt()) {
          x1 = scanner.nextInt();
          scanner.nextLine();
          break;
        } else {
          String invalidInput = scanner.next();
          System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
        }
      }

      a = a % 10 + x1 % 10;
      System.out.print("Результат: " + a);
    }

    System.out.println();
    System.out.println("Итог: " + a);
    return a;
  }

  // ========= УСЛОВИЯ ========

  // 2 Задание
  public int[] input2y() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал деление x\n"
            + "на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При\n"
            + "делении на 0 следует вернуть из метода число 0.");
    int[] x = new int[2];

    for (int i = 0; i < x.length; i++) {
      while (true) {
        System.out.print("Введите " + (i + 1) + " число: ");

        if (scanner.hasNextInt()) {
          x[i] = scanner.nextInt();
          scanner.nextLine();
          break;
        } else {
          String invalidInput = scanner.next();
          System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
        }
      }
    }
    return x;
  }

  public double safeDiv(int x, int y) {
    if (x != 0 && y != 0) {
      result();
      return (double) x / y;
    } else {
      result();
      return 0;
    }
  }

  // 4 Задание
  public int[] input4y() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал строку,\n"
            + "которая включает два принятых методом числа и корректно выставленный\n"
            + "знак операции сравнения (больше, меньше, или равно).\n");

    int[] x = new int[2];

    for (int i = 0; i < x.length; i++) {
      while (true) {
        System.out.print("Введите " + (i + 1) + " число: ");

        if (scanner.hasNextInt()) {
          x[i] = scanner.nextInt();
          scanner.nextLine();
          break;
        } else {
          String invalidInput = scanner.next();
          System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
        }
      }
    }
    return x;
  }

  public String makeDecision(int x, int y) {
    if (x < y) {
      result();
      return x + " < " + y;
    } else if (x == y) {
      result();
      return x + " = " + y;
    } else {
      result();
      return x + " > " + y;
    }
  }

  // 6 Задание
  public int[] input6y() {
    System.out.println(
        "Задача: "
            + "Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
            + "два любых числа (из трех принятых) можно сложить так, чтобы получить\n"
            + "третье. ");

    int[] x = new int[3];

    for (int i = 0; i < x.length; i++) {
      while (true) {
        System.out.print("Введите " + (i + 1) + " число: ");

        if (scanner.hasNextInt()) {
          x[i] = scanner.nextInt();
          scanner.nextLine();
          break;
        } else {
          String invalidInput = scanner.next();
          System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
        }
      }
    }
    return x;
  }

  public boolean sum3(int x, int y, int z) {
    result();
    return (x + y == z) || (x + z == y) || (y + z == x);
  }

  // 8 Задание
  public int input8y() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n"
            + "которой сначала будет число х, а затем одно из слов:\n"
            + "год\n"
            + "года\n"
            + "лет\n"
            + "Слово “год” добавляется, если число х заканчивается на 1, кроме числа 11.\n"
            + "Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел\n"
            + "12, 13, 14.\n"
            + "Слово “лет” добавляется во всех остальных случаях.\n");

    while (true) {
      System.out.print("Введите число: ");

      if (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        scanner.nextLine();
        if (x <= 0) {
          System.out.println("Ошибка! Число отрицательное.");
          continue;
        }
        return x;
      } else {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
      }
    }
  }

  public String age(int x) {
    if (x % 10 == 1) {
      if (x == 11) {
        result();
        return x + " лет";
      }
      result();
      return x + " год";
    } else if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
      if (x == 12 || x == 13 || x == 14) {
        result();
        return x + " лет";
      }
      result();
      return x + " года";
    } else {
      result();
      return x + " лет";
    }
  }

  // 10 Задание
  public String input10y() {
    System.out.println(
        "Задача: В качестве параметра метод принимает строку, в которой записано название\n"
            + "дня недели. Необходимо реализовать метод таким образом, чтобы он выводил\n"
            + "на экран название переданного в него дня и всех последующих до конца недели\n"
            + "дней. Если в качестве строки передан не день, то выводится текст “это не день\n"
            + "недели”. Первый день понедельник, последний – воскресенье.");

    while (true) {
      System.out.print("Введите день недели: ");

      if (scanner.hasNextInt()) {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это число. Введите день недели!.");
      } else {
        return scanner.nextLine();
      }
    }
  }

  public void printDays(String x) {
    System.out.println("Результат: ");
    switch (x) {
      case "понедельник":
        System.out.println("понедельник");
      case "вторник":
        System.out.println("вторник");
      case "среда":
        System.out.println("среда");
      case "четверг":
        System.out.println("четверг");
      case "пятница":
        System.out.println("пятница");
      case "суббота":
        System.out.println("суббота");
      case "воскресенье":
        System.out.println("воскресенье");
        break;
      default:
        System.out.println("это не день недели");
    }
  }

  // ========= ЦИКЛЫ ===========

  // 2 Задание
  public int input2c() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n"
            + "которой будут записаны все числа от x до 0 (включительно).");

    while (true) {
      System.out.print("Введите число: ");

      if (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        scanner.nextLine();
        result();
        return x;
      } else {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
      }
    }
  }

  public String reverseListNums(int x) {
    if (x == 0) {
      return "0";
    }

    if (x > 0) {
      return x + " " + reverseListNums(x - 1);
    } else {
      return x + " " + reverseListNums(x + 1);
    }
  }

  // 4 Задание
  public int[] input4c() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал результат\n"
            + "возведения x в степень y.");

    int[] x = new int[2];

    for (int i = 0; i < x.length; i++) {
      while (true) {
        System.out.print("Введите " + (i + 1) + " число: ");

        if (scanner.hasNextInt()) {
          x[i] = scanner.nextInt();
          scanner.nextLine();
          break;
        } else {
          String invalidInput = scanner.next();
          System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
        }
      }
    }
    return x;
  }

  public double pow(int x, int y) {
    if (y == 0) {
      result();
      return 1;
    }

    if (y < 0) {
      double result = 1.0;
      for (int i = 0; i < -y; i++) {
        result *= x;
      }
      result();
      return 1.0 / result;
    } else {
      int result = 1;
      for (int i = 0; i < y; i++) {
        result *= x;
      }
      result();
      return result;
    }
  }

  // 6 Задание
  public int input6c() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
            + "все знаки числа одинаковы, и false в ином случае.");

    while (true) {
      System.out.print("Введите число: ");

      if (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        scanner.nextLine();
        result();
        return x;
      } else {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
      }
    }
  }

  public boolean equalNum(int x) {
    if (x < 10 && x >= 0) {
      return true;
    }

    if (x < 0) {
      x = -x;
    }

    int lastx = x % 10;
    x = x / 10;
    while (x > 0) {
      int currentx = x % 10;
      if (currentx != lastx) {
        return false;
      }
      x = x / 10;
    }
    return true;
  }

  // 8 Задание
  public int input8c() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он выводил на экран\n"
            + "треугольник из символов ‘*’ у которого х символов в высоту, а количество\n"
            + "символов в ряду совпадает с номером строки.\n");

    while (true) {
      System.out.print("Введите число: ");

      if (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        scanner.nextLine();
        if(x < 0) {
          System.out.println("Ошибка! Число отрицательное.");
          continue;
        }
        result();
        System.out.println();
        return x;
      } else {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
      }
    }
  }

  public void leftTriangle(int x) {
    char x1 = '*';
    for (int i = 1; i <= x; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(x1);
      }
      System.out.println();
    }
  }

  // 10 Задание
  public void guessGame() {
    System.out.println(
        "Задача: Необходимо реализовать метод таким образом, чтобы он генерировал\n"
            + "случайное число от 0 до 9, далее считывал с консоли введенное пользователем\n"
            + "число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод\n"
            + "запускается до тех пор, пока пользователь не угадает число. После этого\n"
            + "выведите на экран количество попыток, которое потребовалось пользователю,\n"
            + "чтобы угадать число.");
    Random random = new Random();
    int i = 0;
    int pc = random.nextInt(10);
    while (true) {
      System.out.print("Введите число от 0 до 9: ");
      i++;
      if(scanner.hasNextInt()) {
        int user = scanner.nextInt();
        if(user < 0 || user > 10) {
          System.out.println("Ошибка! Число должно быть от 0 до 9!");
          continue;
        }
        if (pc == user) {
          System.out.println("Вы выиграли! \nВы отгадали число за " + i + " попыток!");
          break;
        } else {
          System.out.println("Вы не угадали! ");
          continue;
        }
      }
      else {
        String input = scanner.next();
        System.out.println(input + " - это не число!");
      }
    }
  }

  // ======== МАССИВЫ ==========

  // 2 Задание
  public int input2arr1() {
    while (true) {
      System.out.println();
      System.out.print("Введите число, которое хотите найти в массиве: ");

      if (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return x;
      } else {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
      }
    }
  }

  public int[] helpinput() {
    System.out.print("Введите длину массива: ");
    int n = 0;

    while (true) {
      if (scanner.hasNextInt()) {
        n = scanner.nextInt();
        scanner.nextLine();
        if (n > 0) {
          break;
        } else {
          System.out.println("Ошибка! Длина массива должна быть положительным числом.");
        }
      } else {
        String invalidInput = scanner.next();
        System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
      }
      System.out.print("Введите длину массива: ");
    }

    int[] x = new int[n];
    for (int i = 0; i < x.length; i++) {
      while (true) {
        System.out.print("Введите " + (i + 1) + " число: ");

        if (scanner.hasNextInt()) {
          x[i] = scanner.nextInt();
          scanner.nextLine();
          break;
        } else {
          String invalidInput = scanner.next();
          System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
        }
      }
    }
    return x;
  }

  public int[] input2arr() {
    System.out.println("Задача: Необходимо реализовать метод таким образом, чтобы он возвращал индекс\n" +
        "последнего вхождения числа x в массив arr. Если число не входит в массив –\n" +
        "возвращается -1");
    return helpinput();
  }

  public int findLast(int[] arr, int x) {
    int j = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        j = i;
      }
    }
    result();
    return j;
  }

  // 4 Задание
  public int[] input4arr() {
    return helpinput();
  }

  public int[] add(int[] arr, int x, int pos) {
    if (pos < 0 || pos > arr.length) {
      System.out.println("Некорректная позиция: " + pos);
      return arr;
    }

    int[] newArr = new int[arr.length + 1];
    for (int i = 0; i < pos; i++) {
      newArr[i] = arr[i];
    }

    newArr[pos] = x;

    for (int i = pos; i < arr.length; i++) {
      newArr[i + 1] = arr[i];
    }

    outarr(newArr);
    return newArr;
  }

  // 6 Задание
  public void reverse(int[] arr) {
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }

  // 8 Задание
  public int[] concat(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
      result[i] = arr1[i];
    }

    for (int i = 0; i < arr2.length; i++) {
      result[arr1.length + i] = arr2[i];
    }

    System.out.print("\nОбьединненый массив: ");
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

    return result;
  }

  // 10 Задание
  public int[] deleteNegative(int[] arr) {
    int count = 0;
    for (int num : arr) {
      if (num >= 0) {
        count++;
      }
    }

    int[] result = new int[count];
    int index = 0;
    for (int num : arr) {
      if (num >= 0) {
        result[index] = num;
        index++;
      }
    }

    System.out.print("\nРезультат: ");
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

    return result;
  }
}
