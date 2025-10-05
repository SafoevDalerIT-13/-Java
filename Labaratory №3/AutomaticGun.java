
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
    this.fireRate = maxOfCartridges / 2;
    if(this.fireRate < 0) {
      throw new IllegalArgumentException("Скорострельность должна быть положительна! ");
    }
  }

  // c) С указанием максимального количества патронов в обойме и скорострельности
  public AutomaticGun(int maxOfCartridges, int fireRate) {
    super(maxOfCartridges, maxOfCartridges);
    if (fireRate <= 0) {
      throw new IllegalArgumentException("Скорострельность должна быть положительным числом!");
    }
    this.fireRate = fireRate;
  }

  // Переопределяю метод fire()
  @Override
    public void fire() {
      for (int i = 0; i < this.fireRate;i++) {
       super.fire();
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

    for (int i = 0; i < totalShots; i++) {
      if (getNumberOfCartridges() > 0) {
        super.fire();
      } else {
        System.out.println("Патроны закончились на " + (i + 1) + " выстреле");
        break;
      }
    }
  }



}
