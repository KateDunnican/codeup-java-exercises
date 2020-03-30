package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle (int l, int w){ //constructor
        this.length = l;
        this.width = w;
    }

        public int getPerimeter(){
            return ((2*length)+(2*width));
        }

        public int getArea(){
            return (length * width);
        }
}
