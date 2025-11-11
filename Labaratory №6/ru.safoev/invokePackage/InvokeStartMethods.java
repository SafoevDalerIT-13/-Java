package ru.safoev.invokePackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeStartMethods {
    public static void InvokeStart1() throws InvocationTargetException, IllegalAccessException {
        TestInvoke testInvoke = new TestInvoke();
        Class<?> classInvoke = testInvoke.getClass();

        Method[] methods = classInvoke.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(Invoke.class)) {
                method.setAccessible(true);
                System.out.print("Метод " + "\"" + method.getName() + "\""  + " (модификатор доступа: " + method.getModifiers() + ")" + " имеет аннотацию @Invoke, поэтому вызываем его: ");
                method.invoke(testInvoke);
                method.setAccessible(false);
            }
        }

    }
}
