public abstract class GeometricObject {
  private String color = "light blue";
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
}
