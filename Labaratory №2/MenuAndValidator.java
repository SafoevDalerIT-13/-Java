import java.util.List;
import java.util.Scanner;

public class MenuAndValidator {

  private static final Scanner scanner = new Scanner(System.in);

  // Способ ввода
  public int menu() {
    while (true) {
      System.out.println("\nЗдравствуйте, это Лабораторная работа №2!");
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
      System.out.println("1. Категория №1 - Задача 3");
      System.out.println("2. Категория №1 - Задача 2");
      System.out.println("3. Категория №2 - Задача 4");
      System.out.println("4. Категория №3 - Задача 4");
      System.out.println("5. Категория №4 - Задача 5");
      System.out.println("6. Категория №5 - Задача 1");
      System.out.println("0. Назад к выбору способа ввода");

      System.out.print("Ваш выбор задания: ");

      if (scanner.hasNextInt()) {
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
          case 1:
            executeInputTask1();
            break;
          case 2:
            executeInputTask2();
            break;
          case 3:
            executeInputTask3();
            break;
          case 4:
            executeInputTask4();
            break;
          case 5:
            executeInputTask5();
            break;
          case 6:
            executeInputTask6();
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
      System.out.println("1. Категория №1 - Задача 3");
      System.out.println("2. Категория №1 - Задача 2");
      System.out.println("3. Категория №2 - Задача 4");
      System.out.println("4. Категория №3 - Задача 4");
      System.out.println("5. Категория №4 - Задача 5");
      System.out.println("6. Категория №5 - Задача 1");
      System.out.println("0. Назад к выбору способа ввода");

      System.out.print("Ваш выбор задания: ");

      if (scanner.hasNextInt()) {
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
          case 1:
            executeAutoTask1();
            break;
          case 2:
            executeAutoTask2();
            break;
          case 3:
            executeAutoTask3();
            break;
          case 4:
            executeAutoTask4();
            break;
          case 5:
            executeAutoTask5();
            break;
          case 6:
            executeAutoTask6();
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

  // Авто ввод методы задач
  private void executeAutoTask1() {
    System.out.println("Категория №1: Задача 3");
    System.out.println("Имена.\n" +
            "Создайте сущность Имя, которая описывается тремя параметрами: Фамилия, Личное имя,\n" +
            "Отчество. Имя может быть приведено к строковому виду, включающему традиционное\n" +
            "представление всех трех параметров: Фамилия Имя Отчество (например “Иванов Иван\n" +
            "Иванович”). Необходимо предусмотреть возможность того, что какой-либо из параметров может\n" +
            "быть не задан, и в этом случае он не учитывается при приведении к текстовому виду.\n" +
            "Необходимо создать следующие имена:\n" +
            "     - Клеопатра\n" +
            "     - Пушкин Александр Сергеевич\n" +
            "     - Маяковский Владимир\n" +
            "Обратите внимание, что при выводе на экран, не заданные параметры никак не участвуют в\n" +
            "образовании строки. \n\nРешение: ");
    Name cleopatra = new Name("Клеопатра");
    Name pushkin = new Name("Пушкин", "Александр", "Сергеевич");
    Name mayakovskiy = new Name("Маяковский", "Владимир");

    System.out.println(cleopatra);
    System.out.println(pushkin);
    System.out.println(mayakovskiy);
  }

  private void executeAutoTask2() {
    System.out.println("Категория №1: Задача 2");
    System.out.println("Человек.\n" +
            "Создайте сущность Человек, которая описывается:\n" +
            "- Имя: строка\n" +
            "- Рост: целое число\n" +
            "Может возвращать текстовое представление вида “Name, рост: height”, где Name и height это\n" +
            "переменная с именем и ростом.\n" +
            "Необходимо создать и вывести на экран следующих людей:\n" +
            "- Человек с именем “Клеопатра” и ростом 152\n" +
            "- Человек с именем “Пушкин ” и ростом 167\n" +
            "- Человек с именем “Владимир ” и ростом 189\n");
    Person cleopatra1 = new Person("Клеопатра", 152);
    Person pushkin1 = new Person("Пушкин", 167);
    Person mayakovskiy1 = new Person("Владимир", 189);

    System.out.println(cleopatra1);
    System.out.println(pushkin1);
    System.out.println(mayakovskiy1);
  }

  private void executeAutoTask3() {
    System.out.println("Категория №2: Задача 4");
    System.out.println("Сотрудники и отделы.\n" +
            "Создайте сущность Сотрудник, которая описывается именем (в строковой форме) и отделом, в\n" +
            "котором сотрудник работает, причем у каждого отдела есть название и начальник, который\n" +
            "также является Сотрудником. Сотрудник может быть приведен к текстовой форме вида: “Имя\n" +
            "работает в отделе Название, начальник которого Имя”. В случае если сотрудник является\n" +
            "руководителем отдела, то текстовая форма должна быть “Имя начальник отдела Название”.\n" +
            "Необходимо выполнить следующие задачи:\n" +
            "1. Создать Сотрудников Петрова, Козлова, Сидорова работающих в отделе IT.\n" +
            "2. Сделать Козлова начальником IT отдела.\n" +
            "3. Вывести на экран текстовое представление всех трех Сотрудников (у всех троих должен\n" +
            "оказаться один и тот же отдел и начальник).\n");
    Department it = new Department("IT");
    Employee petrov = new Employee("Петров", it);
    Employee kozlov = new Employee("Козлов", it);
    Employee sidorov = new Employee("Сидоров", it);

    it.setManager(kozlov);

    System.out.println(petrov);
    System.out.println(kozlov);
    System.out.println(sidorov);
  }

  private void executeAutoTask4() {
    Department it = new Department("IT");
    Employee petrov = new Employee("Петров", it);
    Employee kozlov = new Employee("Козлов", it);
    Employee sidorov = new Employee("Сидоров", it);
    System.out.println("Категория №3: Задача 4");
    System.out.println("Сотрудники и отделы.\n" +
            "Измените решение, полученное в задаче 2.4 таким образом, чтобы имея ссылку на сотрудника,\n" +
            "можно было бы узнать список всех сотрудников этого отдела.\n");
    System.out.println("Список сотрудников IT отдела (через Петрова):");
    List<Employee> employeesFromPetrov = petrov.getAllDepartmentEmployees();
    for (int i = 0; i < employeesFromPetrov.size(); i++) {
      Employee emp = employeesFromPetrov.get(i);
      System.out.println("- " + emp.getName());
    }

    System.out.println("\nСписок сотрудников IT отдела (через Козлова):");
    List<Employee> employeesFromKozlov = kozlov.getAllDepartmentEmployees();
    for (int i = 0; i < employeesFromKozlov.size(); i++) {
      Employee emp = employeesFromKozlov.get(i);
      System.out.println("- " + emp.getName());
    }

    System.out.println("\nСписок сотрудников IT отдела (через Сидорова):");
    List<Employee> employeesFromSidorov = sidorov.getAllDepartmentEmployees();
    for (int i = 0; i < employeesFromSidorov.size(); i++) {
      Employee emp = employeesFromSidorov.get(i);
      System.out.println("- " + emp.getName());
    }
  }

  private void executeAutoTask5() {
    System.out.println("Категория №4: Задача 5");
    System.out.println("Создаем Имена.\n" +
            "Измените сущность Имя из задачи 1.3. Новые требования включают:\n" +
            "- Имя можно создать указав только Личное имя\n" +
            "- Имя можно создать указав Личное имя и Фамилию.\n" +
            "- Имя можно создать указав все три параметра: Личное имя, Фамилию, Отчество.\n" +
            "Необходимо создать следующие имена:\n" +
            "1. Клеопатра\n" +
            "2. Александр Сергеевич Пушкин\n" +
            "3. Владимир Маяковский\n" +
            "4. Христофор Бонифатьевич (здесь Христофор это имя, а Бонифатьевич - фамилия) ");
    Name cleopatra2 = new Name("Клеопатра");
    Name pushkin2 = new Name("Пушкин", "Александр", "Сергеевич");
    Name mayakovskiy2 = new Name("Маяковский", "Владимир");
    Name hrostofor = new Name("Бонифатьевич", "Христофор");

    System.out.println(cleopatra2.toString1());
    System.out.println(pushkin2.toString1());
    System.out.println(mayakovskiy2.toString1());
    System.out.println(hrostofor.toString1());
  }

  private void executeAutoTask6() {
    System.out.println("Категория №5: Задача 1");
    System.out.println("Пистолет стреляет.\n" +
            "Создайте сущность Пистолет, которая описывается следующим образом:\n" +
            "- Имеет Количество патронов (целое число)\n" +
            "- Может быть создан с указанием начального количества патронов\n" +
            "- Может быть создан без указания начального количества патронов, в этом случае он\n" +
            "изначально заряжен пятью патронами.\n" +
            "- Может Стрелять, что приводит к выводу на экран текста “Бах!” в том случае, если\n" +
            "количество патронов больше нуля, иначе делает “Клац!”. После каждого выстрела (когда\n" +
            "вывелся “Бах!”) количество патронов уменьшается на один.\n" +
            "Создайте пистолет с тремя патронами и выстрелите из него пять раз. ");
    Gun gun1 = new Gun(3);
    for (int i = 0; i < 5; i++) {
      gun1.fire();
    }
  }



  // Методы для ручного ввода заданий
  private int executeInputTask1() {
    System.out.println("Категория №1: Задача 3");
    System.out.println("Имена.\n" +
            "Создайте сущность Имя, которая описывается тремя параметрами: Фамилия, Личное имя,\n" +
            "Отчество. Имя может быть приведено к строковому виду, включающему традиционное\n" +
            "представление всех трех параметров: Фамилия Имя Отчество (например “Иванов Иван\n" +
            "Иванович”). Необходимо предусмотреть возможность того, что какой-либо из параметров может\n" +
            "быть не задан, и в этом случае он не учитывается при приведении к текстовому виду.\n" +
            "Необходимо создать следующие имена:\n" +
            "     - Клеопатра\n" +
            "     - Пушкин Александр Сергеевич\n" +
            "     - Маяковский Владимир\n" +
            "Обратите внимание, что при выводе на экран, не заданные параметры никак не участвуют в\n" +
            "образовании строки. \n\nРешение: ");
    while (true) {
      System.out.println("Какие входные параметры вы хотите ввести? \n" +
              "1. Только имя\n" +
              "2. Фамилию, Имя и Отчество\n" +
              "3. Фамилию и Имя\n" +
              "0. Выход ");
      System.out.print("Ваш выбор: ");

      if (scanner.hasNextInt()) {
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
          case 1:
            String firstname =  inputName();
            Name firstname1 = new Name(firstname);
            System.out.println("Создано: " + firstname1);
            break;
          case 2:
            String lastname = inputLastname();
            String lastname1 = inputName();
            String lastname2 = inputSurname();
            Name firstname12 = new Name(lastname,lastname1,lastname2);
            System.out.println("Создано: " + firstname12);
            break;
          case 3:
            String surname = inputLastname();
            String surname1 = inputName();
            Name surname12 = new Name(surname,surname1);
            System.out.println("Создано: " + surname12);
            break;
          case 0:
            return manualInputMenu(scanner);

          default:
            System.out.println("Неверный выбор!");
            break;

        }
      } else {
        scanner.next();
        System.out.println("Ошибка! Введите число от 0 до 3");
      }
    }
  }

  private void executeInputTask2() {
    System.out.println("Категория №1: Задача 2");
    System.out.println("Человек.\n" +
            "Создайте сущность Человек, которая описывается:\n" +
            "- Имя: строка\n" +
            "- Рост: целое число\n" +
            "Может возвращать текстовое представление вида “Name, рост: height”, где Name и height это\n" +
            "переменная с именем и ростом.\n" +
            "Необходимо создать и вывести на экран следующих людей:\n" +
            "- Человек с именем “Клеопатра” и ростом 152\n" +
            "- Человек с именем “Пушкин ” и ростом 167\n" +
            "- Человек с именем “Владимир ” и ростом 189\n");
    String name = inputName();
    int height = (int) inputHeight();
    Person name1 = new Person(name,height);
    System.out.println("Создано: " + name1);
  }

  private int executeInputTask3() {
    System.out.println("Категория №2: Задача 4");
    System.out.println("Сотрудники и отделы.\n" +
            "Создайте сущность Сотрудник, которая описывается именем (в строковой форме) и отделом, в\n" +
            "котором сотрудник работает, причем у каждого отдела есть название и начальник, который\n" +
            "также является Сотрудником. Сотрудник может быть приведен к текстовой форме вида: “Имя\n" +
            "работает в отделе Название, начальник которого Имя”. В случае если сотрудник является\n" +
            "руководителем отдела, то текстовая форма должна быть “Имя начальник отдела Название”.\n" +
            "Необходимо выполнить следующие задачи:\n" +
            "1. Создать Сотрудников Петрова, Козлова, Сидорова работающих в отделе IT.\n" +
            "2. Сделать Козлова начальником IT отдела.\n" +
            "3. Вывести на экран текстовое представление всех трех Сотрудников (у всех троих должен\n" +
            "оказаться один и тот же отдел и начальник).\n");
    System.out.println("Для начала введем департамент!");
    String depa = inputDepartment();
    Department depo1 = new Department(depa);
    System.out.println("Теперь введите первого сотрудника!");
    String name = inputName();
    Employee emp1 = new Employee(name,depo1);
    System.out.println("Затем введите второго сотрудника!");
    String name1 = inputName();
    Employee emp2 = new Employee(name1,depo1);
    System.out.println("И введите третьего сотрудника!");
    String name2 = inputName();
    Employee emp3 = new Employee(name2,depo1);
    System.out.println("Какого сотрудника вы хотите сделать управляющим отделом " + depa);

    while(true) {
      System.out.println("1. " + name);
      System.out.println("2. " + name1);
      System.out.println("3. " + name2);
      System.out.print("Ваш выбор: ");
      if(scanner.hasNextInt()) {
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
          case 1:
            depo1.setManager(emp1);
            break;
          case 2:
            depo1.setManager(emp2);
            break;
          case 3:
            depo1.setManager(emp3);
            break;
          default:
            System.out.println("Неккоректный выбор!");
            break;
        }
      }else {
        System.out.println("Введите число!");
      }
      System.out.println("1. " + emp1);
      System.out.println("2. " + emp2);
      System.out.println("3. " + emp3);
      return manualInputMenu(scanner);
    }
  }

  private int executeInputTask4() {
    System.out.println("Категория №3: Задача 4");
    System.out.println("Сотрудники и отделы.\n" +
            "Измените решение, полученное в задаче 2.4 таким образом, чтобы имея ссылку на сотрудника,\n" +
            "можно было бы узнать список всех сотрудников этого отдела.\n");
    System.out.println("Для начала введем департамент!");
    String depa = inputDepartment();
    Department depo1 = new Department(depa);
    System.out.println("Теперь введите первого сотрудника!");
    String name = inputName();
    Employee emp1 = new Employee(name, depo1);
    System.out.println("Затем введите второго сотрудника!");
    String name1 = inputName();
    Employee emp2 = new Employee(name1, depo1);
    System.out.println("И введите третьего сотрудника!");
    String name2 = inputName();
    Employee emp3 = new Employee(name2, depo1);
    System.out.println("Какого сотрудника вы хотите сделать управляющим отделом " + depa);

    while (true) {
      System.out.println("1. " + name);
      System.out.println("2. " + name1);
      System.out.println("3. " + name2);
      System.out.print("Ваш выбор: ");
      if (scanner.hasNextInt()) {
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
          case 1:
            depo1.setManager(emp1);
            break;
          case 2:
            depo1.setManager(emp2);
            break;
          case 3:
            depo1.setManager(emp3);
            break;
          default:
            System.out.println("Неккоректный выбор!");
            break;
        }
      } else {
        System.out.println("Введите число!");
      }

      System.out.println("1. " + emp1);
      System.out.println("2. " + emp2);
      System.out.println("3. " + emp3);

      System.out.println("Через какого сотрудника вы хотите получить всех сотрудников?");
      while (true) {
        System.out.println("1. " + name);
        System.out.println("2. " + name1);
        System.out.println("3. " + name2);
        System.out.print("Ваш выбор: ");
        if (scanner.hasNextInt()) {
          int choice = scanner.nextInt();
          scanner.nextLine();

          switch (choice) {
            case 1:
              System.out.println("Список сотрудников IT отдела (через " + name + "): ");
              List<Employee> employeesFromEmp1 = emp1.getAllDepartmentEmployees();
              for (int i = 0; i < employeesFromEmp1.size(); i++) {
                Employee emp = employeesFromEmp1.get(i);
                System.out.println("- " + emp.getName());
              }
              break;
            case 2:
              System.out.println("Список сотрудников IT отдела (через " + name1 + "): ");
              List<Employee> employeesFromEmp2 = emp2.getAllDepartmentEmployees();
              for (int i = 0; i < employeesFromEmp2.size(); i++) {
                Employee emp = employeesFromEmp2.get(i);
                System.out.println("- " + emp.getName());
              }
              break;
            case 3:
              System.out.println("Список сотрудников IT отдела (через " + name2 + "): ");
              List<Employee> employeesFromEmp3 = emp3.getAllDepartmentEmployees();
              for (int i = 0; i < employeesFromEmp3.size(); i++) {
                Employee emp = employeesFromEmp3.get(i);
                System.out.println("- " + emp.getName());
              }
              break;
            default:
              System.out.println("Неккоректный выбор!");
              break;
          }
        } else {
          System.out.println("Введите число!");
        }
        return manualInputMenu(scanner);
      }
    }
  }

  private int executeInputTask5() {
    System.out.println("Категория №4: Задача 5");
    System.out.println("Создаем Имена.\n" +
            "Измените сущность Имя из задачи 1.3. Новые требования включают:\n" +
            "- Имя можно создать указав только Личное имя\n" +
            "- Имя можно создать указав Личное имя и Фамилию.\n" +
            "- Имя можно создать указав все три параметра: Личное имя, Фамилию, Отчество.\n" +
            "Необходимо создать следующие имена:\n" +
            "1. Клеопатра\n" +
            "2. Александр Сергеевич Пушкин\n" +
            "3. Владимир Маяковский\n" +
            "4. Христофор Бонифатьевич (здесь Христофор это имя, а Бонифатьевич - фамилия) ");
    while (true) {
      System.out.println("Какие входные параметры вы хотите ввести? \n" +
              "1. Только имя\n" +
              "2. Фамилию, Имя и Отчество\n" +
              "3. Фамилию и Имя\n" +
              "0. Выход ");
      System.out.print("Ваш выбор: ");

      if (scanner.hasNextInt()) {
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
          case 1:
            String firstname =  inputName();
            Name firstname1 = new Name(firstname);
            System.out.println("Создано: " + firstname1.toString1());
            break;
          case 2:
            String lastname = inputLastname();
            String lastname1 = inputName();
            String lastname2 = inputSurname();
            Name firstname12 = new Name(lastname,lastname1,lastname2);
            System.out.println("Создано: " + firstname12.toString1());
            break;
          case 3:
            String surname = inputLastname();
            String surname1 = inputName();
            Name surname12 = new Name(surname,surname1);
            System.out.println("Создано: " + surname12.toString1());
            break;
          case 0:
            return manualInputMenu(scanner);

          default:
            System.out.println("Неверный выбор!");
            break;

        }
      } else {
        scanner.next();
        System.out.println("Ошибка! Введите число от 0 до 3");
      }
    }
  }

  // Альтернативная версия с более простым интерфейсом
  private void executeInputTask6() {
    System.out.println("Категория №5: Задача 1");
    System.out.println("Пистолет стреляет.\n" +
            "Создайте сущность Пистолет, которая описывается следующим образом:\n" +
            "- Имеет Количество патронов (целое число)\n" +
            "- Может быть создан с указанием начального количества патронов\n" +
            "- Может быть создан без указания начального количества патронов, в этом случае он\n" +
            "изначально заряжен пятью патронами.\n" +
            "- Может Стрелять, что приводит к выводу на экран текста “Бах!” в том случае, если\n" +
            "количество патронов больше нуля, иначе делает “Клац!”. После каждого выстрела (когда\n" +
            "вывелся “Бах!”) количество патронов уменьшается на один.\n" +
            "Создайте пистолет с тремя патронами и выстрелите из него пять раз. ");
    Gun gun = null;
    System.out.println("Выберите тип создания пистолета:");
    System.out.println("1 - С указанием количества патронов");
    System.out.println("2 - По умолчанию (5 патронов)");
    System.out.print("Ваш выбор: ");


      int creationChoice = scanner.nextInt();

      if (creationChoice == 1) {
        System.out.print("Введите количество патронов: ");
        int cartridges = scanner.nextInt();
        gun = new Gun(cartridges);
      } else if (creationChoice == 2) {
        gun = new Gun();
      } else {
        System.out.println("Неверный выбор! Создан пистолет по умолчанию.");
        gun = new Gun();
      }

      System.out.println(gun.toString());

      while (true) {
        System.out.println("\nВыберите действие:");
        System.out.println("1 - Выстрелить");
        System.out.println("2 - Проверить патроны");
        System.out.println("3 - Перезарядить");
        System.out.println("0 - Завершить");
        System.out.print("Ваш выбор: ");

        int action = scanner.nextInt();

        switch (action) {
          case 1:
            gun.fire();
            break;
          case 2:
            System.out.println("Осталось патронов: " + gun.getNumberOfCartridges());
            break;
          case 3:
            System.out.print("Введите новое количество патронов: ");
            int newCartridges = scanner.nextInt();
            gun.setNumberOfCartridges(newCartridges);
            System.out.println("Перезаряжено! Патронов: " + gun.getNumberOfCartridges());
            break;
          case 0:
            System.out.println("Завершение работы с пистолетом.");
            return;
          default:
            System.out.println("Неверный выбор!");
      }
    }
  }
  //Метод для ввода имени
  private String inputName() {

    while (true) {
      System.out.print("Введите имя: ");
      String input = scanner.nextLine();

      if (input.trim().isEmpty()) {
        System.out.println("Имя не может быть пустым");
        continue;
      }

      input = input.trim();

      if (!input.matches("[a-zA-Zа-яА-Я]+")) {
        System.out.println("Имя должно содержать только буквы!");
        continue;
      }
      return input;
    }
  }

  // Метод для ввода фамилии
  private String inputLastname() {

    while (true) {
      System.out.print("Введите Фамилию: ");
      String input = scanner.nextLine();


      if (input.trim().isEmpty()) {
        System.out.println("Фамилия не может быть пустой!");
        continue;
      }

      input = input.trim();

      if (!input.matches("[a-zA-Zа-яА-Я]+")) {
        System.out.println("Фамилия должна содержать только буквы!");
        continue;
      }

      return input;

    }
  }

  //Метод для ввода отчества
  private String inputSurname() {

    while (true) {
      System.out.print("Введите Отчество: ");
      String input = scanner.nextLine();


      if (input.trim().isEmpty()) {
        System.out.println("Отчество не может быть пустым!");
        continue;
      }

      input = input.trim();

      if (!input.matches("[a-zA-Zа-яА-Я]+")) {
        System.out.println("Отчество должно содержать только буквы!");
        continue;
      }

      return input;

    }
  }

  // Метод для ввода роста
  private double inputHeight() {
    while (true) {
      System.out.print("Введите рост (в см): ");

      if (scanner.hasNextDouble()) {
        double height = scanner.nextDouble();
        scanner.nextLine();

        // Проверяем допустимый диапазон роста
        if (height <= 0) {
          System.out.println("Рост должен быть положительным числом!");
          continue;
        }

        /*if (height > 300) {
          System.out.println("Рост не может быть больше 300 см!");
          continue;
        }

        if (height < 50) {
          System.out.println("Рост не может быть меньше 50 см!");
          continue;
        }
         */

        return height;

      } else {
        scanner.next();
        System.out.println("Ошибка! Введите числовое значение для роста.");
      }
    }
  }

  // Метод для ввода департамента
  private String inputDepartment() {
    while (true) {
      System.out.print("Введите наименование департамента: ");
      String input = scanner.nextLine();

      if (input.trim().isEmpty()) {
        System.out.println("Наименование не может быть пустым");
        continue;
      }

      input = input.trim();

      if (!input.matches("[a-zA-Zа-яА-Я]+")) {
        System.out.println("Наименование должно содержать только буквы!");
        continue;
      }
      return input;
    }
  }

}
