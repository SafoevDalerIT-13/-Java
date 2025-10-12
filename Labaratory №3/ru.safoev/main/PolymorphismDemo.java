package ru.safoev.main;

import ru.safoev.weapon.Shooter;
import ru.safoev.weapon.Gun;
import ru.safoev.weapon.AutomaticGun;

public class PolymorphismDemo {

    // Методы 2.5.8
    public static void demonstrateShooters() {
        System.out.println("=== Демонстрация полиморфизма со стрелками ===");

        // Создаем стрелков с разным оружием
        Shooter shooter1 = new Shooter("Стрелок без оружия");
        Shooter shooter2 = new Shooter("Стрелок с пистолетом", new Gun(3, 10));
        Shooter shooter3 = new Shooter("Стрелок с автоматом", new AutomaticGun(20, 5));

        // Заряжаем оружие
        ((Gun) shooter2.getWeapon()).reload(5);
        ((AutomaticGun) shooter3.getWeapon()).reload(15);

        // Демонстрация полиморфной стрельбы
        Shooter[] shooters = {shooter1, shooter2, shooter3};
        for (Shooter shooter : shooters) {
            System.out.println("\n" + shooter.getName() + ":");
            shooter.shoot();
        }
    }
}
