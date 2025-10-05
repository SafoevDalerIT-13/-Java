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

    // Реализация абстрактного метода shoot
    @Override
    public void shoot() {
        if (ammo() > 0) {
            getAmmo(); // Уменьшает ammo на 1
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }

    // Геттеры
    public int getNumberOfCartridges() {
        return ammo();
    }

    public int getMaxOfCartridges() {
        return this.maxOfCartridges;
    }

    // Метод для перезарядки
    public int reload(int numberOfCartridges) {
        System.out.println("Перезаряжаем пистолет...");
        if (numberOfCartridges < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным!");
        }

        int currentAmmo = ammo();
        int res = 0;

        if (currentAmmo + numberOfCartridges <= this.maxOfCartridges) {
            load(currentAmmo + numberOfCartridges);
        } else {
            res = (currentAmmo + numberOfCartridges) - this.maxOfCartridges;
            load(this.maxOfCartridges);
            System.out.println("Добавлено патронов: " + (numberOfCartridges - res));
            System.out.println("Кол-во лишних патрон: " + res);
        }
        System.out.println("После перезарядки: " + ammo());
        return res;
    }

    // Метод для проверки заряженности
    public boolean isCharged() {
        return ammo() > 0;
    }

    public void chargedOrNotCharged() {
        if (isCharged()) {
            System.out.println("Пистолет заряжен!");
        } else {
            System.out.println("Пистолет разряжен!");
        }
    }

    // Метод для обнуления патронов
    public int unLoad() {
        int res = ammo();
        load(0);
        System.out.println("Вы разрядили пистолет! Возвращено патронов: " + res);
        return res;
    }

    // toString
    @Override
    public String toString() {
        return "Вы создали пистолет, в котором обойма состоит из - " + ammo() +
                " и максимальной обоймой - " + this.maxOfCartridges;
    }

    // Дополнительные методы для вывода информации
    public void outMaxOfCartridges() {
        System.out.println("Максимально кол-во патронов, которых вмещает пистолет: " + this.maxOfCartridges);
    }

    public void outNumberOfCartridges() {
        System.out.println("Сейчас заряженно патрон: " + ammo());
    }

    // Сохраняем метод fire
    public void fire() {
        shoot();
    }
}
