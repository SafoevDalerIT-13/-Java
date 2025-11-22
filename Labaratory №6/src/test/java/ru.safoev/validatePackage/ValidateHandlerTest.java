package ru.safoev.validatePackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестовый класс для проверки работы аннотации @Validate и обработчика ValidateHandler.
 * Содержит тесты для проверки корректности аннотации, извлечения значений
 * и обработки исключительных ситуаций.
 *
 * @author DalerSafoevIT-13
 * @version 1.0
 * @since 2025
 */
class ValidateHandlerTest {

  /**
   * Тест для проверки корректности аннотации @Validate с выводом подробной информации.
   * Проверяет наличие аннотации и выводит детальную информацию о классах валидации
   * в консоль для отладки и демонстрации.
   */
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

  /**
   * Тест для проверки корректности аннотации @Validate.
   * Проверяет наличие аннотации, количество классов валидации
   * и соответствие ожидаемым типам классов.
   */
  @Test
  void CorrectAnnotationTest() {
    Validate validate = ValidateTest.class.getAnnotation(Validate.class);
    Assertions.assertNotNull(validate);

    Class<?>[] validationClasses = validate.value();
    Assertions.assertEquals(2, validationClasses.length);
    Assertions.assertEquals(String.class, validationClasses[0]);
    Assertions.assertEquals(Integer.class, validationClasses[1]);
  }

  /**
   * Тест для проверки обработки исключительной ситуации при пустом массиве классов.
   * Проверяет, что при вызове ValidateHandler с классом, имеющим пустой массив
   * классов валидации, выбрасывается исключение с корректным сообщением.
   */
  @Test
  void ExceptionTest() {
    IllegalArgumentException exception = Assertions.assertThrows(
            IllegalArgumentException.class, () -> ValidateHandler.ValidateStart(EmptyValidateTest.class)
    );

    assertEquals("Массив классов для валидации не может быть пустым!", exception.getMessage());
  }
}
