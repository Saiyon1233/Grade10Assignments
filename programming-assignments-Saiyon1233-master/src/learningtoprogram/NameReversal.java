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
 * Program: Assignment 8 Question 2 
 * Input: - Ask user for name
 * Processing: - Reverse the name
 * Output: - Print the new name
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
public class NameReversal {

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
        //Ask user for name
        c.println("Enter name here: ");
        String name = c.readLine().toLowerCase();
        //Initializing variables
        int length = name.length();
        int i = 0;
        String newname = "";
        //Reverse the name
        for (i=1;i<=length;i++) {
            char letter = name.charAt((length - i));
            newname =  newname + letter;
        }
        //Print the newly changed name
        c.println(newname);
    }
}
