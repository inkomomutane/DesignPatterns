package Solid;



public class Circle implements Shape {
    private final double ray;
    public Circle(double ray){
        this.ray  = ray;
    }
    @Override
    public double getArea() {
        return Math.PI  * Math.pow(this.ray,2);
    }
}
