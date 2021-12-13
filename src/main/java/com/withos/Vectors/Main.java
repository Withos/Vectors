package com.withos.Vectors;

public class Main {


    public static void main(String[] args) {
        Vector2D v2D1 = new Vector2D(1.,1.);
        _2DPolarInheritance v2DPolar = new _2DPolarInheritance(2.,5.);
        Vector2D v2D2 = new Vector2D(7.,4.);

        System.out.println("Wektor 1:");
        Utility.printVector(v2D1);
        System.out.println("\nWektor 2:");
        Utility.printVector(v2DPolar);
        System.out.println("\nWektor 3:");
        Utility.printVector(v2D2);

        System.out.println("\nIloczyn skalarny 1 i 2: " + v2D1.cdot(v2DPolar));
        System.out.println("Iloczyn skalarny 2 i 3: " + v2DPolar.cdot(v2D2));
        System.out.println("Iloczyn skalarny 1 i 3: " + v2D1.cdot(v2D2));

        System.out.println("\nIloczyn wektorowy 1 i 2: ");
        Utility.printVector(new Vector3DDecorator(v2D1,0.).cross(new Vector3DDecorator(v2DPolar,0.)));
        System.out.println("\nIloczyn wektorowy 2 i 1: ");
        Utility.printVector(new Vector3DInheritance(v2DPolar).cross(new Vector3DInheritance(v2D1)));
        System.out.println("\nIloczyn wektorowy 2 i 3: ");
        Utility.printVector(new Vector3DDecorator(v2DPolar,0.).cross(new Vector3DDecorator(v2D2,0.)));
        System.out.println("\nIloczyn wektorowy 3 i 2: ");
        Utility.printVector(new Vector3DInheritance(v2D2).cross(new Vector3DInheritance(v2DPolar)));
        System.out.println("\nIloczyn wektorowy 1 i 3: ");
        Utility.printVector(new Vector3DDecorator(v2D1,0.).cross(new Vector3DDecorator(v2D2,0.)));
        System.out.println("\nIloczyn wektorowy 3 i 1: ");
        Utility.printVector(new Vector3DInheritance(v2D2).cross(new Vector3DInheritance(v2D1)));
    }

}
