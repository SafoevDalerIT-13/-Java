package ru.safoev.toStringPackage;

import java.lang.reflect.Field;

public class ToStringHandler {

    public static String toStringStart(Object object) throws IllegalAccessException {
        Class<?> classObject = object.getClass();
        StringBuilder clientString = new StringBuilder();

        if (!classObject.isAnnotationPresent(ToString.class)) {
            return "На классе нет аннотации ToString!";
        }

        clientString.append(classObject.getSimpleName()).append("{");

        ToString classAnnotation = classObject.getAnnotation(ToString.class);
        ToString.Mode defaultMode = classAnnotation.value();

        Field[] fields = classObject.getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            ToString.Mode fieldMode = defaultMode;

            // Если поле имеет свою аннотацию, используем её
            if (field.isAnnotationPresent(ToString.class)) {
                ToString fieldAnnotation = field.getAnnotation(ToString.class);
                fieldMode = fieldAnnotation.value();
            }

            if (fieldMode == ToString.Mode.YES) {
                field.setAccessible(true);
                Object value = field.get(object);

                if (!firstField) {
                    clientString.append(", ");
                }

                clientString.append(field.getName()).append("=").append(value);
                firstField = false;

            }
        }

        clientString.append("}");
        return clientString.toString();
    }
}
