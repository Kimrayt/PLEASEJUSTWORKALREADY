package Figures;

import Interfaces.iPolygonFactory;

import java.util.ArrayList;

public class BluePolygon extends Polygon implements iPolygonFactory {
    public BluePolygon(ArrayList<Point> points) {
        super(points);
    }
}
