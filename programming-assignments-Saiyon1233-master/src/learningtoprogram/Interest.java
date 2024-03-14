/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtoprogram;

/**
  * Author: Saiyon Jeyakumar Class: ICS3U
 *
 * Program: Assignment 8 Question 3 
 * Input: - Ask user for deposit amount, interest rate and term in years 
 * Processing: - Find the ending balance of each year 
 * Output: - Print the year, starting balance, interest earned and the ending balance 
 *
 */
//Import Statements Listed Alphabetically
import java.io.*;           //used for any type of input or output
import java.util.*;         //useful utilities like Scanner
import hsa.Console;
import hsa.*;
import java.text.DecimalFormat;
/**
 *
 * @author Admin
 */
public class Interest {

    /**
     * * MAIN METHOD
     *
     **
     * @param args
     */
    public static void main(String[] args) {

        //FIRST WRITE YOUR PSEUDOCODE USING COMMENTS, THEN FILL IN WITH CODE
        System.out.println("Starting...");
        Console c = new Console();
        //Ask user for deposit amount, interest rate and term in years
        c.println("Enter deposit amount here: ");
        double depositamount = c.readDouble();
        c.println("Enter annual interest rate here: ");
        double interestrate = c.readDouble();
        c.println("Enter term in years here: ");
        int term = c.readInt();
        //Print table
        c.println("        Calculate the Interest on a deposit             ");
        c.println("        ===================================             ");
        c.println("             Starting         Interest         Ending   ");
        c.println(" Year         Balance           Earned        Balance   ");
        c.println(" ----         -------         --------        -------   ");
        //Initializing variables
        DecimalFormat df = new DecimalFormat("#.##");
        int i = 0;
        double startingbalance = 0.0;
        double intrestearned = 0.0;
        double endingbalance = depositamount;
        //Find the ending balance and print it along with the year, starting balance, and interest earned
        for (i=0;i<=(term - 1);i++) {
            int year = 2021 + i;
            startingbalance = endingbalance;
            intrestearned = startingbalance*(interestrate/100);
            df.format(intrestearned);
            endingbalance = startingbalance + intrestearned;
        c.println(" "+year+"          "+df.format(startingbalance)+"          "+df.format(intrestearned)+"           "+df.format(endingbalance));
        }
    }
}