public class Gun {
  // Поля
  private int numberOfCartridges;


  // Геттеры и сеттеры
  public int getNumberOfCartridges() {
    return this.numberOfCartridges;
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
  }

  public Gun(int numberOfCartridges) {
    setNumberOfCartridges(numberOfCartridges);

  }

  // Метод to_string
  @Override
  public String toString() {
    return "Вы создали пистолет с " + this.numberOfCartridges + " патронами";
  }

  // Метод для выстрела
  public void fire() {

    if(this.numberOfCartridges > 0) {
      this.numberOfCartridges -= 1;
      System.out.println("Бах!");
    }
    else {
      System.out.println("Клац!");
    }
  }
}
