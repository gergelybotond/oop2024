package oop.labor02;

public class Rectangle {
    private double length;

    private double width;

    public Rectangle(double x, double y){
        length = x;
        width = y;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2*(length + width);
    }
}
