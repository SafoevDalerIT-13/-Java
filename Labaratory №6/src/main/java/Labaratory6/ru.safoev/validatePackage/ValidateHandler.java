package ru.safoev.validatePackage;

public class ValidateHandler {

  public static void ValidateStart(Class<?> classes) {
    if (classes.isAnnotationPresent(Validate.class)) {
      Validate validateAnnotation = classes.getAnnotation(Validate.class);
      Class<?>[] validationClasses = validateAnnotation.value();

      System.out.println("Класс " + classes.getSimpleName() + " помечен @Validate");
      System.out.println("Список классов для проверки:");

      for (int i = 0; i < validationClasses.length; i++) {
        Class<?> validationClass = validationClasses[i];
        System.out.println((i + 1) + ". " + validationClass.getName() +
                " (простое имя: " + validationClass.getSimpleName() + ")");
      }

      System.out.println("Всего классов: " + validationClasses.length);
    } else {
      System.out.println("Класс " + classes.getSimpleName() + " не аннотирован @Validate");
    }
  }
}
