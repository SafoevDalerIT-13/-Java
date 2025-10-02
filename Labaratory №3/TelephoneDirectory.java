import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
  // Поля
  private Map<String,String> telephoneName;
  private Map<String,String> nameTelephone;

  // Геттеры и сеттеры
  public Map<String,String> getTelephoneName() {
    return this.telephoneName;
  }

  public Map<String,String> getNameTelephone() {
    return this.nameTelephone;
  }

  public void setTelephoneName(String telephone, String name) {
    this.telephoneName.put(telephone, name);
    this.nameTelephone.put(name, telephone);
  }

  // Конструкторы
  public TelephoneDirectory() {
    this.telephoneName = new HashMap<>();
    this.nameTelephone = new HashMap<>();
  }

  // Метод toString
  @Override
  public String toString() {
    if (telephoneName.isEmpty()) {
      return "Телефонный справочник пуст";
    }

    String result = "Телефонный справочник\n";
    for (Map.Entry<String, String> entry : telephoneName.entrySet()) {
      result += "Номер телефона - " + entry.getKey() + " Имя - " + entry.getValue() + "\n";
    }
    return result;
  }

  // Метод добавления User
  public String addNewUser(String telephone, String name) {
    String oldPhone = null;

    if (nameTelephone.containsKey(name)) {
      oldPhone = nameTelephone.get(name);

      telephoneName.remove(oldPhone);
      nameTelephone.remove(name);
    }

    telephoneName.put(telephone, name);
    nameTelephone.put(name, telephone);

    return oldPhone;
  }
  // Метод удаления user
  public void deleteUser(String name) {
    if (this.nameTelephone.containsKey(name)) {
      String phone = nameTelephone.get(name);
      nameTelephone.remove(name);
      telephoneName.remove(phone);
    }
  }

  // Метод получения данных
  public String findUser(String name) {
    return nameTelephone.get(name);
  }

  // Метод проверки наличия телефона или имени
  public void checkExists(String key) {
    boolean isPhone = telephoneName.containsKey(key);
    boolean isName = nameTelephone.containsKey(key);

    if (isPhone) {
      System.out.println("Телефон '" + key + "' есть в списке. Имя: " + telephoneName.get(key));
    } else if (isName) {
      System.out.println("Имя '" + key + "' есть в списке. Телефон: " + nameTelephone.get(key));
    } else {
      System.out.println("'" + key + "' не найден ни как телефон, ни как имя");
    }
  }

  // Узнаем текущее кол-во контактов
  // Узнаем текущее количество контактов
  public void sizeMap() {
    if (this.nameTelephone.isEmpty()) {
      System.out.println("Список пуст!");
    } else {
      System.out.println("Количество контактов: " + this.nameTelephone.size());
    }
  }





}
