package com.example;

public class Sector {
    public static void area(int r, int tita){
        double area;
        area = (r*r*tita)/2;
        System.out.println(area);
    }
    public static void perimeter(double r, double tita, double l){
        double perimeter;
        l =( tita*2*3.143*r)/360;
        perimeter = r+r+l;
        System.out.println(perimeter);
    }
}
