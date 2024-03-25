package Solid;


import java.util.List;

public abstract class ShapesAreaCalculator {
    //depending on interfaces not implementations only to have more decoupled code
    public static double execute(List<Shape> shapes){
        double shapeSum = 0 ;
        for (Shape shape : shapes){
            shapeSum += shape.getArea();
        }
        return shapeSum;
    }
}
