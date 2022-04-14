package com.company;

import Creators.FigureCreator;
import Figures.Figure;
import Figures.Point;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Point> pointsTriangle = new ArrayList<>();
        Point p1 = new Point (1, 3);
        Point p2 = new Point (2, 5);
        Point p3 = new Point (3, 6);
        Point p4 = new Point (4, 4);
        Point p5 = new Point (5, 5);
            pointsTriangle.add (p1);
            pointsTriangle.add (p2);
            pointsTriangle.add (p3);
            pointsTriangle.add (p4);
            pointsTriangle.add (p5);


        /*System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        pointOnAxis ap1 = new pointOnAxis(0, 0);
        System.out.println(ap1);

        Rectangle r = new Rectangle(p1,p2,p3,p4);
        System.out.println(r);
        System.out.println(r.getPerimeter());
        System.out.println(r.getArea());

        Triangle t = new Triangle(p1, p2, p3);
        System.out.println(t);
        System.out.println(t.getPerimeter());
        System.out.println(t.getArea());

        Figure f1 = new Triangle(p1, p2, p3);
        Figure f2 = new Rectangle(p1, p2, p3, p4);
        //Figure f3 = new Figure();
        //Figure f4 = (Figure)t; //Апкаст (повышение)
        //((Triangle)f4). //Даункаст (понижение)*/

    }
}
