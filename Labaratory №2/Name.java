public class Name {

  // Поля
  private String lastname; // Фамилия
  private String firstname; // Имя
  private String surname; // Отчество

  // Геттеры и сеттеры
  public String getLastname() {
    return this.lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstname() {
    return this.firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getSurname() {
    return this.surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  // Конструкторы
  public Name() {
    this.lastname = null;
    this.firstname = null;
    this.surname = null;
  }

  public Name(String firstname) {
    this.firstname = firstname;
  }

  public Name(String lastname, String firstname) {
    this.lastname = lastname;
    this.firstname = firstname;
  }

  public Name(String lastname, String firstname, String surname) {
    this.lastname = lastname;
    this.firstname = firstname;
    this.surname = surname;
  }

  // Метод to_string
  @Override
  public String toString() {
    String result = "";

    if (this.lastname != null && !this.lastname.isEmpty()) {
      result = this.lastname;
    }

    if (this.firstname != null && !this.firstname.isEmpty()) {
      if (result.isEmpty()) {
        result = this.firstname;
      } else {
        result += " " + this.firstname;
      }
    }

    if (this.surname != null && !this.surname.isEmpty()) {
      if (result.isEmpty()) {
        result = this.surname;
      } else {
        result += " " + this.surname;
      }
    }

    return result;
  }


  public String toString1() {
    String result = "";

    if (this.firstname != null && !this.firstname.isEmpty()) {
      result = this.firstname;
    }

    if (this.surname != null && !this.surname.isEmpty()) {
      if (result.isEmpty()) {
        result = this.surname;
      } else {
        result += " " + this.surname;
      }
    }

    if (this.lastname != null && !this.lastname.isEmpty()) {
      if (result.isEmpty()) {
        result = this.lastname;
      } else {
        result += " " + this.lastname;
      }
    }

    return result;
  }
}
