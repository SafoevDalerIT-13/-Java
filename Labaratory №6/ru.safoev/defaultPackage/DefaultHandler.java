package ru.safoev.defaultPackage;

import java.lang.reflect.Field;

public class DefaultHandler {
    public static void DefaultStart(Class<?> class1) {

        Class<?> classDefault = class1.getClass();

        System.out.println("Имя класса: " + classDefault.getSimpleName());

        if (classDefault.isAnnotationPresent(Default.class)) {
            Default annotation = classDefault.getAnnotation(Default.class);
            Class<?> defaultClass = annotation.value();
            System.out.println("Класс имеет аннотацию @Default с типом: " + defaultClass.getSimpleName());
        } else {
            System.out.println("Класс не имеет аннотации @Default на типе");
        }

        Field[] fields = classDefault.getDeclaredFields();
        for (Field field : fields) {
            if(field.isAnnotationPresent(Default.class)) {
                System.out.println("Поле " + "\"" + field.getName() + "\"" + " имеет аннотацию @Default");
            }
        }
    }
}
