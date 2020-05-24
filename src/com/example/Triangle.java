package com.example;

public class Triangle {
    public static void main(String[] args) {
        areaOfTriangle(3, 4);
        perimeterOfTriangle(3, 5, 5);
        Rectangle rectangle = new Rectangle();
        Ellipse ellipse = new Ellipse();
        Trapezoid trapezoid = new Trapezoid();
        Square square = new Square();
        Parallelogram parallelogram = new Parallelogram();
        Circle circle = new Circle();
        Sector sector = new Sector();
        Rectangle.areaOfRectangle(3,5);
        Rectangle.perimeterOfRectangle(4,6);
        Ellipse.area(2,6);
        Trapezoid.area(2,3,4);
        Trapezoid.perimeter(2,3,4,5);
        Square.area(4);
        Square.perimeter(2);
        Parallelogram.area(5,8);
        Parallelogram.perimeter(3,7);
        Circle.area(7);
        Circle.perimeter(7);
        Sector.area(5,30);
        Sector.perimeter(5,30,7);

    }

    public static void areaOfTriangle(int b, int h) {
        int area;
        area = (b * h) / 2;
        System.out.println(area);
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
            System.out.println(a+b+c);
        }
    }
}





