/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtoprogram;

/**
 * Author: Saiyon
 * Class: ICS3U
 *
 * Program: Assignment: Array Question 1
 * Input: - Ask user for how long the array will be
 *        - Ask user for numbers for arrays
 * Processing: - Fill array with user's numbers 
 * Output: - Print array backwards
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
public class ArrayAssignment {

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
        //Ask user how many numbers
        c.println("How many numbers will you enter?");
        int count = c.readInt();
        int i;
        //Create array
        int[] values = new int [count];
        for (i=0;i<count;i++) {
            //Ask user for numbers
            c.println("Enter a number here: ");
            int num = c.readInt();
            //Fill array
            values[i] = num;
        }
        //Print arrays backward
        for (i=count-1;i>=0;i--) {
            c.println(values[i]);
        }    
    }
}
