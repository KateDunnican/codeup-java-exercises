package shapes;

import org.w3c.dom.css.Rect;

public class Square extends Rectangle {

    public Square (int length, int width, int side){ //constructor
      super(length, width);
      this.length = side;
      this.width = side;
    }

}
