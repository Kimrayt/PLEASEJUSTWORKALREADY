package Figures;

import Figures.Point;

public class pointOnAxis extends Point {

    private String axis;

    public pointOnAxis (double x, double y){
        super(x, y);
        if (x==0 && y==0){
            this.axis = "Center";
        }
            else if (x==0){
                this.axis="y point";
            }
            else if (x==0){
                this.axis = "x point";
        }
            else {
                this.axis = "???";
        }

    }
    public String toString(){
        return "I'm an axisPoint!";
    }
}
