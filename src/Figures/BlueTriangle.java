package Figures;

import Interfaces.iTriangleFactory;

import java.util.ArrayList;

public class BlueTriangle extends Triangle implements iTriangleFactory {
    public BlueTriangle(ArrayList<Point> points) {
        super(points);
    }
}
