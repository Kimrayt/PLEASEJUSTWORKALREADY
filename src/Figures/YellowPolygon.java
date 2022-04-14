package Figures;

import Interfaces.iPolygonFactory;

import java.util.ArrayList;

public class YellowPolygon extends Polygon implements iPolygonFactory {

    public YellowPolygon(ArrayList<Point> points) {
        super(points);
    }
}
