package ru.safoev.validatePackage;

@Validate({String.class,Integer.class})
public class Test1 {
  private String title;
  private int duration;

  public Test1() {
    this.title = null;
    this.duration = 0;
  }

  public Test1(String title, int duration) {
    this.title = title;
    this.duration = duration;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  @Override
  public String toString() {
    return "Test1{" +
            "title='" + title + '\'' +
            ", duration=" + duration +
            '}';
  }
}
