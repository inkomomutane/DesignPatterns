package Solid;


import java.util.List;

public class Main {
    public static void main (String [] args) {
        // Liskov -  every child class should be substituted buy their base or parent class
        Shape circle = new Circle(10);
        Shape square = new Square(9);
        Shape cube  =  new Cube(12);

        List<Shape> shapes = List.of(circle,square,cube);

        // Single  responsibility  - every class should have only one job responsible for
        // Open close  - and every class should be open to extension and close to modification
        //
        final double  shapesSum = ShapesAreaCalculator.execute(shapes);

        System.out.println(shapesSum);
    }
}