public class AutomaticGun extends Gun{
    // Поле скорострельности
    private final int fireRate;

    // a) Без параметров. Скорострельность 30, вместимость 30.
    public AutomaticGun() {
        super(30,30);
        this.fireRate = 30;
    }

    // b) С указанием максимального числа патронов. Скорострельность будет равна половине обоймы
    public AutomaticGun(int maxOfCartridges) {
        super(maxOfCartridges,maxOfCartridges);
        int calculatedRate = maxOfCartridges / 2;
        if (calculatedRate < 1) {
            this.fireRate = 1;
        } else {
            this.fireRate = calculatedRate;
        }
    }

    // c) С указанием максимального количества патронов в обойме и скорострельности
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

    // Переопределяем метод fire()
    @Override
    public void fire() {
        for (int i = 0; i < this.fireRate; i++) {
            if (getNumberOfCartridges() > 0) {
                super.fire();
            } else {
                System.out.println("Патроны занчились!");
                break;
            }
        }
    }

    // Метод для стрельбы в течение N секунд
    public void fireSecond(int N) {
        if (N <= 0) {
            System.out.println("Время стрельбы должно быть положительным!");
            return;
        }

        int totalShots = N * this.fireRate;
        System.out.println("Стрельба в течение " + N + " секунд...");
        int j =0;
        for (int i = 0; i < totalShots; i++) {
            if (getNumberOfCartridges() > 0) {
                j++;
                super.fire();
            } else {
                System.out.println("Патроны закончились на " + (i + 1) + " выстреле");
                break;
            }
        }
        System.out.println("Кол-во выстрелов за " + N + " сек - " + j);

    }



}
