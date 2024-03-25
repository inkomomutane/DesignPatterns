package Solid;

public class Cube implements ThreeDimentionalShape,Shape{

    private final double side;

    public Cube(double side){
        this.side  = side;
    }

    @Override
    public double volume() {
        return Math.pow(side,3);
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(side,2);
    }
}
