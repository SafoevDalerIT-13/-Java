public class Person {

    // Поля
    private String name;
    private int height;

    //Геттеры и сеттеры
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return  this.height;
    }

    // Конструкторы
    public Person() {
        this.name = null;
        this.height = 0;
    }

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    // Метод to_string
    @Override
    public String toString() {
        return this.name + ", рост: " + this.height;
    }

}
