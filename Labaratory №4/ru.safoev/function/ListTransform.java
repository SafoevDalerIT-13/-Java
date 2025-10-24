package ru.safoev.function;

import java.util.*;
import java.util.function.*;

public class ListTransform<T> {
    // Основной метод преобразования
    public static <T, P> List<P> transform(List<T> list, Functions<T, P> function) {
        List<P> result = new ArrayList<>();
        for (T item : list) {
            result.add(function.apply(item));
        }
        return result;
    }

    public static <T> List<T> test(List<T> list, Filter<T> function) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (function.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static <T> T reduce(List<T> list, Reduction<T> reducer) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не может быть пустым или null");
        }

        Iterator<T> iterator = list.iterator();
        T result = iterator.next();

        while (iterator.hasNext()) {
            result = reducer.reduce(result, iterator.next());
        }
        return result;
    }

    // НОВЫЙ метод коллекционирования
    public static <T, P extends Collection<T>> P collect(
            List<T> sourceList,
            Supplier<P> collectionFactory,
            BiConsumer<P, T> accumulator) {

        P result = collectionFactory.get();
        for (T item : sourceList) {
            accumulator.accept(result, item);
        }
        return result;
    }

    // Дополнительный метод для группировки
    public static <T, K, P extends Collection<T>, M extends Map<K, P>> M groupBy(
            List<T> sourceList,
            Supplier<M> mapFactory,
            Supplier<P> collectionFactory,
            Function<T, K> classifier) {

        M result = mapFactory.get();
        for (T item : sourceList) {
            K key = classifier.apply(item);
            P group = result.computeIfAbsent(key, k -> collectionFactory.get());
            group.add(item);
        }
        return result;
    }
}
