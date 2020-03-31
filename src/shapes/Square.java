package shapes;

public class Square extends Quadrilateral{
    public double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override // from Measurable
    public double getPerimeter() {
        return side * 4;
    }

    @Override // from Measurable
    public double getArea() {
        return side * side;
    }

    @Override
    public void setLength(double length) { //from Quadrilateral
        this.length = length;
    }

    @Override
    public void setWidth(double width) { //from Quadrilateral
        this.width = width;
    }

}
