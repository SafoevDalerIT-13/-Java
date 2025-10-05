import ru.safoev.geometry.Point;

public class Main {
    public static void main(String[] args) {
        //MenuAndValidator menu = new MenuAndValidator();
        //menu.menu();

        // 3 Лаба
        // Категория №1: Задание 5
//        Gun gun = new Gun(0, 7); // создаем пустой пистолет с максимумом 7
//        gun.reload(3);
//        for (int i = 0; i < 5; i++) {
//            gun.fire();
//        }
//        gun.reload(8);
//        for (int i = 0; i < 2; i++) {
//            gun.fire();
//        }
//        gun.unLoad();
//        gun.fire();

        //Задание 7
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


        //Категория №2: Задание 3
        TelephoneDirectory user1 = new TelephoneDirectory();
        user1.addNewUser("45454","Далер");
        user1.addNewUser("333333","Кирилл");
        user1.deleteUser("Кирилл");

        System.out.println(user1);

        //Категория №3: Задание 4
        AutomaticGun automaticGun1 = new AutomaticGun(600,30);
        //Все сделано, но примеры хз какие

        //Категория №4: Задание 1
        //Сделал, но примеры хз

        // Категория №5: Задание
        Shooter shooter1 = new Shooter("Васька");
        Shooter shooter2 = new Shooter("Гришка",new Gun());
        Shooter shooter3 = new Shooter("Антошка", new AutomaticGun());

        shooter1.shoot();
        shooter2.shoot();
        shooter3.shoot();

        // Категория №6: Задание 2
        Point point1 = new Point(2.6,4.1);
        Point point2 = new Point(2.6,4.1);
        System.out.println(point1.equals(point2));

        // Категория №7: Задание
































    }
}
