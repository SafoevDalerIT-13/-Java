package ru.safoev.defaultPackage;

@Default(String.class)
public class TestDefault {

    @Default(String.class)
    private String name;

    public TestDefault() {
        this.name = null;
    }

    public TestDefault(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestDefault{" +
                "name='" + name + '\'' +
                '}';
    }
}
