package ru.safoev.box;

import java.util.List;

public class BoxUtils {
    public static double findMaxValue(List<? extends Box<? extends Number>> boxes) {
        if (boxes == null || boxes.isEmpty()) {
            throw new IllegalArgumentException("Массив коробок не может быть пустым или null");
        }

        double max = Double.NEGATIVE_INFINITY;
        boolean foundValidValue = false;

        for (Box<? extends Number> box : boxes) {
            if (box != null && box.getItem() != null) {
                Number number = box.getItem();
                double value = number.doubleValue();

                if (value > max) {
                    max = value;
                }
                foundValidValue = true;
            }
        }

        if (!foundValidValue) {
            throw new IllegalArgumentException("Не найдено ни одного числа в коробках");
        }

        return max;
    }
}
