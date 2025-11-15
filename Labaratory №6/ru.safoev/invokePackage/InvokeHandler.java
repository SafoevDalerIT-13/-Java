package ru.safoev.invokePackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeHandler {
    public static void InvokeStart(Object object) throws InvocationTargetException, IllegalAccessException {
        Class<?> classInvoke = object.getClass();

        Method[] methods = classInvoke.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(Invoke.class)) {
                method.setAccessible(true);
                System.out.print("Метод " + "\"" + method.getName() + "\""  + " (модификатор доступа: " + method.getModifiers() + ")" + " имеет аннотацию @Invoke, поэтому вызываем его: ");
                method.invoke(object);
                method.setAccessible(false);
            }
        }

    }
}
