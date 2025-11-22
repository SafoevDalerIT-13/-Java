package ru.safoev.validatePackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateHandlerTest {

  @Test
  void CorrectAnnotationTestMB() {
    Validate validate = ValidateTest.class.getAnnotation(Validate.class);
    Assertions.assertNotNull(validate);
    Class<?>[] validationClasses = validate.value();

    System.out.println("Класс " + ValidateTest.class.getSimpleName() + " имеет аннотацию @Validate");
    System.out.println("Количество классов для проверки: " + validationClasses.length);
    System.out.println("Список классов для проверки:");

    for (int i = 0; i < validationClasses.length; i++) {
      Class<?> currentClass = validationClasses[i];
      System.out.println((i + 1) + ". " + currentClass.getName() +
              " (простое имя: " + currentClass.getSimpleName() + ")");
    }

  }
  @Test
  void CorrectAnnotationTest() {
    Validate validate = ValidateTest.class.getAnnotation(Validate.class);
    Assertions.assertNotNull(validate);


    Class<?>[] validationClasses = validate.value();
    Assertions.assertEquals(2, validationClasses.length);
    Assertions.assertEquals(String.class, validationClasses[0]);
    Assertions.assertEquals(Integer.class, validationClasses[1]);
  }

  @Test
  void ExceptionTest() {
    IllegalArgumentException exception = Assertions.assertThrows(
            IllegalArgumentException.class, () -> ValidateHandler.ValidateStart(EmptyValidateTest.class)
    );

    assertEquals("Массив классов для валидации не может быть пустым!", exception.getMessage());
  }
}
