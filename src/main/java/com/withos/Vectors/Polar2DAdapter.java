package com.withos.Vectors;

public class Polar2DAdapter implements IVector, IPolar2D{

    private Vector2D srcVector;

    public Polar2DAdapter(Vector2D vector){
        this.srcVector = vector;
    }

    @Override
    public Double abs() {
        return this.srcVector.abs();
    }

    @Override
    public Double cdot(IVector param) {
        return this.srcVector.cdot(param);
    }

    @Override
    public Double[] getComponents() {
        return this.srcVector.getComponents();
    }

    @Override
    public Double getAngle() {
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
