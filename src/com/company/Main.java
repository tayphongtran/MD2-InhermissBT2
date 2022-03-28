package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point2D point2D = new Point2D();
        point2D.setX(5);
        point2D.setY(10);
        System.out.println(point2D);

        Point3D point3D = new Point3D(point2D.getX(), point2D.getY(),15);
        System.out.println(point3D);
        point3D.getXYZ();
        System.out.println(point3D.getXYZ());//test
    }
}
