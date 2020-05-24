package com.example;

public class Trapezoid {
    public static void area(int a, int b, int h){
        int area;
        area = ((a+b)+h)/2;
        System.out.println(area);
    }
    public static void perimeter(int a, int b, int c, int d){
        int perimeter;
        perimeter = a + b + c + d;
        System.out.println(perimeter);
    }
}
