package com.withos.Vectors;

public class Utility {
    public static void printVector() {
    }

    public static void printVector(Vector2D vector){
        Polar2DAdapter adapter = new Polar2DAdapter(vector);
        Double[] comp = vector.getComponents();
        System.out.println("Kartezjanskie: (0,0), (" + comp[0] + ", " + comp[1] + ")");
        System.out.println("Biegunowe:\tDl.: " + vector.abs() + "\tKat: " + Math.toDegrees(adapter.getAngle())+ "°");
    }

    public static void printVector(Polar2DAdapter vector){
        Double[] comp = vector.getComponents();
        System.out.println("Kartezjanskie: (0,0), (" + comp[0] + ", " + comp[1] + ")");
        System.out.println("Biegunowe:\tDl.: " + vector.abs() + "\tKat: " + Math.toDegrees(vector.getAngle())+ "°");
    }

    public static void printVector(_2DPolarInheritance vector){
        Double[] comp = vector.getComponents();
        System.out.println("Kartezjanskie: (0,0), (" + comp[0] + ", " + comp[1] + ")");
        System.out.println("Biegunowe:\tDl.: " + vector.abs() + "\tKat: " + Math.toDegrees(vector.getAngle()) + "°");
    }
    public static void printVector(Vector3DDecorator vector){
        Double[] comp = vector.getComponents();
        System.out.println("Kartezjanskie: (0,0,0), (" + comp[0] + ", " + comp[1] + ", " + comp[2] + ")");

    }

    public static void printVector(Vector3DInheritance vector){
        Double[] comp = vector.getComponents();
        System.out.println("Kartezjanskie: (0,0,0), (" + comp[0] + ", " + comp[1] + ", " + comp[2] + ")");
    }
}
