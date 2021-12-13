package com.withos.Vectors;

public class _2DPolarInheritance extends Vector2D{

    public _2DPolarInheritance(Double x1, Double y1){super(x1,y1);}
    public Double getAngle(){
        Double[] param = this.getComponents();
        if(param[0]>0)
            if(param[1]>=0)
                return Math.atan(param[1]/param[0]);
            else
                return Math.atan(param[1]/param[0]) + 2 * Math.PI;
        else if(param[0]<0)
            return Math.atan(param[1]/param[0]) + Math.PI;
        else
        if(param[1]>0)
            return Math.PI/2;
        else if (param[1]<0)
            return 3 * Math.PI/2;
        else
            return (double) 0;
    }
}
