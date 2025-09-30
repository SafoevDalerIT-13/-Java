import static java.lang.Math.abs;

public class Gun {
    // Поля
    private int numberOfCartridges;
    private final int maxOfCartridges;


    // Геттеры и сеттеры
    public int getNumberOfCartridges() {
        System.out.print("Кол-во заряженных патрон в пистолете: ");
        return this.numberOfCartridges;
    }

    public int getMaxOfCartridges() {
        System.out.print("Максимально кол-во патронов, которых вмещает пистолет: ");
        return this.maxOfCartridges;
    }

    public void setNumberOfCartridges(int numberOfCartridges) {
        if(numberOfCartridges < 0) {
            System.out.println("Количество патрон не может быть отрицательным! Установлено значение по умолчанию - 5! ");
            this.numberOfCartridges = 5;

        } else {
            this.numberOfCartridges = numberOfCartridges;
        }
    }

    // Конструкторы
    public Gun() {
        this.numberOfCartridges = 5;
        this.maxOfCartridges = 5;
    }
    public Gun(int numberOfCartridges) {
        setNumberOfCartridges(numberOfCartridges);
        this.maxOfCartridges = this.numberOfCartridges; // Используем уже установленное значение
    }


    public  Gun(int numberOfCartridges, int maxOfCartridges) {
        setNumberOfCartridges(numberOfCartridges);
        if(maxOfCartridges < numberOfCartridges) {
            System.out.println("Обоима не может быть меньше кол-ва патрон в ней! Установлено значение кол-ва патрон!");
            this.maxOfCartridges = numberOfCartridges;
        } else {
            this.maxOfCartridges = maxOfCartridges;
        }
    }

    // Метод to_string
    @Override
    public String toString() {
        return "Вы создали пистолет, в котором обоима состоит из - " + this.numberOfCartridges
                + " и максимальной обоимой - " + this.maxOfCartridges;
    }

    // Метод для выстрела
    public void fire() {

        if(this.numberOfCartridges > 0) {
            this.numberOfCartridges -= 1;
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }

    // Если нужен иммено отдельный метод с выводом макс. патрон, то ->
    public void outMaxOfCartridges() {
        System.out.print("Максимально кол-во патронов, которых вмещает пистолет: ");
        System.out.println(this.maxOfCartridges);
    }

    // Если нужен иммено отдельный метод с выводом заряженных патрон, то ->
    public void outNumberOfCartridges() {
        System.out.print("Сейчас заряженно патрон: ");
        System.out.println(this.numberOfCartridges);
    }


    // Метод для перезарядки(Исключение можно кидать через try, но catch не выполнится не логично)
    public int reload(int numberOfCartridges) {
        System.out.println("Перезарежаем пистолет...");
        if(numberOfCartridges < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным!");
        }
        int res = 0;
        if(this.numberOfCartridges + numberOfCartridges <= this.maxOfCartridges) {
            this.numberOfCartridges +=numberOfCartridges;
        } else {
            res = (this.numberOfCartridges + numberOfCartridges) - this.maxOfCartridges;
            this.numberOfCartridges = this.maxOfCartridges;
            System.out.println("Добавлено патронов: " + (numberOfCartridges - res));
            System.out.println("Кол-во лишних патрон: "  + res);
        }
        System.out.println("После перезарядки: " + this.numberOfCartridges);

        return res;
    }

    // Метод для проверки заряженности
    private boolean isCharged() {
        return this.numberOfCartridges > 0;
    }
    // Метод для того, чтобы узнать заряжен или нет
    public void chargedOrNotCharged() {
        if (isCharged()) {
            System.out.println("Пистолет заряжен!");
        } else {
            System.out.println("Пистолет разряжен!");
        }
    }

    // Метод для обнуления патронов
    public int unLoad() {
        int res = this.numberOfCartridges;
        System.out.println("Вы разрядили пистолет! Возвращено патронов: " + res);
        this.numberOfCartridges = 0;
        return res;
    }


}
