package ru.safoev.mainPackage;

import ru.safoev.cachePackage.CacheHandler;
import ru.safoev.cachePackage.TestCache;
import ru.safoev.defaultPackage.DefaultHandler;
import ru.safoev.defaultPackage.TestDefault;
import ru.safoev.invokePackage.InvokeHandler;
import ru.safoev.invokePackage.TestInvoke;
import ru.safoev.toStringPackage.Client;
import ru.safoev.toStringPackage.ToStringHandler;
import ru.safoev.twoPackage.TwoHandler;
import ru.safoev.twoPackage.TwoTest;
import ru.safoev.validatePackage.ValidateTest;
import ru.safoev.validatePackage.ValidateHandler;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // Категория 1: Задание 1
        TestInvoke testInvoke = new TestInvoke();
        InvokeHandler.InvokeStart(testInvoke);
        // Категория 1: Задание 2
        DefaultHandler.DefaultStart(TestDefault.class);
        // Категория 1: Задание 3
        Client client = new Client("Далер", 19,"dsafoev40@gamil.com","+79655666091");
        System.out.println(ToStringHandler.toStringStart(client));
        // Категория 1: Задание 4
        ValidateHandler.ValidateStart(ValidateTest.class);
        // Категория 1: Задание 5
        TwoHandler.twoStart(TwoTest.class);
        // Категория 1: Задание 6
        CacheHandler.startCache(TestCache.class);

  }
}
