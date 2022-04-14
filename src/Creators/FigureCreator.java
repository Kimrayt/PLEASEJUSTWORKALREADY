package Creators;

import Figures.Figure;
import Figures.Point;
import Figures.Polygon;
import Interfaces.iCircleFactory;
import Interfaces.iFigureFactory;
import Interfaces.iPolygonFactory;
import Interfaces.iTriangleFactory;

import java.util.ArrayList;

/*public class FigureCreator implements iFigureFactory {
    @Override
    public Figure create(ArrayList<Point> points, String color) {
        int nPoints = points.size();
        iFigureFactory creator;

        if (nPoints == 2) creator = new CircleCreator();
        else if (nPoints == 3) creator = new TriangleCreator();
        //else if (nPoints == 4) creator = new RectangleCreator();
        else if (nPoints >= 4) creator = new Polygon();
        else return null;

        return creator.create(points, color);
    }

    @Override
    public iCircleFactory createCircle() {
        return null;
    }

    @Override
    public iPolygonFactory createPolygon() {
        return null;
    }

    @Override
    public iTriangleFactory createTriangle() {
        return null;
    }
}*/
