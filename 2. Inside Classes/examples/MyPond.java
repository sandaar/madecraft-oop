package examples;

public class MyPond {
  public static void main(String[] args) {
    MyDuck mobyDuck = new  MyDuck("Moby", 90/3, "Celery");
    MyDuck wolfgangDuck = new MyDuck("Wolfgang", 60/3, "cheeseburgers");
    mobyDuck.waddle();
    mobyDuck.waddle();
    mobyDuck.waddle();
    mobyDuck.waddle();
    wolfgangDuck.waddle();

    System.out.println(mobyDuck);
  }
}
