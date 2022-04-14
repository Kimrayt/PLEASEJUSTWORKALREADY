package Figures;

import Interfaces.iCircleFactory;

import java.util.ArrayList;

public class YellowCircle extends Circle implements iCircleFactory {

    public YellowCircle(ArrayList<Point> points) {
        super(points);
    }
}
