package com.withos.Vectors;

public class Vector3DDecorator implements IVector {
    private IVector srcVector;
    private Double z;

    public Vector3DDecorator(IVector srcVec, Double z1){
        this.srcVector = srcVec;
        this.z = z1;
    }

    @Override
    public Double[] getComponents() {
        Double[] comp = srcVector.getComponents();
        return new Double[]{comp[0], comp[1], this.z};
    }

    @Override
    public Double abs() {
        Double[] comp = this.getComponents();
        return Math.sqrt(comp[0]*comp[0] + comp[1]*comp[1] + comp[2]*comp[2]);
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

    public Vector3DDecorator cross(IVector param){
        Double[] comp = this.getComponents();
        Double[] par = param.getComponents();

        if (par.length == 3)
            return new Vector3DDecorator(new Vector2D(comp[1]*par[2] - comp[2]*par[1], comp[2]*par[0] - comp[0]*par[2]), comp[0]*par[1] - comp[1]*par[0]);
        else
            return new Vector3DDecorator(new Vector2D(0 - comp[2]*par[1], comp[2]*par[0]), 0 - comp[1]*par[0]);
    }

    public IVector getSrc(){
        return this.srcVector;
    }
}
