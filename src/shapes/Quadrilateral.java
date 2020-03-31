package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public Quadrilateral(double l, double w){ //constructor
        this.length = l;
        this.width = w;
    }

    // Getters
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    // Abstract Setters
    public abstract void setLength(double length);
    public abstract void setWidth(double width);
}
