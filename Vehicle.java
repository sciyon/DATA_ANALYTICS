public abstract class Vehicle {
  protected Vehicle(String brand) {
      this.brand = brand;
  }

  private String brand;

  public void startEngine() {
      System.out.println("Engine started.");
  }
  public abstract void drive();

  public String getBrand() {
      return brand;
  }
}


