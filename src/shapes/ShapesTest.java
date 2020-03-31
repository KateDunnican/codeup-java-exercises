package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        // Defined myShape as a Rectangle
        myShape = new Rectangle(4, 3);
        System.out.printf("Rectangle Area: %s\n", myShape.getArea());
        System.out.printf("Rectangle Perimeter: %s\n\n", myShape.getPerimeter());

        // Re-defined myShape as a Square
        myShape = new Square(5);
        System.out.printf("Square Area: %s\n", myShape.getArea());
        System.out.printf("Square Perimeter: %s\n", myShape.getPerimeter());
    }
}
