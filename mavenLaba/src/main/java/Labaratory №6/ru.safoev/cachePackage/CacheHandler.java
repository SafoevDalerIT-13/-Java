package ru.safoev.cachePackage;

public class CacheHandler {

  public static void startCache(Class<?> class1) {
    Cache cache = class1.getAnnotation(Cache.class);
    if (cache == null) {
      System.out.println("Класс " + class1.getSimpleName() + " не аннотирован @Cache");
      return;
    }
    String[] cacheAreas = cache.value();
    if (cacheAreas.length == 0) {
      System.out.println("Класс " + class1.getSimpleName() + ": список кешируемых областей пуст");
    } else {
      System.out.println("Класс " + class1.getSimpleName() + " - кешируемые области:");
      for (int i = 0; i < cacheAreas.length; i++) {
        System.out.println("  " + (i + 1) + ". " + cacheAreas[i]);
      }
    }
  }
}
