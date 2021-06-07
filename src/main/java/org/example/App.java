package org.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;


public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x,y,z;
        System.out.print("How many people? ");
        x = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        y = input.nextInt();
        System.out.print("How many slices per pizza? ");
        z = input.nextInt();

        System.out.printf("%d people with %d pizzas (%d slices).%n", x,y,(y*z));

        int perperson = (y*z)/x;
        int left = (y*z)%x;
        System.out.printf("Each person gets %d pieces of pizza.%n", perperson);
        System.out.printf("There are %d leftover pieces.",left);



    }//end main method
}//end classB