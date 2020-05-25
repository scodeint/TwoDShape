package com.example;

public class Triangle {

    public static void areaOfTriangle(int b, int h) {
        int area;
        area = (b * h) / 2;
        System.out.println("Area of triangle ="+" "+area);
    }

    public static void perimeterOfTriangle(int a, int b, int c) {
        int  perimeter;
        if(a+b<c){
            System.out.println("make sure a+b is greater than c");
        }
        else if(b+c<a){
            System.out.println("make sure b+c is greater than a");
        }

        else if(a+c<b){
            System.out.println("make sure a+c is greater than b");
        }

        else {
            System.out.println("The perimeter of the triangle="+" "+(a+b+c));
        }
    }
}





