package ru.safoev.weapon;

public class Shooter {
    // Поля
    private String name;
    private Weapon weapon;

    //Геттеры и сеттеры
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    //Конструкторы
    public Shooter(String name) {
        this.name = name;
        this.weapon = null;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Shooter(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    //Метод toString
    @Override
    public String toString() {
        return "Вы создали Стрелка с именем - " + getName();
    }

    // Основная способность - стрелять
    public void shoot() {
        if(weapon != null) {
            System.out.print(name + " стреляет: ");
            weapon.shoot();
        } else {
            System.out.println(name + ": не могу участвовать в перестрелке");
        }
    }




}
