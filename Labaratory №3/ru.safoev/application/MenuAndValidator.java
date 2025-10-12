package ru.safoev.application;

import ru.safoev.contacts.TelephoneDirectory;
import ru.safoev.geometry.Point;
import ru.safoev.organization.Department;
import ru.safoev.organization.Employee;
import ru.safoev.person.Name;
import ru.safoev.person.Person;
import ru.safoev.weapon.AutomaticGun;
import ru.safoev.weapon.Gun;
import ru.safoev.weapon.Shooter;

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
            System.out.println("Лабораторная работа 3 (Изменение Классов)");
            System.out.println("7. Категория №1 - Задача 5");
            System.out.println("8. Категория №1 - Задача 7");
            System.out.println("9. Категория №2 - Задача 3");
            System.out.println("10. Категория №3 - Задача 4");
            System.out.println("11. Категория №4 - Задача 1");
            System.out.println("12. Категория №5 - Задача 8");
            System.out.println("13. Категория №6 - Задача 2");
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
                    case 7:
                        executeInputTask7();
                        break;
                    case 8:
                        executeInputTask8();
                        break;
                    case 9:
                        executeInputTask9();
                        break;
                    case 10:
                        executeInputTask10();
                    case 11:
                        executeInputTask11();
                    case 12:
                        executeInputTask12();
                    case 13:
                        executeInputTask13();
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
            System.out.println("Лабораторная работа 3 (Изменение Классов)");
            System.out.println("7. Категория №1 - Задача 5");
            System.out.println("8. Категория №1 - Задача 7");
            System.out.println("9. Категория №2 - Задача 3");
            System.out.println("10. Категория №3 - Задача 4");
            System.out.println("11. Категория №4 - Задача 1");
            System.out.println("12. Категория №5 - Задача 8");
            System.out.println("13. Категория №6 - Задача 2");
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
                    case 7:
                        executeAutoTask7();
                        break;
                    case 8:
                        executeAutoTask8();
                        break;
                    case 9:
                        executeAutoTask9();
                        break;
                    case 10:
                        executeAutoTask10();
                        break;
                    case 11:
                        executeAutoTask11();
                        break;
                    case 12:
                        executeAutoTask12();
                        break;
                    case 13:
                        executeAutoTask13();
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
                "Может возвращать текстовое представление вида “ru.safoev.person.Name, рост: height”, где ru.safoev.person.Name и height это\n" +
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

    private void executeAutoTask7() {
        System.out.println("Категория №1: Задача 5");
        System.out.println("Перезарядка Пистолета.\n" +
                "Измените сущность Пистолет из задачи 1.5.1. Модификация предполагает внесение следующих\n" +
                "дополнительных требований:\n" +
                "\uF0B7 Имеет максимальное количество патронов. Максимальное количество устанавливается во\n" +
                "время создания пистолета и не может быть изменено позднее. У пистолета можно узнать,\n" +
                "какое максимальное количество он вмещает.\n" +
                "\uF0B7 Может быть перезаряжен. Для перезарядки необходимо передать пистолету число,\n" +
                "которое будет означать количество заряжаемых патронов. Если передано отрицательное\n" +
                "число, необходимо выбросить ошибку, объясняющую, что отрицательного числа\n" +
                "патронов быть не может. Если передано слишком большое число патронов – необходимо\n" +
                "лишние вернуть.\n" +
                "\uF0B7 Может быть разряжен. Это приводит к обнулению патронов в пистолете и возврате\n" +
                "нужного числа пользователю.\n" +
                "\uF0B7 Можно узнать сколько сейчас заряжено патронов.\n" +
                "\uF0B7 Можно узнать заряжен он или разряжен.\n" +
                "Создайте пистолет вместимостью 7, зарядите три патрона, выстрелите из него пять раз, затем\n" +
                "зарядите в него 8 патронов, выстрелите еще 2 раза, разрядите его, сделайте контрольный\n" +
                "выстрел.\n" +
                "Если все выполнено верно, то должно быть выведено: Бах! Бах! Бах! Клац! Клац! Бах! Бах! Клац!");

        Gun gun = new Gun(0,7);
        gun.load(3);
        for(int i = 0; i < 5; i++) {
            gun.fire();
        }
        gun.load(8);
        for(int i = 0; i < 2; i++) {
            gun.fire();
        }
        gun.unLoad();
        gun.fire();

    }

    private void executeAutoTask8() {
        System.out.println("Категория №1: Задача 7");
        System.out.println("Непустые Имена.\n" +
                "Измените сущность Имя из задачи 1.4.5. Гарантируйте, что:\n" +
                "\uF0B7 Как минимум один параметр будет иметь не null значение и не пустую строку.\n" +
                "\uF0B7 Имя неизменяемо.\n" +
                "Продемонстрируйте работоспособность решения на примерах.");
        // 1. Проверка валидации - успешные случаи
        System.out.println("1. КОРРЕКТНЫЕ ОБЪЕКТЫ:");
        Name name1 = new Name("Иванов", "Иван", "Иванович");
        Name name2 = new Name("Петров", "Петр");
        Name name3 = new Name("Сидоров");
        Name name4 = new Name(null, "Мария", null);
        Name name5 = new Name("", "Анна", "");

        System.out.println("Все три поля: " + name1);
        System.out.println("Два поля: " + name2);
        System.out.println("Одно поле: " + name3);
        System.out.println("Только имя: " + name4);
        System.out.println("Только имя (с пустыми): " + name5);

        // 2. Проверка неизменяемости
        System.out.println("\n2. НЕИЗМЕНЯЕМОСТЬ:");
        Name immutableName = new Name("Сидоров", "Петр", "Иванович");
        System.out.println("Объект: " + immutableName);
        System.out.println("Геттеры: " +
                immutableName.getLastname() + ", " +
                immutableName.getFirstname() + ", " +
                immutableName.getSurname());
        System.out.println("Поля final, сеттеров нет");

        // 3. Разные форматы имен
        System.out.println("\n3. ФОРМАТЫ ВЫВОДА:");
        System.out.println(new Name("Иванов", "Иван", "Иванович"));
        System.out.println(new Name("Петрова", "Мария"));
        System.out.println(new Name("Сергей"));
        System.out.println(new Name("Кузнецов", null, null));
        System.out.println(new Name(null, null, "Павлович"));
    }

    private void executeAutoTask9() {
        System.out.println("Категория №2: Задача 3");
        System.out.println("Желтые страницы.\n" +
                "Необходимо разработать сущность ТелефонныйСправочник, который будет использоваться для\n" +
                "создания справочника со списком телефонов и имен, с целью поиска телефона по имени. Будем\n" +
                "считать достаточным хранение пар телефон-строка, например “89003337788 - Вася”.\n" +
                "Состояние сущности описывается набором пар “телефон – имя”, причем и телефон и имя являются\n" +
                "строками. В целях упрощения задачи будем считать, что одному имени всегда соответствует один\n" +
                "телефон, и один телефон соответствует одному имени.\n" +
                "Инициализация сущности выполняется без аргументов.\n" +
                "Поведение сущности описывают следующие действия:\n" +
                "\uF0B7 Добавление новой пары “телефон – имя” (как два отдельных аргумента). Конкретное\n" +
                "местоположение добавленной пары не важно. Если добавляемое имя уже есть в списке, то\n" +
                "имеющийся телефон заменяется на новый, и затем старый телефон возвращается из\n" +
                "метода.\n" +
                "\uF0B7 Удаление значения. Для удаления необходимо указать имя удаляемого контакта, после\n" +
                "чего удаляется вся пара.\n" +
                "\uF0B7 Получение значений. Для получения необходимо указать имя контакта, тогда\n" +
                "возвращается его телефон.\n" +
                "\uF0B7 Может быть приведен к строке. Строка должна представлять собой полный перечень всех\n" +
                "хранимых пар.\n" +
                "\uF0B7 Можно проверить есть ли конкретный телефон или конкретное имя в списке.\n" +
                "\uF0B7 Можно узнать текущее количество контактов.\n" +
                "\uF0B7 Можно запросить в виде массива:\n" +
                "o Все пары\n" +
                "o Все телефоны\n" +
                "o Все имена\n" +
                "\uF0B7 Можно получить массив всех имен, указав часть названия (начиная с первого символа).\n" +
                "Продемонстрируйте работоспособность решения на примерах.");

        TelephoneDirectory directory = new TelephoneDirectory();
        System.out.println("Создан новый телефонный справочник");
        System.out.println("=====================================\n");

        // 1. Добавление новых пользователей
        System.out.println("1. ДОБАВЛЕНИЕ ПОЛЬЗОВАТЕЛЕЙ");
        System.out.println("----------------------------");

        String result1 = directory.addNewUser("89003337788", "Вася");
        System.out.println("Добавлен: Вася - 89003337788");
        System.out.println("Старый телефон: " + result1);

        String result2 = directory.addNewUser("89005556699", "Петя");
        System.out.println("Добавлен: Петя - 89005556699");
        System.out.println("Старый телефон: " + result2);

        String result3 = directory.addNewUser("89004445566", "Маша");
        System.out.println("Добавлен: Маша - 89004445566");
        System.out.println("Старый телефон: " + result3);

        String result4 = directory.addNewUser("89001112233", "Валентин");
        System.out.println("Добавлен: Валентин - 89001112233");
        System.out.println("Старый телефон: " + result4);

        // 2. Вывод всего справочника
        System.out.println("\n2. ВЕСЬ СПРАВОЧНИК");
        System.out.println("-------------------");
        System.out.println(directory);

        // 3. Обновление существующего пользователя
        System.out.println("3. ОБНОВЛЕНИЕ ТЕЛЕФОНА ВАСИ");
        System.out.println("----------------------------");
        String oldPhone = directory.addNewUser("89009998877", "Вася");
        System.out.println("Новый телефон Васи: 89009998877");
        System.out.println("Старый телефон Васи: " + oldPhone);
        System.out.println("\nОбновленный справочник:");
        System.out.println(directory);

        // 4. Поиск пользователей
        System.out.println("4. ПОИСК ПОЛЬЗОВАТЕЛЕЙ");
        System.out.println("----------------------");
        String phone1 = directory.getPhone("Маша");
        System.out.println("Телефон Маши: " + phone1);

        String phone2 = directory.getPhone("Петя");
        System.out.println("Телефон Пети: " + phone2);

        String phone3 = directory.getPhone("Несуществующий");
        System.out.println("Телефон Несуществующего: " + phone3);

        // 5. Проверка наличия
        System.out.println("\n5. ПРОВЕРКА НАЛИЧИЯ");
        System.out.println("--------------------");
        directory.checkExists("Вася");
        directory.checkExists("89005556699");
        directory.checkExists("Неизвестный");

        // 6. Количество контактов
        System.out.println("\n6. КОЛИЧЕСТВО КОНТАКТОВ");
        System.out.println("-----------------------");
        directory.sizeMap();

        // 7. Получение всех пар
        System.out.println("\n7. ВСЕ ПАРЫ (МАССИВ)");
        System.out.println("---------------------");
        directory.pairsArray();

        // 8. Получение всех телефонов
        System.out.println("\n8. ВСЕ ТЕЛЕФОНЫ (МАССИВ)");
        System.out.println("-------------------------");
        directory.telephoneArray();

        // 9. Получение всех имен
        System.out.println("\n9. ВСЕ ИМЕНА (МАССИВ)");
        System.out.println("----------------------");
        directory.nameArray();

        // 10. Поиск по префиксу
        System.out.println("10. ПОИСК ПО ПРЕФИКСУ");
        System.out.println("---------------------");
        System.out.println("Поиск имен на 'Ва':");
        directory.namesArrayStartingWith("Ва");

        System.out.println("\nПоиск имен на 'Ма':");
        directory.namesArrayStartingWith("Ма");

        System.out.println("\nПоиск имен на 'Ив':");
        directory.namesArrayStartingWith("Ив");

        // 11. Удаление пользователя
        System.out.println("\n11. УДАЛЕНИЕ ПОЛЬЗОВАТЕЛЯ");
        System.out.println("-------------------------");
        System.out.println("Удаляем Петю:");
        directory.deleteUser("Петя");
        System.out.println("После удаления:");
        System.out.println(directory);

        // 12. Проверка после удаления
        System.out.println("12. ПРОВЕРКА ПОСЛЕ УДАЛЕНИЯ");
        System.out.println("---------------------------");
        directory.sizeMap();
        directory.checkExists("Петя");

        // 13. Добавление дубликата телефона
        System.out.println("\n13. ПРОВЕРКА ДУБЛИКАТОВ");
        System.out.println("-----------------------");
        System.out.println("Пытаемся добавить существующий телефон к новому имени:");
        String result5 = directory.addNewUser("89009998877", "НовыйВася");
        System.out.println("Добавлен: НовыйВася - 89009998877");
        System.out.println("Старый телефон: " + result5);
        System.out.println("\nСправочник после попытки добавления дубликата:");
        System.out.println(directory);

        // 14. Итоговый справочник
        System.out.println("14. ИТОГОВЫЙ СПРАВОЧНИК");
        System.out.println("-----------------------");
        System.out.println(directory);
    }

    private void executeAutoTask10() {
        System.out.println("Категория №3: Задача 4");
        System.out.println("Автомат. Создайте такой подвид сущности Пистолет из задачи 2.1.5, которая будет совпадать с\n" +
                "ней во всех отношениях, кроме следующего:\n" +
                "\uF0B7 Имеет скорострельность (целое число, неизменяемое) которое обозначает количество\n" +
                "выстрелов в секунду, поддерживаемое данным автоматом. Скорострельность всегда\n" +
                "положительное число.\n" +
                "\uF0B7 При вызове Стрелять количество выстрелов соответствует скорострельности (например,\n" +
                "при скорострельности 3 выводится три строки с текстом выстрела).\n" +
                "\uF0B7 Умеет Стрелять N секунд, что приводит к количеству выстрелов равному N умноженное\n" +
                "на скорострельность.\n" +
                "\uF0B7 Инициализация может быть выполнены следующими способами:\n" +
                "a) Без параметров. Скорострельность 30, вместимость 30.\n" +
                "b) С указанием максимального числа патронов. Скорострельность будет равна\n" +
                "половине обоймы\n" +
                "c) С указанием максимального количества патронов в обойме и скорострельности. ");
        System.out.println("ДЕМОНСТРАЦИЯ АВТОМАТА");
        System.out.println("=====================\n");

        // a) Без параметров
        System.out.println("1. АВТОМАТ БЕЗ ПАРАМЕТРОВ");
        System.out.println("-------------------------");
        AutomaticGun gun1 = new AutomaticGun();
        System.out.println("Скорострельность: " + gun1.getFireRate() + " выстр/сек");
        System.out.println("Вместимость: " + gun1.getMaxOfCartridges());

        gun1.reload(10);
        System.out.println("\nОдиночный огонь (" + gun1.getFireRate() + " выстрелов):");
        gun1.fire();

        System.out.println("\nСтрельба 2 секунды (" + (2 * gun1.getFireRate()) + " выстрелов):");
        gun1.fireSecond(2);
        System.out.println();

        // b) С указанием максимального числа патронов
        System.out.println("2. АВТОМАТ С ВМЕСТИМОСТЬЮ 20");
        System.out.println("----------------------------");
        AutomaticGun gun2 = new AutomaticGun(20);
        System.out.println("Вместимость: " + gun2.getMaxOfCartridges());
        System.out.println("Скорострельность (половина обоймы): " + gun2.getFireRate() + " выстр/сек");
        System.out.println("\nОдиночный огонь (" + gun2.getFireRate() + " выстрелов):");
        gun2.fire();
        System.out.println();

        // c) С указанием вместимости и скорострельности
        System.out.println("3. АВТОМАТ С ВМЕСТИМОСТЬЮ 10 И СКОРОСТРЕЛЬНОСТЬЮ 3");
        System.out.println("---------------------------------------------------");
        AutomaticGun gun3 = new AutomaticGun(10, 3);
        System.out.println("Вместимость: " + gun3.getMaxOfCartridges());
        System.out.println("Скорострельность: " + gun3.getFireRate() + " выстр/сек");
        System.out.println("\nОдиночный огонь (" + gun3.getFireRate() + " выстрелов):");
        gun3.fire();

        System.out.println("\nСтрельба 3 секунды (" + (3 * gun3.getFireRate()) + " выстрелов):");
        gun3.fireSecond(3);
        System.out.println();

    }

    private void executeAutoTask11() {
        System.out.println("Категория №4: Задача 1");
        System.out.println("Оружие.\n" +
                "Измените сущность Пистолет, полученную в задаче 2.1.5 таким образом, чтобы она наследовалась\n" +
                "от класса ru.safoev.weapon.Weapon описанного на рисунке");

        System.out.println("Создал класс ru.safoev.weapon.Weapon и применил наследование к ru.safoev.weapon.Gun! (Читать сам код!)");

        System.out.println("ДЕМОНСТРАЦИЯ WEAPON И GUN");
        System.out.println("=========================\n");

        // 1. Создание пистолетов
        System.out.println("1. СОЗДАНИЕ ПИСТОЛЕТОВ:");
        Gun gun1 = new Gun(); // по умолчанию
        Gun gun2 = new Gun(3, 10); // с параметрами

        System.out.println("Пистолет 1: " + gun1);
        System.out.println("Пистолет 2: " + gun2);
        System.out.println();

        // 2. Стрельба
        System.out.println("2. СТРЕЛЬБА:");
        System.out.println("Пистолет 1 (5 патронов):");
        for (int i = 0; i < 3; i++) {
            gun1.shoot();
        }

        System.out.println("Пистолет 2 (3 патрона):");
        for (int i = 0; i < 4; i++) {
            gun2.shoot();
        }
        System.out.println();

        // 3. Перезарядка
        System.out.println("3. ПЕРЕЗАРЯДКА:");
        gun2.reload(8); // попытка зарядить 8 при максимуме 10
        System.out.println();

        // 4. Методы ru.safoev.weapon.Weapon
        System.out.println("4. МЕТОДЫ WEAPON:");
        System.out.println("ammo(): " + gun2.ammo());
        System.out.println("getAmmo(): " + gun2.getAmmo());
        System.out.println("После getAmmo: " + gun2.ammo());

        gun2.load(5);
        System.out.println("После load(5): " + gun2.ammo());
    }

    private void executeAutoTask12() {
        System.out.println("Категория №5: Задача 8");
        System.out.println("Лучший стрелок.\n" +
                "Создайте сущность Стрелок, которая описывается:\n" +
                "\uF0B7 Имя, строка\n" +
                "\uF0B7 Оружие, из задачи 2.4.1.\n" +
                "\uF0B7 При создании объекта необходимо указать ему имя\n" +
                "\uF0B7 Имя и оружие можно поменять и получить в любой момент без ограничения.\n" +
                "Основная способность Стрелка - умение стрелять. Если оружие есть, то выстрел происходит по\n" +
                "правилам оружия, если его нет – то выводится текст “не могу участвовать в перестрелке”.\n" +
                "Создайте трех стрелков: одного без оружия, одного с пистолетом и одного с автоматом, и пусть\n" +
                "каждый из них выстрелит.");

        System.out.println("ДЕМОНСТРАЦИЯ СТРЕЛКОВ");
        System.out.println("=====================\n");

        Shooter shooter1 = new Shooter("Вася"); // без оружия
        Shooter shooter2 = new Shooter("Петя", new Gun(3));
        Shooter shooter3 = new Shooter("Коля", new AutomaticGun(10, 2));

        shooter1.shoot();
        shooter2.shoot();
        shooter3.shoot();
    }

    private void executeAutoTask13() {
        System.out.println("Категория №6: Задача 2");
        System.out.println("Сравнение точек.\n" +
                "Измените сущность Точка из задачи 1.4.1. Переопределите метод сравнения объектов по\n" +
                "состоянию таким образом, чтобы две точки считались одинаковыми тогда, когда они\n" +
                "расположены в одинаковых координатах.");

        System.out.println("СРАВНЕНИЕ ТОЧЕК");
        System.out.println("===============\n");

        Point point1 = new Point(3.5, 2.0);
        Point point2 = new Point(3.5, 2.0);
        Point point3 = new Point(1.0, 4.0);
        Point point4 = new Point(3.5, 2.0);

        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Точка 3: " + point3);
        System.out.println();

        System.out.println("point1.equals(point2): " + point1.equals(point2));
        System.out.println("point1.equals(point3): " + point1.equals(point3));
        System.out.println("point2.equals(point4): " + point2.equals(point4));

        System.out.println("point1 == point2: " + (point1 == point2));

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
                "Может возвращать текстовое представление вида “ru.safoev.person.Name, рост: height”, где ru.safoev.person.Name и height это\n" +
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
                    gun.load(newCartridges);
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

    private int executeInputTask7() {
        System.out.println("Категория №1: Задача 5");
        System.out.println("Перезарядка Пистолета.\n" +
                "Измените сущность Пистолет из задачи 1.5.1. Модификация предполагает внесение следующих\n" +
                "дополнительных требований:\n" +
                "\uF0B7 Имеет максимальное количество патронов. Максимальное количество устанавливается во\n" +
                "время создания пистолета и не может быть изменено позднее. У пистолета можно узнать,\n" +
                "какое максимальное количество он вмещает.\n" +
                "\uF0B7 Может быть перезаряжен. Для перезарядки необходимо передать пистолету число,\n" +
                "которое будет означать количество заряжаемых патронов. Если передано отрицательное\n" +
                "число, необходимо выбросить ошибку, объясняющую, что отрицательного числа\n" +
                "патронов быть не может. Если передано слишком большое число патронов – необходимо\n" +
                "лишние вернуть.\n" +
                "\uF0B7 Может быть разряжен. Это приводит к обнулению патронов в пистолете и возврате\n" +
                "нужного числа пользователю.\n" +
                "\uF0B7 Можно узнать сколько сейчас заряжено патронов.\n" +
                "\uF0B7 Можно узнать заряжен он или разряжен.\n");

        System.out.println("=== УПРАВЛЕНИЕ ПИСТОЛЕТОМ ===");


        Scanner scanner = new Scanner(System.in);
        Gun gun = null;

        while (true) {
            System.out.println("\n1. Создать пистолет");
            System.out.println("2. Перезарядить");
            System.out.println("3. Разрядить");
            System.out.println("4. Выстрелить");
            System.out.println("5. Информация");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            // Проверка ввода числа
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 5!");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Вместимость пистолета: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        scanner.next();
                        break;
                    }
                    int maxAmmo = scanner.nextInt();
                    if (maxAmmo <= 0) {
                        System.out.println("Ошибка: вместимость должна быть положительной!");
                        break;
                    }

                    // Спросить про начальные патроны
                    System.out.print("Зарядить патроны при создании? (1-да, 0-нет): ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Ошибка: введите 1 или 0!");
                        scanner.next();
                        break;
                    }
                    int loadChoice = scanner.nextInt();

                    if (loadChoice == 1) {
                        System.out.print("Сколько патронов зарядить: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int initialAmmo = scanner.nextInt();
                        if (initialAmmo < 0) {
                            System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                            break;
                        }
                        if (initialAmmo > maxAmmo) {
                            System.out.println("Ошибка: количество патронов не может быть больше вместимости!");
                            break;
                        }
                        gun = new Gun(initialAmmo, maxAmmo);
                        System.out.println("Пистолет создан с " + initialAmmo + " патронами!");
                    } else {
                        gun = new Gun(0, maxAmmo);
                        System.out.println("Пистолет создан без патронов!");
                    }
                    break;

                case 2:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    System.out.print("Сколько патронов зарядить: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        scanner.next();
                        break;
                    }
                    int ammoLoad = scanner.nextInt();
                    if (ammoLoad < 0) {
                        System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                        break;
                    }
                    try {
                        gun.reload(ammoLoad);
                    } catch (Exception e) {
                        System.out.println("Ошибка при перезарядке: " + e.getMessage());
                    }
                    break;

                case 3:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    try {
                        gun.unLoad();
                    } catch (Exception e) {
                        System.out.println("Ошибка при разрядке: " + e.getMessage());
                    }
                    break;

                case 4:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    System.out.print("Сколько раз выстрелить: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        scanner.next();
                        break;
                    }
                    int shots = scanner.nextInt();
                    if (shots <= 0) {
                        System.out.println("Ошибка: количество выстрелов должно быть положительным!");
                        break;
                    }
                    try {
                        System.out.println("Стрельба...");
                        for (int i = 0; i < shots; i++) {
                            System.out.print("Выстрел " + (i + 1) + ": ");
                            gun.fire();
                            if (gun.getNumberOfCartridges() == 0) {
                                System.out.println("Патроны закончились!");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка при выстреле: " + e.getMessage());
                    }
                    break;

                case 5:
                    if (gun == null) {
                        System.out.println("Пистолет не создан!");
                        break;
                    }
                    try {
                        gun.outNumberOfCartridges();
                        gun.outMaxOfCartridges();
                        gun.chargedOrNotCharged();
                    } catch (Exception e) {
                        System.out.println("Ошибка при получении информации: " + e.getMessage());
                    }
                    break;

                case 0:
                    return manualInputMenu(scanner);

                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 5");
            }
        }
    }

    private int executeInputTask8() {
        System.out.println("Категория №1: Задача 7");
        System.out.println("Непустые Имена.\n" +
                "Измените сущность Имя из задачи 1.4.5. Гарантируйте, что:\n" +
                "\uF0B7 Как минимум один параметр будет иметь не null значение и не пустую строку.\n" +
                "\uF0B7 Имя неизменяемо.\n");

        System.out.println("=== СОЗДАНИЕ ИМЕНИ ===");

        while (true) {
            System.out.println("\n1. Создать имя (все три поля)");
            System.out.println("2. Создать имя (только фамилия и имя)");
            System.out.println("3. Создать имя (только фамилия)");
            System.out.println("4. Показать информацию об имени");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 4!");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Фамилия: ");
                        String lastname = scanner.nextLine();
                        System.out.print("Имя: ");
                        String firstname = scanner.nextLine();
                        System.out.print("Отчество: ");
                        String surname = scanner.nextLine();

                        Name name = new Name(lastname, firstname, surname);
                        System.out.println("Имя создано: " + name);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Фамилия: ");
                        String lastname = scanner.nextLine();
                        System.out.print("Имя: ");
                        String firstname = scanner.nextLine();

                        Name name = new Name(lastname, firstname);
                        System.out.println("Имя создано: " + name);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Фамилия: ");
                        String lastname = scanner.nextLine();

                        Name name = new Name(lastname);
                        System.out.println("Имя создано: " + name);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Фамилия: ");
                        String lastname = scanner.nextLine();
                        System.out.print("Имя: ");
                        String firstname = scanner.nextLine();
                        System.out.print("Отчество: ");
                        String surname = scanner.nextLine();

                        Name name = new Name(lastname, firstname, surname);
                        System.out.println("\nИнформация об имени:");
                        System.out.println("Полное имя: " + name);
                        System.out.println("Фамилия: " + name.getLastname());
                        System.out.println("Имя: " + name.getFirstname());
                        System.out.println("Отчество: " + name.getSurname());
                        System.out.println("Обязательное поле заполнено: ДА");
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 0:
                    return manualInputMenu(scanner);

                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 4");
            }
        }
    }
    private int executeInputTask9() {
        System.out.println("Категория №1: Задача 9");
        System.out.println("Желтые страницы.\n" +
                "Необходимо разработать сущность ТелефонныйСправочник, который будет использоваться для\n" +
                "создания справочника со списком телефонов и имен, с целью поиска телефона по имени.\n");

        TelephoneDirectory directory = new TelephoneDirectory();

        System.out.println("=== ТЕЛЕФОННЫЙ СПРАВОЧНИК ===");

        while (true) {
            System.out.println("\n1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Найти телефон по имени");
            System.out.println("4. Проверить наличие");
            System.out.println("5. Показать все контакты");
            System.out.println("6. Количество контактов");
            System.out.println("7. Получить все телефоны");
            System.out.println("8. Получить все имена");
            System.out.println("9. Поиск по началу имени");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 9!");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Введите имя: ");
                        String name = scanner.nextLine();
                        System.out.print("Введите телефон: ");
                        String phone = scanner.nextLine();

                        if (name.trim().isEmpty() || phone.trim().isEmpty()) {
                            System.out.println("Ошибка: имя и телефон не могут быть пустыми!");
                            break;
                        }

                        String oldPhone = directory.addNewUser(phone, name);
                        if (oldPhone != null) {
                            System.out.println("Контакт обновлен! Старый телефон: " + oldPhone);
                        } else {
                            System.out.println("Контакт добавлен!");
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Введите имя для удаления: ");
                        String name = scanner.nextLine();

                        if (name.trim().isEmpty()) {
                            System.out.println("Ошибка: имя не может быть пустым!");
                            break;
                        }

                        directory.deleteUser(name);
                        System.out.println("Контакт удален!");
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Введите имя для поиска: ");
                        String name = scanner.nextLine();

                        if (name.trim().isEmpty()) {
                            System.out.println("Ошибка: имя не может быть пустым!");
                            break;
                        }

                        String phone = directory.getPhone(name);
                        if (phone != null) {
                            System.out.println("Телефон: " + phone);
                        } else {
                            System.out.println("Контакт не найден!");
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Введите имя или телефон для проверки: ");
                        String key = scanner.nextLine();

                        if (key.trim().isEmpty()) {
                            System.out.println("Ошибка: введите значение для поиска!");
                            break;
                        }

                        directory.checkExists(key);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        System.out.println(directory);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 6:
                    try {
                        directory.sizeMap();
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 7:
                    try {
                        directory.telephoneArray();
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 8:
                    try {
                        directory.nameArray();
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 9:
                    try {
                        System.out.print("Введите начало имени для поиска: ");
                        String prefix = scanner.nextLine();

                        if (prefix.trim().isEmpty()) {
                            System.out.println("Ошибка: введите начало имени!");
                            break;
                        }

                        directory.namesArrayStartingWith(prefix);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 0:
                    return manualInputMenu(scanner);

                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 9");
            }
        }
    }

    private int executeInputTask10() {
        System.out.println("Категория №1: Задача 10");
        System.out.println("Автомат.\n" +
                "Создайте такой подвид сущности Пистолет, которая будет совпадать с\n" +
                "ней во всех отношениях, кроме следующего:\n" +
                "• Имеет скорострельность\n" +
                "• При вызове Стрелять количество выстрелов соответствует скорострельности\n" +
                "• Умеет Стрелять N секунд\n");

        AutomaticGun gun = null;

        System.out.println("=== УПРАВЛЕНИЕ АВТОМАТОМ ===");

        while (true) {
            System.out.println("\n1. Создать автомат (по умолчанию)");
            System.out.println("2. Создать автомат (с вместимостью)");
            System.out.println("3. Создать автомат (с вместимостью и скорострельностью)");
            System.out.println("4. Перезарядить");
            System.out.println("5. Разрядить");
            System.out.println("6. Одиночный огонь");
            System.out.println("7. Стрельба N секунд");
            System.out.println("8. Информация");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 8!");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        gun = new AutomaticGun();
                        System.out.println("Автомат создан по умолчанию!");
                        System.out.println("Вместимость: 30, Скорострельность: 30");
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Введите вместимость автомата: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int maxAmmo = scanner.nextInt();
                        if (maxAmmo <= 0) {
                            System.out.println("Ошибка: вместимость должна быть положительной!");
                            break;
                        }
                        gun = new AutomaticGun(maxAmmo);
                        System.out.println("Автомат создан!");
                        System.out.println("Вместимость: " + maxAmmo + ", Скорострельность: " + gun.getFireRate());
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Введите вместимость автомата: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int maxAmmo = scanner.nextInt();
                        if (maxAmmo <= 0) {
                            System.out.println("Ошибка: вместимость должна быть положительной!");
                            break;
                        }
                        System.out.print("Введите скорострельность: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int fireRate = scanner.nextInt();
                        if (fireRate <= 0) {
                            System.out.println("Ошибка: скорострельность должна быть положительной!");
                            break;
                        }
                        gun = new AutomaticGun(maxAmmo, fireRate);
                        System.out.println("Автомат создан!");
                        System.out.println("Вместимость: " + maxAmmo + ", Скорострельность: " + gun.getFireRate());
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 4:
                    if (gun == null) {
                        System.out.println("Сначала создайте автомат!");
                        break;
                    }
                    System.out.print("Сколько патронов зарядить: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        scanner.next();
                        break;
                    }
                    int ammoLoad = scanner.nextInt();
                    if (ammoLoad < 0) {
                        System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                        break;
                    }
                    try {
                        gun.reload(ammoLoad);
                    } catch (Exception e) {
                        System.out.println("Ошибка при перезарядке: " + e.getMessage());
                    }
                    break;

                case 5:
                    if (gun == null) {
                        System.out.println("Сначала создайте автомат!");
                        break;
                    }
                    try {
                        gun.unLoad();
                    } catch (Exception e) {
                        System.out.println("Ошибка при разрядке: " + e.getMessage());
                    }
                    break;

                case 6:
                    if (gun == null) {
                        System.out.println("Сначала создайте автомат!");
                        break;
                    }
                    try {
                        System.out.println("Одиночный огонь (" + gun.getFireRate() + " выстрелов):");
                        gun.fire();
                    } catch (Exception e) {
                        System.out.println("Ошибка при стрельбе: " + e.getMessage());
                    }
                    break;

                case 7:
                    if (gun == null) {
                        System.out.println("Сначала создайте автомат!");
                        break;
                    }
                    System.out.print("Введите время стрельбы в секундах: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        scanner.next();
                        break;
                    }
                    int seconds = scanner.nextInt();
                    if (seconds <= 0) {
                        System.out.println("Ошибка: время должно быть положительным!");
                        break;
                    }
                    try {
                        gun.fireSecond(seconds);
                    } catch (Exception e) {
                        System.out.println("Ошибка при стрельбе: " + e.getMessage());
                    }
                    break;

                case 8:
                    if (gun == null) {
                        System.out.println("Автомат не создан!");
                        break;
                    }
                    try {
                        gun.outNumberOfCartridges();
                        gun.outMaxOfCartridges();
                        gun.chargedOrNotCharged();
                        System.out.println("Скорострельность: " + gun.getFireRate() + " выстр/сек");
                    } catch (Exception e) {
                        System.out.println("Ошибка при получении информации: " + e.getMessage());
                    }
                    break;

                case 0:
                    return manualInputMenu(scanner);

                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 8");
            }
        }
    }

    private int executeInputTask11() {
        System.out.println("Категория №1: Задача 11");
        System.out.println("Оружие.\n" +
                "Измените сущность Пистолет таким образом, чтобы она наследовалась\n" +
                "от класса ru.safoev.weapon.Weapon\n");

        Gun gun = null;

        System.out.println("=== ДЕМОНСТРАЦИЯ НАСЛЕДОВАНИЯ WEAPON ===");

        while (true) {
            System.out.println("\n1. Создать пистолет (по умолчанию)");
            System.out.println("2. Создать пистолет (с патронами)");
            System.out.println("3. Создать пистолет (с патронами и вместимостью)");
            System.out.println("4. Методы ru.safoev.weapon.Weapon - ammo()");
            System.out.println("5. Методы ru.safoev.weapon.Weapon - getAmmo()");
            System.out.println("6. Методы ru.safoev.weapon.Weapon - load()");
            System.out.println("7. Метод ru.safoev.weapon.Gun - shoot()");
            System.out.println("8. Метод ru.safoev.weapon.Gun - reload()");
            System.out.println("9. Метод ru.safoev.weapon.Gun - unLoad()");
            System.out.println("10. Информация о пистолете");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 10!");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        gun = new Gun();
                        System.out.println("Пистолет создан по умолчанию!");
                        System.out.println(gun);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Введите количество патронов: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int ammo = scanner.nextInt();
                        if (ammo < 0) {
                            System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                            break;
                        }
                        gun = new Gun(ammo);
                        System.out.println("Пистолет создан!");
                        System.out.println(gun);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Введите количество патронов: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int ammo = scanner.nextInt();
                        if (ammo < 0) {
                            System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                            break;
                        }
                        System.out.print("Введите вместимость: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int maxAmmo = scanner.nextInt();
                        if (maxAmmo <= 0) {
                            System.out.println("Ошибка: вместимость должна быть положительной!");
                            break;
                        }
                        gun = new Gun(ammo, maxAmmo);
                        System.out.println("Пистолет создан!");
                        System.out.println(gun);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 4:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    try {
                        int currentAmmo = gun.ammo();
                        System.out.println("ammo() = " + currentAmmo);
                        System.out.println("Текущее количество патронов: " + currentAmmo);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 5:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    try {
                        boolean result = gun.getAmmo();
                        System.out.println("getAmmo() = " + result);
                        System.out.println("После getAmmo() патронов: " + gun.ammo());
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 6:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    try {
                        System.out.print("Введите новое количество патронов для load(): ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int newAmmo = scanner.nextInt();
                        if (newAmmo < 0) {
                            System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                            break;
                        }
                        int oldAmmo = gun.load(newAmmo);
                        System.out.println("load(" + newAmmo + ") вернул: " + oldAmmo);
                        System.out.println("Теперь патронов: " + gun.ammo());
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 7:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    try {
                        System.out.println("Вызов shoot():");
                        gun.shoot();
                        System.out.println("Осталось патронов: " + gun.ammo());
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 8:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    try {
                        System.out.print("Введите количество патронов для перезарядки: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int reloadAmmo = scanner.nextInt();
                        if (reloadAmmo < 0) {
                            System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                            break;
                        }
                        int extra = gun.reload(reloadAmmo);
                        System.out.println("Лишние патроны: " + extra);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 9:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    try {
                        int returned = gun.unLoad();
                        System.out.println("Возвращено патронов: " + returned);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 10:
                    if (gun == null) {
                        System.out.println("Пистолет не создан!");
                        break;
                    }
                    try {
                        System.out.println("\n=== ИНФОРМАЦИЯ О ПИСТОЛЕТЕ ===");
                        System.out.println("Класс: " + gun.getClass().getSimpleName());
                        System.out.println("Родитель: ru.safoev.weapon.Weapon");
                        System.out.println("Методы ru.safoev.weapon.Weapon:");
                        System.out.println("  - ammo(): " + gun.ammo());
                        System.out.println("  - getAmmo(): уменьшает патроны на 1");
                        System.out.println("  - load(): устанавливает новое количество патронов");
                        System.out.println("Методы ru.safoev.weapon.Gun:");
                        System.out.println("  - shoot(): " + (gun.ammo() > 0 ? "Бах!" : "Клац!"));
                        System.out.println("  - reload(): перезарядка с учетом вместимости");
                        System.out.println("  - unLoad(): разрядка пистолета");
                        gun.outNumberOfCartridges();
                        gun.outMaxOfCartridges();
                        gun.chargedOrNotCharged();
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 0:
                    return manualInputMenu(scanner);

                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 10");
            }
        }
    }

    private int executeInputTask12() {
        System.out.println("Категория №1: Задача 12");
        System.out.println("Лучший стрелок.\n" +
                "Создайте сущность Стрелок, которая описывается:\n" +
                "• Имя, строка\n" +
                "• Оружие\n" +
                "• При создании объекта необходимо указать ему имя\n" +
                "• Имя и оружие можно поменять и получить в любой момент\n");

        Scanner scanner = new Scanner(System.in);
        Shooter shooter = null;

        System.out.println("=== УПРАВЛЕНИЕ СТРЕЛКОМ ===");

        while (true) {
            System.out.println("\n1. Создать стрелка (без оружия)");
            System.out.println("2. Создать стрелка (с пистолетом)");
            System.out.println("3. Создать стрелка (с автоматом)");
            System.out.println("4. Изменить имя стрелка");
            System.out.println("5. Изменить оружие стрелка");
            System.out.println("6. Получить информацию о стрелке");
            System.out.println("7. Стрелок стреляет");
            System.out.println("8. Демонстрация трех стрелков");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 8!");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Введите имя стрелка: ");
                        String name = scanner.nextLine();
                        if (name.trim().isEmpty()) {
                            System.out.println("Ошибка: имя не может быть пустым!");
                            break;
                        }
                        shooter = new Shooter(name);
                        System.out.println("Стрелок создан: " + shooter);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Введите имя стрелка: ");
                        String name = scanner.nextLine();
                        if (name.trim().isEmpty()) {
                            System.out.println("Ошибка: имя не может быть пустым!");
                            break;
                        }
                        System.out.print("Введите вместимость пистолета: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int capacity = scanner.nextInt();
                        if (capacity <= 0) {
                            System.out.println("Ошибка: вместимость должна быть положительной!");
                            break;
                        }
                        Gun gun = new Gun(0, capacity);
                        System.out.print("Зарядить патроны? (1-да, 0-нет): ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int loadChoice = scanner.nextInt();
                        if (loadChoice == 1) {
                            System.out.print("Сколько патронов зарядить: ");
                            if (!scanner.hasNextInt()) {
                                System.out.println("Ошибка: введите число!");
                                scanner.next();
                                break;
                            }
                            int ammo = scanner.nextInt();
                            if (ammo < 0) {
                                System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                                break;
                            }
                            gun.reload(ammo);
                        }
                        shooter = new Shooter(name, gun);
                        System.out.println("Стрелок с пистолетом создан: " + shooter);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Введите имя стрелка: ");
                        String name = scanner.nextLine();
                        if (name.trim().isEmpty()) {
                            System.out.println("Ошибка: имя не может быть пустым!");
                            break;
                        }
                        System.out.print("Введите вместимость автомата: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int capacity = scanner.nextInt();
                        if (capacity <= 0) {
                            System.out.println("Ошибка: вместимость должна быть положительной!");
                            break;
                        }
                        System.out.print("Введите скорострельность: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int fireRate = scanner.nextInt();
                        if (fireRate <= 0) {
                            System.out.println("Ошибка: скорострельность должна быть положительной!");
                            break;
                        }
                        AutomaticGun autoGun = new AutomaticGun(capacity, fireRate);
                        System.out.print("Зарядить патроны? (1-да, 0-нет): ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int loadChoice = scanner.nextInt();
                        if (loadChoice == 1) {
                            System.out.print("Сколько патронов зарядить: ");
                            if (!scanner.hasNextInt()) {
                                System.out.println("Ошибка: введите число!");
                                scanner.next();
                                break;
                            }
                            int ammo = scanner.nextInt();
                            if (ammo < 0) {
                                System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                                break;
                            }
                            autoGun.reload(ammo);
                        }
                        shooter = new Shooter(name, autoGun);
                        System.out.println("Стрелок с автоматом создан: " + shooter);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 4:
                    if (shooter == null) {
                        System.out.println("Сначала создайте стрелка!");
                        break;
                    }
                    try {
                        System.out.print("Введите новое имя: ");
                        String newName = scanner.nextLine();
                        if (newName.trim().isEmpty()) {
                            System.out.println("Ошибка: имя не может быть пустым!");
                            break;
                        }
                        shooter.setName(newName);
                        System.out.println("Имя изменено на: " + shooter.getName());
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 5:
                    if (shooter == null) {
                        System.out.println("Сначала создайте стрелка!");
                        break;
                    }
                    try {
                        System.out.println("Выберите оружие:");
                        System.out.println("1. Без оружия");
                        System.out.println("2. Пистолет");
                        System.out.println("3. Автомат");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int weaponChoice = scanner.nextInt();

                        switch (weaponChoice) {
                            case 1:
                                shooter.setWeapon(null);
                                System.out.println("Оружие удалено");
                                break;
                            case 2:
                                System.out.print("Введите вместимость пистолета: ");
                                if (!scanner.hasNextInt()) {
                                    System.out.println("Ошибка: введите число!");
                                    scanner.next();
                                    break;
                                }
                                int capacity = scanner.nextInt();
                                Gun gun = new Gun(0, capacity);
                                shooter.setWeapon(gun);
                                System.out.println("Пистолет установлен");
                                break;
                            case 3:
                                System.out.print("Введите вместимость автомата: ");
                                if (!scanner.hasNextInt()) {
                                    System.out.println("Ошибка: введите число!");
                                    scanner.next();
                                    break;
                                }
                                int autoCapacity = scanner.nextInt();
                                System.out.print("Введите скорострельность: ");
                                if (!scanner.hasNextInt()) {
                                    System.out.println("Ошибка: введите число!");
                                    scanner.next();
                                    break;
                                }
                                int fireRate = scanner.nextInt();
                                AutomaticGun autoGun = new AutomaticGun(autoCapacity, fireRate);
                                shooter.setWeapon(autoGun);
                                System.out.println("Автомат установлен");
                                break;
                            default:
                                System.out.println("Неверный выбор!");
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 6:
                    if (shooter == null) {
                        System.out.println("Стрелок не создан!");
                        break;
                    }
                    try {
                        System.out.println("\n=== ИНФОРМАЦИЯ О СТРЕЛКЕ ===");
                        System.out.println("Имя: " + shooter.getName());
                        System.out.println("Оружие: " + (shooter.getWeapon() != null ?
                                shooter.getWeapon().getClass().getSimpleName() : "нет оружия"));
                        if (shooter.getWeapon() != null) {
                            if (shooter.getWeapon() instanceof Gun) {
                                Gun gun = (Gun) shooter.getWeapon();
                                System.out.println("Патронов: " + gun.ammo());
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 7:
                    if (shooter == null) {
                        System.out.println("Сначала создайте стрелка!");
                        break;
                    }
                    try {
                        System.out.print("Сколько раз стрелять: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        int shots = scanner.nextInt();
                        if (shots <= 0) {
                            System.out.println("Ошибка: количество выстрелов должно быть положительным!");
                            break;
                        }
                        for (int i = 0; i < shots; i++) {
                            shooter.shoot();
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 8:
                    try {
                        System.out.println("\n=== ДЕМОНСТРАЦИЯ ТРЕХ СТРЕЛКОВ ===");

                        // Стрелок без оружия
                        Shooter shooter1 = new Shooter("Вася");
                        System.out.println(shooter1);
                        shooter1.shoot();

                        // Стрелок с пистолетом
                        Shooter shooter2 = new Shooter("Петя", new Gun(3, 10));
                        System.out.println(shooter2);
                        shooter2.shoot();

                        // Стрелок с автоматом
                        Shooter shooter3 = new Shooter("Коля", new AutomaticGun(10, 3));
                        ((AutomaticGun) shooter3.getWeapon()).reload(5);
                        System.out.println(shooter3);
                        shooter3.shoot();

                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 0:
                    return manualInputMenu(scanner);

                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 8");
            }
        }
    }

    private int executeInputTask13() {
        System.out.println("Категория №1: Задача 13");
        System.out.println("Сравнение точек.\n" +
                "Переопределите метод сравнения объектов по состоянию таким образом,\n" +
                "чтобы две точки считались одинаковыми тогда, когда они расположены\n" +
                "в одинаковых координатах.\n");

        Point point1 = null;
        Point point2 = null;

        System.out.println("=== СРАВНЕНИЕ ТОЧЕК ===");

        while (true) {
            System.out.println("\n1. Создать первую точку");
            System.out.println("2. Создать вторую точку");
            System.out.println("3. Сравнить точки");
            System.out.println("4. Показать информацию о точках");
            System.out.println("5. Демонстрация сравнения");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 5!");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Введите координату X: ");
                        if (!scanner.hasNextDouble()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        double x1 = scanner.nextDouble();
                        System.out.print("Введите координату Y: ");
                        if (!scanner.hasNextDouble()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        double y1 = scanner.nextDouble();
                        point1 = new Point(x1, y1);
                        System.out.println("Первая точка создана: " + point1);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Введите координату X: ");
                        if (!scanner.hasNextDouble()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        double x2 = scanner.nextDouble();
                        System.out.print("Введите координату Y: ");
                        if (!scanner.hasNextDouble()) {
                            System.out.println("Ошибка: введите число!");
                            scanner.next();
                            break;
                        }
                        double y2 = scanner.nextDouble();
                        point2 = new Point(x2, y2);
                        System.out.println("Вторая точка создана: " + point2);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 3:
                    if (point1 == null || point2 == null) {
                        System.out.println("Сначала создайте обе точки!");
                        break;
                    }
                    try {
                        boolean areEqual = point1.equals(point2);
                        System.out.println("Точка 1: " + point1);
                        System.out.println("Точка 2: " + point2);
                        System.out.println("Точки равны: " + areEqual);

                        if (areEqual) {
                            System.out.println("✓ Точки имеют одинаковые координаты");
                        } else {
                            System.out.println("✗ Точки имеют разные координаты");
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.println("\n=== ИНФОРМАЦИЯ О ТОЧКАХ ===");
                        if (point1 != null) {
                            System.out.println("Точка 1:");
                            System.out.println("  Координаты: (" + point1.getX() + ", " + point1.getY() + ")");
                            System.out.println("  toString: " + point1);
                        } else {
                            System.out.println("Точка 1: не создана");
                        }

                        if (point2 != null) {
                            System.out.println("Точка 2:");
                            System.out.println("  Координаты: (" + point2.getX() + ", " + point2.getY() + ")");
                            System.out.println("  toString: " + point2);
                        } else {
                            System.out.println("Точка 2: не создана");
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        System.out.println("\n=== ДЕМОНСТРАЦИЯ СРАВНЕНИЯ ===");

                        // Создаем тестовые точки
                        Point p1 = new Point(3.5, 2.0);
                        Point p2 = new Point(3.5, 2.0);
                        Point p3 = new Point(1.0, 4.0);
                        Point p4 = new Point(3.5, 2.0);

                        System.out.println("Точка A: " + p1);
                        System.out.println("Точка B: " + p2);
                        System.out.println("Точка C: " + p3);
                        System.out.println("Точка D: " + p4);
                        System.out.println();

                        System.out.println("A.equals(B): " + p1.equals(p2) + " (одинаковые координаты)");
                        System.out.println("A.equals(C): " + p1.equals(p3) + " (разные координаты)");
                        System.out.println("B.equals(D): " + p2.equals(p4) + " (одинаковые координаты)");
                        System.out.println("A == B: " + (p1 == p2) + " (разные объекты в памяти)");

                        System.out.println("\nВывод: метод equals() сравнивает координаты, а не ссылки на объекты");

                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 0:
                    return manualInputMenu(scanner);

                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 5");
            }
        }
    }
}
