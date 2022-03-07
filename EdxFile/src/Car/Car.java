package Car;

public class Car {
    String color;
    int topSpeed;

    public Car(String color, int topSpeed) {
      this.color = color;
      this.topSpeed = topSpeed;
    }
  
    public static void main(String[] args) {
      Car c1 = new Car("Blue",200);
      Car c2 = new Car("Red",180);
      Car c3 = new Car("Black",240);
      c1.color = "Gold";
      c2.color = "Blue";
      c3.color = "Red";
      
      System.out.println("c2 color: " + c2.color);
      
    }
  }