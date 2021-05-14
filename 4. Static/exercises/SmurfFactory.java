package exercises;

public class SmurfFactory {
  public static void main(String[] args) {
    Smurf papa = Smurf.createSmurf("papa");
    Smurf papa2 = Smurf.createSmurf("papa");
    System.out.println(papa);
    System.out.println(papa2);
  }
}
