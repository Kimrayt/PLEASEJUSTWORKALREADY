package Figures;

import Interfaces.iCircleFactory;

import java.util.ArrayList;

public class BlueCircle extends Circle implements iCircleFactory {

    public BlueCircle(ArrayList<Point> points) {
        super(points);
    }
}
