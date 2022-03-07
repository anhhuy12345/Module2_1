package Ke_thua.Baitap;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI*getRadius()*2*height;
    }

    @Override
    public String toString() {
        return "A Cylinder with volume = " + getVolume() + " is subclass of " + super.toString();
    }