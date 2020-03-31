package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double l, double w) {
        super(l, w);
    }

    @Override
    public double getPerimeter() {
        return ((length * 2) + (width * 2));
    }

    @Override
    public double getArea() {
        return (length * width);
    }

    @Override
    public void setLength(double l) {
        this.length = l;
    }

    @Override
    public void setWidth(double w) {
        this.width = w;
    }


// Code from Polymorph exercise:
//    protected int length;
//    protected int width;
//
//    public Rectangle (int l, int w){ //constructor
//        this.length = l;
//        this.width = w;
//    }
//
//        public int getPerimeter(){
//            return ((2*length)+(2*width));
//        }
//
//        public int getArea(){
//            return (length * width);
//        }
}

