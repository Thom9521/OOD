package thom9521;

public class TestCircle {  // Save as "TestCircle.java"
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle(5.0);
        System.out.println(c1.toString());   // explicit call
        System.out.println();

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(1.2);
        System.out.println(c2.toString());  // explicit call
        System.out.println(c2);             // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + c2);  // '+' invokes toString() too
        System.out.println();

        Circle c4 = new Circle();   // construct an instance of Circle
        c4.setRadius(5.0);          // change radius
        System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
        c4.setColor("Green");        // Change color
        System.out.println("color is: " + c4.getColor());   // Print color via getter
        System.out.println();


    }
}