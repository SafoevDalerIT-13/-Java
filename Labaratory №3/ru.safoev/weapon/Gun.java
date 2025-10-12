package ru.safoev.weapon;

public class Gun extends Weapon {
    private final int maxOfCartridges;

    public Gun() {
        super(5);
        this.maxOfCartridges = 5;
    }

    public Gun(int numberOfCartridges) {
        super(numberOfCartridges);
        this.maxOfCartridges = numberOfCartridges;
    }

    public Gun(int numberOfCartridges, int maxOfCartridges) {
        super(numberOfCartridges);
        if (maxOfCartridges < numberOfCartridges) {
            System.out.println("Обойма не может быть меньше кол-ва патрон в ней! Установлено значение кол-ва патрон!");
            this.maxOfCartridges = numberOfCartridges;
        } else {
            this.maxOfCartridges = maxOfCartridges;
        }
    }

    @Override
    public void shoot() {
        if (ammo > 0) { // Прямой доступ к ammo
            ammo--; // Прямое изменение ammo
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }

    public int getNumberOfCartridges() {
        return ammo; // Прямой доступ к ammo
    }

    public int getMaxOfCartridges() {
        return this.maxOfCartridges;
    }

    // Упрощенный метод перезарядки
    public int reload(int numberOfCartridges) {
        System.out.println("Перезаряжаем пистолет...");
        if (numberOfCartridges < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным!");
        }

        int totalAmmo = ammo + numberOfCartridges; // Прямой доступ к ammo
        int res = 0;

        if (totalAmmo <= this.maxOfCartridges) {
            ammo = totalAmmo; // Прямое изменение ammo
        } else {
            res = totalAmmo - this.maxOfCartridges;
            ammo = this.maxOfCartridges; // Прямое изменение ammo
            System.out.println("Добавлено патронов: " + (numberOfCartridges - res));
            System.out.println("Кол-во лишних патрон: " + res);
        }
        System.out.println("После перезарядки: " + ammo);

        return res;
    }

    public boolean isCharged() {
        return ammo > 0; // Прямой доступ к ammo
    }

    public void chargedOrNotCharged() {
        if (isCharged()) {
            System.out.println("Пистолет заряжен!");
        } else {
            System.out.println("Пистолет разряжен!");
        }
    }

    // Упрощенный метод обнуления патронов
    public int unLoad() {
        int res = ammo; // Прямой доступ к ammo
        ammo = 0; // Прямое изменение ammo
        System.out.println("Вы разрядили пистолет! Возвращено патронов: " + res);
        return res;
    }

    @Override
    public String toString() {
        return "Вы создали пистолет, в котором обойма состоит из - " + ammo +
                " и максимальной обоймой - " + this.maxOfCartridges;
    }

    public void outMaxOfCartridges() {
        System.out.println("Максимально кол-во патронов, которых вмещает пистолет: " + this.maxOfCartridges);
    }

    public void outNumberOfCartridges() {
        System.out.println("Сейчас заряженно патрон: " + ammo); // Прямой доступ к ammo
    }

    public void fire() {
        shoot();
    }
}
