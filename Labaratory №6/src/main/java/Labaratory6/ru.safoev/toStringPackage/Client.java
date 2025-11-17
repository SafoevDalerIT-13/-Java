package ru.safoev.toStringPackage;

@ToString
public class Client {
    @ToString(ToString.Mode.YES)
    private String name;

    private int age;

    @ToString(ToString.Mode.YES)
    private String email;

    @ToString(ToString.Mode.NO)
    private String phone;

    public Client() {}

    public Client(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
