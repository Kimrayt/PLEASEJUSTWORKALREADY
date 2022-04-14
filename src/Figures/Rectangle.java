package Figures;

import java.util.ArrayList;

public class Rectangle extends Figure{

    public Rectangle(ArrayList<Point> points) {
        super(points);
    }

    /*public Point getX() {
        return x;
    }
    public Point getY() {
        return y;
    }
    public Point getW() {
        return w;
    }
    public Point getZ() {
        return z;
    }
    public String toSting;

    @Override
    public String toString() {
        return "Rectangle:" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", w=" + w ;
    }
    public double getPerimeter (){
        double a, b, c, d, perimeter;
        a = Math.sqrt(Math.pow(x.getX() - y.getX(), 2) + (Math.pow(x.getY() - y.getY(), 2)));
        b = Math.sqrt(Math.pow(y.getX() - z.getX(), 2) + (Math.pow(y.getY() - z.getY(), 2)));
        c = Math.sqrt(Math.pow(z.getX() - w.getX(), 2) + (Math.pow(z.getY() - w.getY(), 2)));
        d = Math.sqrt(Math.pow(w.getX() - x.getX(), 2) + (Math.pow(w.getY() - x.getY(), 2)));
        perimeter = a+b+c+d;
        return perimeter;
    }
    public double angleBetween2LinesRect() {
        double slope1 = x.getY() - z.getY() / x.getX() - z.getX();
        double slope2 = y.getY() - w.getY() / y.getX() - w.getX();
        double angle = Math.atan((slope1 - slope2) / (1 - (slope1 * slope2)));
        return angle;
    }
    public double getArea (){
        double d1, d2, area;
        d1 = Math.sqrt(Math.pow(x.getX() - z.getX(), 2) + (Math.pow(x.getY() - z.getY(), 2)));
        d2 = Math.sqrt(Math.pow(y.getX() - w.getX(), 2) + (Math.pow(y.getY() - w.getY(), 2)));
        area = ((d1 * d2 * Math.sin(angleBetween2LinesRect()))/2);
        return area;
    }*/
}
