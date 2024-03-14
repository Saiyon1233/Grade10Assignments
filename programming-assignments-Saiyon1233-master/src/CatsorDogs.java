/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Author:  Saiyon Jeyakumar
 * Class:   ICS3U
 *
 * Program: Assignment 5 Question 5
 * Input: - Ask user for number
 * Processing: - Determine whether the person is a cat or dog person
 * Output: Print whether the person is a cat or dog person
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
public class CatsorDogs {

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
        //Ask user for input
        c.println("Do you prefer to stay at home alone or go out?");
        c.println("Enter 1 or 2");
        int firstchoice = c.readInt();
        //When user enters 1
        if (firstchoice == 1) {
            //Ask user for another input
            c.println("Do you prefer to read a book or watch tv?");
            c.println("Enter 1 or 2");
            int secondchoice = c.readInt();
            //When user enters 1
            if (secondchoice == 1) {
                c.println("You are a siamese cat person.");
            }
            //When user enters 2
            else if (secondchoice == 2) {
                c.println("You are a cheshire cat person.");
            }
        }
        //When user enters 2
        else if (firstchoice == 2) {
            //Ask user for another input
            c.println("Do you prefer to go to a jazz bar or a wild party?");
            c.println("Enter 1 or 2");
            int secondchoice2 = c.readInt();
            //When user enters 1
            if (secondchoice2 == 1) {
                c.println("You are a poodle person.");
            }
            //When user enters 2
            else if (secondchoice2 == 2) {
                c.println("You are a beagle person.");
            }
        }
    }
}
