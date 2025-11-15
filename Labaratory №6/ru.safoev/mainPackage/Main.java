package ru.safoev.mainPackage;

import ru.safoev.defaultPackage.DefaultHandler;
import ru.safoev.invokePackage.InvokeHandler;
import ru.safoev.toStringPackage.Client;
import ru.safoev.toStringPackage.ToStringHandler;
import ru.safoev.validatePackage.Test1;
import ru.safoev.validatePackage.ValidateHandler;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // Категория 1: Задание 1
        InvokeHandler.InvokeStart();
        // Категория 1: Задание 2
        DefaultHandler.DefaultStart();
        // Категория 1: Задание 3
        Client client = new Client("Далер", 19,"dsafoev40@gamil.com","+79655666091");
        System.out.println(ToStringHandler.toStringStart(client));
        // Категория 1: Задание 4
        ValidateHandler.ValidateStart(Test1.class);

  }
}
