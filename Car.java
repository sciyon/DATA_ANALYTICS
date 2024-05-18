public class Car extends Vehicle {
  public Car(String brand) {
    super(brand); // Call the constructor of the superclass
  }

  @Override
  public void drive() {
    System.out.println("Driving a car.");
  }

  public static void main(String[] args) {
    Car myCar = new Car("Toyota");
    myCar.startEngine();
    myCar.drive();
    System.out.println("Brand: " + myCar.getBrand());
  }
}
