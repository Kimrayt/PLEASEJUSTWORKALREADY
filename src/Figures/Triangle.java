package Figures;

import java.util.ArrayList;

public class Triangle extends Figure{

    public Triangle(ArrayList<Point> points) {
    super(points);

    }

    /*public  double angleBetween2LinesTri() {
        double slope1 = x.getY() - y.getY() / x.getX() - y.getX();
        double slope2 = x.getY() - z.getY() / x.getX() - z.getX();
        double angle = Math.atan((slope1 - slope2) / (1 - (slope1 * slope2)));
        return angle;
    }
    public  double getArea (){
        double d1, d2, area;
        d1 = Math.sqrt(Math.pow(x.getX() - y.getX(), 2) + (Math.pow(x.getY() - y.getY(), 2)));
        d2 = Math.sqrt(Math.pow(x.getX() - z.getX(), 2) + (Math.pow(x.getY() - z.getY(), 2)));
        area = ((d1 * d2 * Math.sin(angleBetween2LinesTri()))/2);
        return area;
    }*/

}
