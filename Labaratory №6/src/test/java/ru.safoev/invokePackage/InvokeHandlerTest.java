package ru.safoev.invokePackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class InvokeHandlerTest {

  private TestInvoke testInvoke;

  @BeforeEach
  public void createObject() {
    testInvoke = new TestInvoke();
  }

  @Test
  public void test1() {
    //Тут Ref API
    Class<?> invokeClass = testInvoke.getClass();
    Method[] methods = invokeClass.getDeclaredMethods();
    int initialNum = testInvoke.getNum();
    for (Method method : methods) {
      //Тут проверка без исключ
      if(method.isAnnotationPresent(Invoke.class)) {
        Assertions.assertDoesNotThrow(() -> {
          method.setAccessible(true);
          method.invoke(testInvoke);
       });

      }
    }
    //Тут отдельно сделал прверку метода на штуки
    Assertions.assertEquals(232,  testInvoke.Test2());

    Assertions.assertEquals(initialNum + 1, testInvoke.getNum());

  }

}
