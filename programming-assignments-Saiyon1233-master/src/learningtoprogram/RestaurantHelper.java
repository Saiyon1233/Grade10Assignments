/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtoprogram;

/**
 * Author: Saiyon Jeyakumar 
 * Class: ICS3U
 *
 * Program: Assignment 3 Question 2
 * Input: 
 *     3 - The bill total and the tip
 *     5 - The amount paid
 * Processing: 
 *     3 - Adding the Bill total and the tip together
 *     5 - Calculate Taxes
 * Output: 
 *     1 - An introduction for a restaurant and the amount owed
 *     5 - Print total with taxes
 *     5 - Print a response to the amount paid
 *
 */
//Import Statements Listed Alphabetically
import java.io.*;           //used for any type of input or output
import java.util.*;         //useful utilities like Scanner
import hsa.Console;
import hsa.*;

/**
 *
 * @author Admin
 */
public class RestaurantHelper {

    /**
     * * MAIN METHOD
     *
     **
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Starting...");
        Console c = new Console();
        Double tax = 0.00;
        Double amountpaid = 0.00;
        Double change = 0.00;
        //Ask user for the Bill total and tip
        c.println("What is your Bill Total?");
        Double billtotal = c.readDouble();
        c.println("How much tip are you willing to give?");
        Double tip = c.readDouble();
        //Find the total cost
        // When the cost of meal is or more than $4
        if (billtotal > 4) {
            tax = (billtotal * 0.18);
            billtotal = billtotal + tax;
        }
        // When the cost of meal is less than $4
        else {
            tax = (billtotal * 0.05);
            billtotal = billtotal + tax;
        }
        Double total = billtotal + tip;
        //Print the Restaurant's Introduction and the amount owed
        c.println("----------------------------------");
        c.println("Bob's Burgers");
        c.println("Home of the best burgers in town!");
        c.println("----------------------------------");
        c.println("***Your server was Saiyon Jeyakumar***");
        c.println("Served on");
        c.printDate();
        c.println();
        c.printTime();
        c.println();
        c.println("Cost of Meal: $" + billtotal);
        c.println("Taxes: $" + tax);
        c.println("Tip: $" + tip);
        c.println("Total: $" + total);
        //Ask user for the amount paid
        c.println("How much money are you paying?");
        amountpaid = c.readDouble();
        //When the user paid the as much as or more than the amount owed
        if (amountpaid >= total) {
            change = amountpaid - total;
            c.println("Your change is: $" + change);
        }
        else {
            double stillowe = total - amountpaid;
            c.println("Thief!!! You still owe: $" + stillowe);
        }
        
    }
}
