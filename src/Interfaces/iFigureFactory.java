package Interfaces;

public interface iFigureFactory {

    iCircleFactory createCircle();
    iPolygonFactory createPolygon();
    iTriangleFactory createTriangle();

}
