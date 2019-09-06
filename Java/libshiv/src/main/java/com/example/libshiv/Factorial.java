package com.example.libshiv;

import java.util.Scanner;

public class Factorial {
    //Factorial Java Program by using Constructor.

    int fact=1;

Factorial(){
    //Default Constructor
    System.out.println("Factorial = "+fact);
}
Factorial(int x){
    //Parameterized Constructor
    //Factorial Calculation
    for (int i = 1; i <= x; i++) {
        fact =fact*i;
    }
    System.out.println("Factorial= "+fact);
}
    public static void main(String[] args) {
        System.out.println("Enter no: ");
        //For taking input use Scanner
        Scanner scanner=new Scanner(System.in);
        //Take integer input using nextInt();
        int no=scanner.nextInt();
        //Check whether no is not zero if zero call Default Constructor.
        if(no==0){
            //Call Default Factorial
            Factorial first=new Factorial();
        }
        //if no is not zero and less than 8 call Parameterized Constructor.
        if(no>0 && no< 8){
            //Call Parameterized Factorial
            Factorial second=new Factorial(no);
        }
    }
}
