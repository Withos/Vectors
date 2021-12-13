package com.withos.Vectors;

public class Vector2D implements IVector{
    private Double x;
    private Double y;

    public Vector2D(Double x1, Double y1){
        this.x=x1;
        this.y=y1;
    }
    @Override
    public Double[] getComponents() {
        return new Double[]{this.x, this.y};
    }

    @Override
    public Double abs() {
        return Math.sqrt(this.x*this.x+ this.y*this.y);
    }

    @Override
    public Double cdot(IVector param) {
        Double[] comp = this.getComponents();
        Double[] vec2 = param.getComponents();
        int i;
        double result = 0;
        if (vec2.length > comp.length)
            i = comp.length;
        else
            i = vec2.length;

        for (int j =0;j<i;j++)
            result+=comp[j]*vec2[j];
        return result;
    }
}
