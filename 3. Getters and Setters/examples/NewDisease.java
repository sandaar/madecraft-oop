package examples;

public class NewDisease {
  private boolean curable;
  private String name;

  public NewDisease(boolean curable, String name) {
    this.curable = curable;
    this.name = name;
  }

  public boolean isCurable() {
    return this.curable;
  }

  public String getName() {
    return name;
  }

  public void setCurable(boolean curable) {
    this.curable = curable;
  }

  public void setName(String name) {
    this.name = name;
  }
}
