package ru.safoev.weapon;

public class AutomaticGun extends Gun {
    private final int fireRate;

    public final int getFireRate() {
        return this.fireRate;
    }

    public AutomaticGun() {
        super(30, 30);
        this.fireRate = 30;
    }

    public AutomaticGun(int maxOfCartridges) {
        super(maxOfCartridges, maxOfCartridges);
        int calculatedRate = maxOfCartridges / 2;
        if (calculatedRate < 1) {
            this.fireRate = 1;
        } else {
            this.fireRate = calculatedRate;
        }
    }

    public AutomaticGun(int maxOfCartridges, int fireRate) {
        super(maxOfCartridges, maxOfCartridges);
        if (fireRate <= 0) {
            throw new IllegalArgumentException("Скорострельность должна быть положительным числом!");
        }
        if (maxOfCartridges <= 0) {
            throw new IllegalArgumentException("Вместимость должна быть положительным числом!");
        }
        this.fireRate = fireRate;
    }

    @Override
    public void fire() {
        for (int i = 0; i < this.fireRate; i++) {
            if (ammo > 0) { // Прямой доступ к ammo
                super.fire();
            } else {
                System.out.println("Патроны закончились!");
                break;
            }
        }
    }

    public void fireSecond(int N) {
        if (N <= 0) {
            System.out.println("Время стрельбы должно быть положительным!");
            return;
        }

        int totalShots = N * this.fireRate;
        System.out.println("Стрельба в течение " + N + " секунд...");
        int j = 0;
        for (int i = 0; i < totalShots; i++) {
            if (ammo > 0) { // Прямой доступ к ammo
                super.fire();
                j++;
            } else {
                System.out.println("Патроны закончились на " + (i + 1) + " выстреле");
                break;
            }
        }
        System.out.println("Кол-во выстрелов за " + N + " сек - " + j);
    }
}
