package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args){
        Input userInput = new Input();
        double userRadius = userInput.getDouble();

        System.out.println(Circle.description);

        Circle circle = new Circle(userRadius);
            circle.getArea();
            circle.getCircumference();
    }
}