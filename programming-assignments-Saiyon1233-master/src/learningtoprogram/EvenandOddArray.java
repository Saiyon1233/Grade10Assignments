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
 * Program: Assignment: Array Question 2
 * Processing: - Create 25 integers
 *             - Determine whether the integers are even or odd
 * Output: - Print the even integers together and the odd integers together
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
public class EvenandOddArray {

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
        //Initialize variables
        int num [] = new int [25];
        Random randnum = new Random();
        int i = 0;
        //Create integers
        for (i=0;i<25;i++) {
            int random = randnum.nextInt(99)+1;
            num[i] = random;
        }
        c.println("Even: ");
        //Create array for even numbers
        for (i=1;i<25;i++) {
            //When number is even
            if (num[i]%2 == 0) { 
                //Print array
                c.println(num[i]);
            }
        }
        c.println("Odd: ");
        //Create array for odd numbers
        for (i=1;i<25;i++) {
            //When number is odd
            if (num[i]%2 != 0) {
                //Print array
                c.println(num[i]);
            }
        }
        
    }
}
