package shapes;

public class Square extends Quadrilateral{
    public double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }


// Code from Polymorph exercise:
//    protected int side;
//
//    public Square (int side){
//        //constructor calls Rectangle constructor and replaces "l" and "w" with "side"
//        super(side, side);
//        this.side = side;
//    }
//
//        @Override
//        public int getPerimeter(){
//            return (4 * side);
//        }
//
//        @Override
//        public int getArea() {
//            return (side * side);
//        }
}
