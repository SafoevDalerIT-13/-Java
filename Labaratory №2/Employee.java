import java.util.List;

public class Employee {

  // Поля
  private String name;
  private Department department;


  //Геттеры и сеттеры
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

  //Конструкторы
  public Employee() {
    this.name = null;
    this.department = null;
  }

  public Employee(String name, Department department) {
    this.name = name;
    this.department = department;
    if (department != null) {
      department.addEmployee(this);
    }
  }

  //Метод to_string
  @Override
  public String toString() {
    String managerName = (department != null && department.getManager() != null)
            ? department.getManager().getName() : "не назначен";
    String departmentName = (department != null) ? department.getName1() : "не указан";

    return this.name + " работает в отделе " + departmentName
            + ", начальник которого " + managerName;
  }

  // Метод для получение всех сотрудников по ссылке
  public List<Employee> getAllDepartmentEmployees() {
    return department.getEmployees();
  }
}
