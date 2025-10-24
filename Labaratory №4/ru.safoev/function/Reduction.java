package ru.safoev.function;

public interface Reduction<T> {
    T reduce(T accumulator, T current);
}
