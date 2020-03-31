package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double l, double w) {
        super(l, w);
    }

    @Override //from Measurable
    public double getPerimeter() {
        return ((length * 2) + (width * 2)); //length and width from Quadrilateral
    }

    @Override //from Measurable
    public double getArea() {
        return (length * width); //length and width from Quadrilateral
    }

    @Override
    public void setLength(double l) { //from Quadrilateral
        this.length = l;
    }

    @Override
    public void setWidth(double w) { //from Quadrilateral
        this.width = w;
    }
}

