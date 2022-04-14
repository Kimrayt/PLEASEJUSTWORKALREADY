package Creators;

import Figures.BlueCircle;
import Figures.BluePolygon;
import Figures.BlueTriangle;
import Figures.Point;
import Interfaces.iCircleFactory;
import Interfaces.iFigureFactory;
import Interfaces.iPolygonFactory;
import Interfaces.iTriangleFactory;

import java.util.ArrayList;

public abstract class BlueFigureFactory implements iFigureFactory {
    public BlueFigureFactory (){
        System.out.println("Painting figures blue...");
    }

    public iCircleFactory createCircle(ArrayList<Point> points){
        return new BlueCircle(points);
    }


    public iPolygonFactory createPolygon(ArrayList<Point> points) {
        return new BluePolygon(points);
    }


    public iTriangleFactory createTriangle(ArrayList<Point> points) {
        return new BlueTriangle(points);
    }
}
