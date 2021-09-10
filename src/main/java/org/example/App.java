package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int people, pizzas, slicesPerPizza, totalSlices, slicesPerPerson, leftOver;

        System.out.println( "How many people? " );
        people = scanner.nextInt();

        System.out.println( "How many pizzas do you have? " );
        pizzas = scanner.nextInt();

        System.out.println( "How many slices per pizza? " );
        slicesPerPizza = scanner.nextInt();

        totalSlices = slicesPerPizza * pizzas;
        slicesPerPerson = totalSlices / people;
        leftOver = totalSlices % people;

        System.out.println
                (
                people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)\n" +
                "Each person gets " + slicesPerPerson + " pieces of pizza.\n" +
                "There are " + leftOver + " leftover pieces."
                );
    }
}
