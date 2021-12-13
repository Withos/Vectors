package com.withos.Vectors;

public class Vector3DInheritance extends Vector2D{
    private double z;
    public Vector3DInheritance(Double x1, Double y1, Double z1){
        super(x1,y1);
        this.z = z1;
    }

    public Vector3DInheritance(Vector2D vector){
        super(vector.getComponents()[0], vector.getComponents()[1]);
        this.z = 0;

    }

    public Vector3DInheritance(_2DPolarInheritance vector){
        super(vector.getComponents()[0], vector.getComponents()[1]);
        this.z = 0;

    }

    @Override
    public Double[] getComponents() {
        Double[] comp = super.getComponents();
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

    public Vector3DInheritance cross(IVector param){
        Double[] comp = this.getComponents();
        Double[] par = param.getComponents();

        if (par.length == 3)
            return new Vector3DInheritance(comp[1]*par[2] - comp[2]*par[1], comp[2]*par[0] - comp[0]*par[2], comp[0]*par[1] - comp[1]*par[0]);
        else
            return new Vector3DInheritance(0 - comp[2]*par[1], comp[2]*par[0], 0 - comp[1]*par[0]);
    }

    public IVector getSrc(){
        Double[] comp = this.getComponents();
        return new Vector2D(comp[0], comp[1]);
    }
}
