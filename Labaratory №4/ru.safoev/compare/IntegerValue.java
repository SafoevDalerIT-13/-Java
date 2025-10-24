package ru.safoev.compare;

public class IntegerValue implements Comparable<Integer> {
    // Поля
    private Integer item;

    // Конструкторы
    public IntegerValue() {
        this.item = null;
    }

    public IntegerValue(Integer item) {
        this.item = item;
    }

    // Геттеры и сеттеры
    public Integer getItem() {
        return this.item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    // Метод toString
    @Override
    public String toString() {
        return "Вы создали обьект с числом: " + this.item;
    }

    @Override
    public int compare(Integer item) {
        if(this.item == item) {
            System.out.println("0 - Равны");
        }
        if(this.item < item) {
            System.out.println("-1 - Вводимый обьект больше");
        }
        if(this.item > item) {
            System.out.println("1 - Вводимый обьект меньше");
        }
        return this.item.compareTo(item);
    }
}
