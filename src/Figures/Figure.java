package Figures;

import java.util.ArrayList;

public abstract class Figure {

    public ArrayList<Point> points;

    public Figure (ArrayList<Point> points){
        this.points = points;
    }

    protected double getArea () {
        double area = 0;
        for (int i = 0; i < points.size(); i++) {
            int next = i+1 < points.size()? i+1 : 0;
            area += points.get(i).getX() * points.get(next).getY() - points.get(i).getY() * points.get(next).getX();
        }
        return Math.abs(area/2);
    }

    protected double getPerimeter () {
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            int next = i+1 < points.size()? i+1 : 0;
        perimeter += Math.sqrt(Math.pow(points.get(i).getX() - points.get(next).getX(),2) + Math.pow(points.get(i).getY() - points.get(next).getY(),2));
        }
        perimeter += Math.sqrt(Math.pow(points.get(points.size() - 1).getX() - points.get(0).getX(),2) + Math.pow(points.get(points.size() - 1).getY() - points.get(0).getY(),2));
        return perimeter;
    }

    public String toString() {
        return "Hi, I'm " + this.getClass().getSimpleName() + " with points: " + this.points;
    }
}
