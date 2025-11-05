package ru.safoev.queue;

import java.util.*;

public class QueueReverse<T> {
  // Поля
  private Queue<T> L1;
  private List<T> reverseL1;
  private Queue<T> L2;

  // Конструкторы
  public QueueReverse() {
    this.L1 = new ArrayDeque<>();
    this.reverseL1 = new ArrayList<>();
    this.L2 = new ArrayDeque<>();
  }

  // Геттеры
  public Queue<T> getL1() {
    if (this.L1.isEmpty()) {
      System.out.println("Очередь L1 пустая!");
    }
    return this.L1;
  }

  public List<T> getReverseL1() {
    return this.reverseL1;
  }

  public Queue<T> getL2() {
    return this.L2;
  }

  // Сеттеры
  public void setL1(Queue<T> L1) {
    this.L1 = L1;
  }

  public void setReverseL1(List<T> reverseL1) {
    this.reverseL1 = reverseL1;
  }

  public void setL2(Queue<T> L2) {
    this.L2 = L2;
  }

  // Методы для добавления элементов
  public void addL1(T element) {
    this.L1.add(element);
  }

  // Основной метод для реверса очереди
  public void reverseQueueMethod() {
    if (this.L1.isEmpty()) {
      System.out.println("Очередь пуста!");
    } else {
      reverseL1 = new ArrayList<>(L1);
      L2.clear();
      for (int i = reverseL1.size() - 1; i >= 0; i--) {
        L2.add(reverseL1.get(i));
      }
    }
    System.out.println(L2);
  }

  // toString
  @Override
  public String toString() {
    return "QueueReverse{" +
            "L1=" + L1 +
            ", reverseL1=" + reverseL1 +
            ", L2=" + L2 +
            '}';
  }
}
