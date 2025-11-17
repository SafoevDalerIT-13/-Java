package ru.safoev.twoPackage;

@Two(first = "1", second = 2)
public class TwoTest {
  private String first;
  private int second;

  public TwoTest() {
    this.first = null;
    this.second = 0;
  }

  public TwoTest(String first, int second) {
    this.first = first;
    this.second = second;
  }

  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  @Override
  public String toString() {
    return "TwoTest{" +
            "first='" + first + '\'' +
            ", second=" + second +
            '}';
  }
}
