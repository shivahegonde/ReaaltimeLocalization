package com.example.libshiv;
import java.util.*;
public class MyClass {
    static double pi=3.14;
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Radious: ");
        double radious=scanner.nextDouble();
        double area=pi*radious*radious;
        System.out.printf("Area of Circle:  %f",area);
        System.out.println();
        System.out.printf("Area of Circle:  %d",(int)area/6);

    }
}
