package ru.safoev.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveList<T> {
  private List<T> L;
  private List<T> E;

  public RemoveList(List<T> L, List<T> E) {
    this.L = L;
    this.E = E;
  }

  public RemoveList() {
    L = new ArrayList<>();
    E = new ArrayList<>();
  }

  public List<T> getE() {
    if(this.E.isEmpty()) {
      System.out.println("Лист пуст!");
    }
    return E;
  }

  @Override
  public String toString() {
    return "RemoveList{" +
            "L=" + L +
            ", E=" + E +
            '}';
  }

  public void setE(List<T> e) {
    E = e;
  }

  public List<T> getL() {
    if(this.L.isEmpty()) {
      System.out.println("Лист пуст!");
    }
    return L;
  }

  public void setL(List<T> l) {
    L = l;
  }

  public void addListL(T element) {
    this.L.add(element);
  }

  public void addLisE(T element) {
    this.E.add(element);
  }

  public void getListElementL() {
    if(this.L.isEmpty()) {
      System.out.println("Лист пуст!");
    } else {
      for (int i = 0; i < this.L.size(); i++) {
        System.out.println(this.L.get(i));
      }
    }
  }

  public void getListElementE() {
    if(this.E.isEmpty()) {
      System.out.println("Лист пуст!");
    } else {
      for (int i = 0; i < this.E.size(); i++) {
        System.out.println(this.E.get(i));
      }
    }
  }

  public List<T> mainMethodList() {
    Iterator<T> iterator = L.iterator();
    while (iterator.hasNext()) {
      T element = iterator.next();
      if (E.contains(element)) {
        iterator.remove();
      }
    }
    return L;
  }

  public List<T> getListL() {
    if(this.L.isEmpty()) {
      System.out.println("Лист пуст!");
    }
    return new ArrayList<>(L);
  }

  public List<T> getListE() {
    if(this.E.isEmpty()) {
      System.out.println("Лист пуст!");
    }
    return new ArrayList<>(E);
  }


}
