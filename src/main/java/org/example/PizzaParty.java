package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class PizzaParty
{
    public static void main( String[] args )
    {
        //define variables
        int people, pizza, pizzaSlices, slicesTotal;
        Scanner input = new Scanner(System.in);

        //Get num people
        System.out.println("How many people?");
        people = input.nextInt();

        //Get num pizza
        System.out.println("How many pizzas do you have?");
        pizza = input.nextInt();

        //Get num slices
        System.out.println("How many slices per pizza?");
        pizzaSlices = input.nextInt();

        //Calculate num slices
        slicesTotal = pizza * pizzaSlices;

        //Print calculations
        System.out.println(people + " people with " +pizza+ " pizza (" +slicesTotal+ " slices)");
        System.out.println("Each person gets " + (slicesTotal / people) + " pieces of pizza.");
        System.out.println("There are " + (slicesTotal%people) + " leftover pieces.");

    }
}
