package com.example;
import java.util.Scanner;
import java.awt.*;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("What 2D shape would you like to calculate:\n" +
                " 1 for Triangle\n" +
                " 2 for Rectangle\n" +
                " 3 for Ellipse\n" +
                " 4 for Trapezoid\n" +
                " 5 for Square\n" +
                " 6 for Parallelogram\n" +
                " 7 for Circle\n " +
                " 8 for Sector");
        System.out.println("Enter your desired 2D shape value");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

         int a = Integer.parseInt(s);
        if ( a == 1){
           // Get input from user and calculate area of triangle
            Scanner len = new Scanner(System.in);
            System.out.print("Enter base:");
            int num = len.nextInt();
            System.out.print("Enter height:");
            int num2 = len.nextInt();
            Triangle.areaOfTriangle(num,num2);

            //Get input from user and calculate perimeter of triangle
            System.out.print("Enter side A to calculate perimeter of the triangle:");
            int num3 = len.nextInt();
            System.out.print("Enter side B to calculate perimeter of the triangle:");
            int num4 = len.nextInt();
            System.out.print("Enter side C to calculate perimeter of the triangle:");
            int num5 = len.nextInt();
            Triangle.perimeterOfTriangle(num3,num4,num5);
        }
       else if(a == 2){
            // Get input from user and calculate area of rectangle
            Scanner len = new Scanner(System.in);
            System.out.print("Enter length:");
            int num = len.nextInt();
            System.out.print("Enter breath:");
            int num2 = len.nextInt();
            Rectangle.areaOfRectangle(num,num2);

            //Get input from user and calculate perimeter of rectangle
            System.out.print("Enter length to calculate the perimeter of rectangle:");
            int num3 = len.nextInt();
            System.out.print("Enter breath to calculate perimeter of the rectangle:");
            int num4 = len.nextInt();
            Rectangle.perimeterOfRectangle(num3,num4);
        }

       else if(a == 3){
            // Get input from user and calculate area of ellipse
            Scanner len = new Scanner(System.in);
            System.out.print("Enter  a :");
            int num = len.nextInt();
            System.out.print("Enter  b:");
            int num2 = len.nextInt();
            Ellipse.area(num,num2);
        }

       else if(a == 4){

            // Get input from user and calculate area of trapezoid
            Scanner len = new Scanner(System.in);
            System.out.print("Enter  area :");
            int num = len.nextInt();
            System.out.print("Enter  base:");
            int num2 = len.nextInt();
            System.out.print("Enter  height:");
            int num3 = len.nextInt();
            Trapezoid.area(num,num2,num3);

            //Get input from user and calculate perimeter of trapezoid
            System.out.print("Enter length to calculate the perimeter of trapezoid:");
            int num4 = len.nextInt();
            System.out.print("Enter breath to calculate perimeter of the trapezoid:");
            int num5 = len.nextInt();
            System.out.print("Enter length to calculate the perimeter of trapezoid:");
            int num6 = len.nextInt();
            System.out.print("Enter breath to calculate perimeter of the trapezoid:");
            int num7 = len.nextInt();
            Trapezoid.perimeter(num4,num5,num6,num7);
        }

       else if(a == 5){
            // Get input from user and calculate area of square
            Scanner len = new Scanner(System.in);
            System.out.print("Enter  length :");
            int num = len.nextInt();
            Square.area(num);

            //Get input from user and calculate perimeter of square
            System.out.print("Enter length to calculate the perimeter of square:");
            int num4 = len.nextInt();
            Square.perimeter(num4);
        }

       else if(a == 6){
            // Get input from user and calculate area of Parallelogram
            Scanner len = new Scanner(System.in);
            System.out.print("Enter  base :");
            int num = len.nextInt();
            System.out.print("Enter  height:");
            int num2 = len.nextInt();
            Parallelogram.area(num,num2);

            //Get input from user and calculate perimeter of parallelogram
            System.out.print("Enter length to calculate the perimeter of parallelogram:");
            int num4 = len.nextInt();
            System.out.print("Enter breath to calculate perimeter of the trapezoid:");
            int num5 = len.nextInt();
            Parallelogram.perimeter(num4,num5);
        }

       else if(a == 7){
            // Get input from user and calculate area of circle
            Scanner len = new Scanner(System.in);
            System.out.print("Enter  radius :");
            int num = len.nextInt();
            Circle.area(num);

            //Get input from user and calculate perimeter of circle
            System.out.print("Enter radius to calculate the perimeter of circle:");
            int num4 = len.nextInt();
            Circle.perimeter(num4);
        }

       else if(a == 8){
            // Get input from user and calculate area of sector
            Scanner len = new Scanner(System.in);
            System.out.print("Enter  radius :");
            int num = len.nextInt();
            System.out.print("Enter  tita:");
            int num2 = len.nextInt();
            Sector.area(num,num2);

            //Get input from user and calculate perimeter of trapezoid
            System.out.print("Enter radius to calculate the perimeter of sector:");
            int num4 = len.nextInt();
            System.out.print("Enter tita to calculate perimeter of the sector:");
            int num5 = len.nextInt();
            System.out.print("Enter length to calculate the perimeter of sector:");
            int num6 = len.nextInt();
            Sector.perimeter(num4,num5,num6);
        }

    }
}
