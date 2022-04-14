package Figures;

import Interfaces.iTriangleFactory;

import java.util.ArrayList;

public class YellowTriangle extends Triangle implements iTriangleFactory {
    public YellowTriangle(ArrayList<Point> points) {
        super(points);
    }
}
