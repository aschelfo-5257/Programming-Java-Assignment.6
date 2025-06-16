public class Triangle extends GeometricObject {
  private double side1;
  private double side2;
  private double side3;

  // Construct Triangle Method Sides
  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }
  // Construct Side1 triangle method
  public double getSide1() {
    return side1;
  }
  // Construct Side2 triangle method
  public double getSide2() {
    return side2;
  }
  // Construct Side3 triangle method
  public double getSide3() {
    return side3;
  }
  public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  @Override
  public String toString() {
    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
  }
  // Triangle main method class
  public class TestTriangle {
    public static void main (String[] args) {
      Triangle t = new Triangle(4, 6, 8);
      System.out.println(t.getArea());
      System.out.println(t.getPerimeter());
      System.out.println(t);
    }  
  }
}
