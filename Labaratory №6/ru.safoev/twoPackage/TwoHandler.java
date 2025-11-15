package ru.safoev.twoPackage;

public class TwoHandler {
  public static void twoStart(Class<?> class1) {
    if(class1.isAnnotationPresent(Two.class)) {
      Two two = class1.getAnnotation(Two.class);
      String first = two.first();
      int second = two.second();
      System.out.println("Класс " + class1.getSimpleName() + " аннотирован @Two");
      System.out.println("first: \"" + first + "\"");
      System.out.println("second: " + second);
    } else {
      System.out.println("Класс " + class1.getSimpleName() + " не аннотирован @Two");
    }
  }
}

