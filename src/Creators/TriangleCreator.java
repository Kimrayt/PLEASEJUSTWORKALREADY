package Creators;

import Figures.BlueTriangle;
import Figures.Figure;
import Figures.Point;
import Figures.YellowTriangle;
import Interfaces.iFigureFactory;

import java.util.ArrayList;

public abstract class TriangleCreator implements iFigureFactory {

    public Figure create(ArrayList<Point> points, String color) {
        if (color == "blue"){
            return new BlueTriangle(points);
        }
        else if (color == "yellow") {
            return new YellowTriangle(points);
        }
        else {
            return null;
        }
    }
}
