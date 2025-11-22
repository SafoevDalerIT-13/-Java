package ru.safoev.invokePackage;

public class TestInvoke {
  private int num = 1;

  @Invoke
  public void Test1() {
    System.out.println("Вызвали public void тест под номером один!");
    this.num = 2;
  }

  @Invoke
  public int Test2() {
    System.out.println("Вызвали public void тест под номером два!");
    return 232;
  }

  @Invoke
  public void Test3() {
    System.out.println("Вызвали public void тест под номером три!");
  }

  @Invoke
  public static void Test4() {
    System.out.println("Вызвали public static void тест под номером четыре!");
  }

  @Invoke
  private void Test5() {
    System.out.println("Вызвали private void тест под номером пять!");
  }

  @Invoke
  private static void Test6() {
    System.out.println("Вызвали private static void тест под номером шесть!");
  }

  @Invoke
  protected void Test7() {
    System.out.println("Вызвали protected void тест под номером семь!");
  }

  @Invoke
  protected static void Test8() {
    System.out.println("Вызвали protected static void тест под номером восемь!");
  }

  public int getNum() {
    return this.num;
  }

}
