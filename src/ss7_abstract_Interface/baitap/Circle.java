package Abstract_Interface.baitap;

public class Circle extends Abstract_Interface.baitap.Shape implements Abstract_Interface.baitap.Resizeable {
    private double radius = 2.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSize() {
        return radius;
    }

    public void setSize(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius = radius + radius*percent/100;
    }

    @Override
    public String display() {
        return "A Circle with radius = " + radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}