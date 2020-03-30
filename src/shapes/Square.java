package shapes;

import java.lang.invoke.SwitchPoint;

public class Square extends Rectangle {

    protected int side;

    public Square (int side){
        //constructor calls Rectangle constructor and replaces "l" and "w" with "side"
        super(side, side);
        this.side = side;
    }

        @Override
        public int getPerimeter(){
            return (4 * side);
        }

        @Override
        public int getArea() {
            return (side * side);
        }
}
