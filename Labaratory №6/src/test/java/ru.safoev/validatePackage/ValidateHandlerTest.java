package ru.safoev.validatePackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateHandlerTest {
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
