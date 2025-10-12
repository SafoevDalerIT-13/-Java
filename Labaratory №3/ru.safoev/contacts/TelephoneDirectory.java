package ru.safoev.contacts;

import java.util.*;

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

        if (telephone == null || name == null) {
            throw new IllegalArgumentException("Телефон и имя не могут быть null");
        }

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
    public String getPhone(String name) {
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

    // Узнаем текущее количество контактов
    public void sizeMap() {
        if (this.nameTelephone.isEmpty()) {
            System.out.println("Список пуст!");
        } else {
            System.out.println("Количество контактов: " + this.nameTelephone.size());
        }
    }

    // Полчучаем пары через массив
    public String[][] pairsArray() {
        int i = 0;
        String[][] pairs = new String[this.telephoneName.size()][2];
        if(this.telephoneName.isEmpty()) {
            System.out.println("Список пуст!");
        } else {
            for(Map.Entry<String,String> entry : this.telephoneName.entrySet()) {
                pairs[i][0] = entry.getKey();
                pairs[i][1] = entry.getValue();
                i++;
            }
        }
        System.out.println("Список всех пар: ");
        for (int i1 = 0; i1 < pairs.length; i1++) {
            for (int j = 0; j < pairs[i1].length; j++) {
                System.out.print(pairs[i1][j] + " ");
            }
            System.out.println();
        }
        return pairs;
    }

    // Получаем телефоны через массив
    public String[] telephoneArray() {
        int i =0;
        String[] pairs = new String[this.telephoneName.size()];
        for(Map.Entry<String,String> entry : this.telephoneName.entrySet()) {
            pairs[i] = entry.getKey();
            i++;
        }
        System.out.println("Список телефонов: ");
        for (int j = 0; j < this.telephoneName.size(); j++) {
            System.out.println(pairs[j]);
        }
        System.out.println();
        return pairs;
    }

    // Получаем именна через массив
    public String[] nameArray() {
        int i =0;
        String[] pairs = new String[this.telephoneName.size()];
        for(Map.Entry<String,String> entry : this.telephoneName.entrySet()) {
            pairs[i] = entry.getValue();
            i++;
        }
        System.out.println("Список имен: ");
        for (int j = 0; j < this.telephoneName.size(); j++) {
            System.out.println(pairs[j]);
        }
        System.out.println();
        return pairs;
    }

    // Массив имен, начинающихся с указанной строки
    public String[] namesArrayStartingWith(String prefix) {
        List<String> matchingNames = new ArrayList<>();

        for (String name : nameTelephone.keySet()) {
            if (name.toLowerCase().startsWith(prefix.toLowerCase())) {
                matchingNames.add(name);
            }
        }
        String[] result = matchingNames.toArray(new String[0]);

        if (result.length == 0) {
            System.out.println("Имена, начинающиеся с '" + prefix + "' не найдены");
        } else {
            System.out.println("Найдены имена, начинающиеся с '" + prefix + "':");
            for (int i = 0; i < result.length; i++) {
                System.out.println((i + 1) + ". " + result[i]);
            }
        }

        return result;
    }


}
