package ru.safoev.map;

import java.util.*;

public class PeopleMap {
  private Map<String, Integer> surnameCount;
  private List<String> logins;

  public PeopleMap() {
    surnameCount = new HashMap<>();
    logins = new ArrayList<>();
  }

  public void processInput() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите количество учеников: ");
    int N = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < N; i++) {
      System.out.print("Введите Фамилию и Имя: ");
      String line = scanner.nextLine();
      String[] parts = line.split(" ");

      if (parts.length >= 2) {
        String lastname = parts[0];
        String name = parts[1];
        addPerson(lastname, name);
      }
    }

    scanner.close();
  }

  public void addPerson(String lastname, String name) {
    int count = surnameCount.getOrDefault(lastname, 0) + 1;
    surnameCount.put(lastname, count);

    String login = (count == 1) ? lastname : lastname + count;
    logins.add(login);
  }

  @Override
  public String toString() {
    return "PeopleMap{" +
            "surnameCount=" + surnameCount +
            ", logins=" + logins +
            '}';
  }

  public void printAllLogins() {
    for (String login : logins) {
      System.out.println(login);
    }
  }
}
