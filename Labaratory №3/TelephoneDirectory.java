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
    public void deleteUser(String key) {
        if (this.telephoneName.containsKey(key)) {
            String name = telephoneName.get(key);
            telephoneName.remove(key);
            nameTelephone.remove(name);
        }
        if (this.nameTelephone.containsKey(key)) {
            String name1 = nameTelephone.get(key);
            nameTelephone.remove(key);
            telephoneName.remove(name1);
        }
    }

}
