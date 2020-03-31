package shapes;

public class ShapesTest {

    public Measurable myShape = new Measurable() {
        @Override
        public double getPerimeter() {
            return 0;
        }

        @Override
        public double getArea() {
            return 0;
        }
    };

    Square mySquare = new Square(5);
    Rectangle myRectangle = new Rectangle(4, 3);


// Code from Polymorph exercise:
//    public static void main(String[] args) {
//
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());     //18
//        System.out.println(box1.getArea());          //20
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());     //20
//        System.out.println(box2.getArea());          //25
//    }
}
