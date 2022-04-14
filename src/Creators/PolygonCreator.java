package Creators;

import Figures.BluePolygon;
import Figures.Figure;
import Figures.Point;
import Figures.YellowPolygon;
import Interfaces.iFigureFactory;

import java.util.ArrayList;

public abstract class PolygonCreator implements iFigureFactory {

    public Figure create(ArrayList<Point> points, String color) {
        if (color == "blue"){
            return new BluePolygon(points);
        }
        else if (color == "yellow") {
            return new YellowPolygon(points);
        }
        else {
            return null;
        }
    }
}
