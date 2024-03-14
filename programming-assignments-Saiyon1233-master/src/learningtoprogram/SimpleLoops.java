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
 * Program: Assignment 8 Question 1 
 * Input:
 * Processing: - Make loop to print even numbers from 4 to 30
 *             - Count backwards from 40 to 20
 *             - Count from 1 to 10, five times using a nested loop
 *             - Make a loop that goes from 1 to 30, but exits after 15
 * Output: - Print the counting variables
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
public class SimpleLoops {

    /**
     * * MAIN METHOD
     *
     **
     * @param args
     */
    public static void main(String[] args) {

        //FIRST WRITE YOUR PSEUDOCODE USING COMMENTS, THEN FILL IN WITH CODE
        System.out.println("Starting...");
        Console c = new Console(100,100);
        //Initialize variables
        int i = 0;
        int j = 0;
        //Print all even numbers from 4 to 30
        for (i=4;i<=30;i=i+2) {
            c.println(i);
        }
        //Count backwards from 40 to 20
        for (i=40;i>=20;i--) {
            c.println(i);
        }
        //Count from 1 to 10, five times using a nested loop
        for (i=1;i<=5;i++) {
            for (j=1;j<=10;j++) {
                c.println(j);
            }
        }
        //Make a loop that goes from 1 to 30, but exits after 15
        for (i=1;i<=30;i=i+1) {
            c.println(i);
            //When i is euqal to 15
            if (i == 15) {
                break;
            }
        }
    }
}
