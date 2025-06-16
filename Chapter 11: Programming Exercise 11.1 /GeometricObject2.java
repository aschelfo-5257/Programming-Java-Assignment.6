public abstract class GeometricObject {
  private String color = "light blue"; // You can choose any type of color
  private boolean filled;

  // Default constructor
  protected GeometricObject() {
  }
  // Construct color & filled this. method
  protected GeometricObject (String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }
  // Getter method: color
  public String getColor() {
    return color;
  }
  // Setter method: color
  public void setColor(String color) {
    this.color = color;
  }
  // Getter method: filled
  public boolean isFilled() {
    return filled;
  }
  // Setter method: filled
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  // Abstract method by area and perimeter
  public abstract double GetArea();
  public abstract double GetPerimeter();

  // Color main method class
  public class ColorGeometricObject {
    public static void main (String[] args) {
      GeometricObject square = new square(4.0, "light blue", true);
      System.out.println("Area: " + square.GetArea());
      System.out.println("Perimeter: " + square.GetPerimeter());
      System.out.println("Color: " + square.getColor());
      System.out.println("Filled: " + square.isFilled());
    } 
}
