package Creators;

import Figures.Figure;
import Figures.Point;
import Figures.BlueCircle;
import Figures.YellowCircle;
import Interfaces.iFigureFactory;

import java.util.ArrayList;

public abstract class CircleCreator implements iFigureFactory {

    public Figure create(ArrayList<Point> points, String color) {
        if (color == "blue"){
            return new BlueCircle(points);
        }
        else if (color == "yellow") {
            return new YellowCircle(points);
        }
        else {
            return null;
        }
    }
}
