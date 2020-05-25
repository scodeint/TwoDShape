package com.example;

public class Rectangle {
    public static void areaOfRectangle(int l, int b){
        int area;
        area = l*b;
       System.out.println("Area of Rectangle ="+" "+area);
    }
    public static void perimeterOfRectangle(int l, int b){
        int perimeter;
        perimeter = 2*(l+b);
        System.out.println("The perimeter of the rectangle="+" "+perimeter);
    }
}
