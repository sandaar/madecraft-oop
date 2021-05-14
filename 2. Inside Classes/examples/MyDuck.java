package examples;

public class MyDuck {

  // member variables
  private String name;
  private int lifeExpectancy;
  private String favoriteFood;

  public MyDuck(String name, int lifeExpectancy, String favoriteFood) {
    this.name = name;
    this.lifeExpectancy = lifeExpectancy;
    this.favoriteFood = favoriteFood;
  }

  // medthods
  void waddle() {
    lifeExpectancy++;
    System.out.println(this.name + " is waddling");
  }

  void quack() {
    System.out.println("quack");
  }

  @Override
  public String toString() {
    return "My name is " + name + " I like to eat " + favoriteFood +
        " lifeExpectancy: " + lifeExpectancy;
  }
}
