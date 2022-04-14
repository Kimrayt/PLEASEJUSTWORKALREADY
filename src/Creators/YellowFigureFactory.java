package Creators;

import Figures.Point;
import Figures.YellowCircle;
import Figures.YellowPolygon;
import Figures.YellowTriangle;
import Interfaces.iCircleFactory;
import Interfaces.iFigureFactory;
import Interfaces.iPolygonFactory;
import Interfaces.iTriangleFactory;

import java.util.ArrayList;

public abstract class YellowFigureFactory implements iFigureFactory {
    public YellowFigureFactory (){
        System.out.println("Painting figures yellow...");
    }

    public iCircleFactory createCircle(ArrayList<Point> points){
        return new YellowCircle(points);
    }


    public iPolygonFactory createPolygon(ArrayList<Point> points) {
        return new YellowPolygon(points);
    }


    public iTriangleFactory createTriangle(ArrayList<Point> points) {
        return new YellowTriangle(points);
    }
}
