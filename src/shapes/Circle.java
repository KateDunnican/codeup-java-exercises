package shapes;
public class Circle { // Circle CLASS

    private double radius;
    public static String description = "circles are round"; // CLASS variable, true for
                                                        // whole class, not instances

    public Circle (double x){ //constructor
        this.radius = x; //true for each INSTANCE (this creates an instance)
    }

        public double getArea(){ // INSTANCE method
            double area = Math.PI * (radius * radius);
            System.out.println("The area of the circle is: " + area);
            return area;
        }

        public double getCircumference(){ // INSTANCE method
            double circumf = 2 * Math.PI * radius;
            System.out.println("The circumference of the circle is: " + circumf);
            return circumf;
        }

}
